package br.udesc.pro2.exercicio.banco.mvc.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.udesc.pro2.exercicio.banco.mvc.controlador.ControladorNovaConta;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.ContaException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverNovaConta;

@SuppressWarnings("serial")
public class TelaNovaConta extends JFrame implements ObserverNovaConta {

    private JPanel contentPane;
    private JTextField textNomeCorrentista;
    private JComboBox<String> cbTipoConta;
    private JComboBox<Banco> cbBanco;
    private JButton btnSalvar;

    private ControladorNovaConta cnc;
    
    public TelaNovaConta() {
        init();
        cnc = new ControladorNovaConta();
        cnc.anexar(this);
        cnc.atualizaInfo();
        
        btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					validarCampos();
					cnc.salvarConta(getNomeCorrentista(), getTipoConta(), getBanco());
				} catch (Exception e1) {
					e1.getMessage();
				}
				
			}
		});
    }
    
    public void validarCampos() throws ContaException {
    	if(textNomeCorrentista.getText().isBlank()) {
    		throw new ContaException("Nome do Correntista vazio");
    	}
    }
    
    public String getNomeCorrentista(){
        return textNomeCorrentista.getText();
    }
    
    public String getTipoConta(){
        return cbTipoConta.getSelectedItem().toString();
    }
    
    
    public Banco getBanco(){
        return (Banco) cbBanco.getSelectedItem();
    }
    
    @Override
    public void listaBancos(List<Banco> bancos){
        for (Banco banco : bancos) {
            cbBanco.addItem(banco);
        }
    }
        
    public void init() {
        setTitle("Nova Conta");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 237, 259);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNomeCorrentista = new JTextField();
        textNomeCorrentista.setBounds(24, 137, 157, 20);
        contentPane.add(textNomeCorrentista);
        textNomeCorrentista.setColumns(10);

        cbBanco = new JComboBox<Banco>();
        
        cbBanco.setBounds(24, 41, 157, 20);
        contentPane.add(cbBanco);

        cbTipoConta = new JComboBox<String>();
        cbTipoConta.addItem("Conta Poupança");
        cbTipoConta.addItem("Conta Corrente");

        cbTipoConta.setBounds(24, 89, 157, 20);
        contentPane.add(cbTipoConta);

        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(24, 168, 89, 23);
        contentPane.add(btnSalvar);

        JLabel lblSelecioneOBanco = new JLabel("Banco");
        lblSelecioneOBanco.setBounds(24, 28, 134, 14);
        contentPane.add(lblSelecioneOBanco);

        JLabel lblSelecioneOTipo = new JLabel("Tipo de conta");
        lblSelecioneOTipo.setBounds(24, 72, 179, 14);
        contentPane.add(lblSelecioneOTipo);

        JLabel lblNomeDoCorrentista = new JLabel("Nome do correntista");
        lblNomeDoCorrentista.setBounds(24, 120, 157, 14);
        contentPane.add(lblNomeDoCorrentista);
    }

	@Override
	public void exibirMensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);
		
	}

	@Override
	public void limpar() {
		textNomeCorrentista.setText("");
		
	}



}
