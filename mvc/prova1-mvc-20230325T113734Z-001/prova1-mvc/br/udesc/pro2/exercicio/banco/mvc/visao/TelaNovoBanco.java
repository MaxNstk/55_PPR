package br.udesc.pro2.exercicio.banco.mvc.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.udesc.pro2.exercicio.banco.mvc.controlador.ControladorNovoBanco;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.BancoException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.observers.Observador;

@SuppressWarnings("serial")
public class TelaNovoBanco extends JFrame implements Observador {

    private JPanel contentPane;
    private JTextField textNomeBanco;
    private JButton btnSalvar;
    
    private ControladorNovoBanco cnb;

    public TelaNovoBanco() {
        init();
        cnb = new ControladorNovoBanco();
        cnb.anexar(this);
        
        
        btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					cnb.salvarBanco(new Banco(getNomeBanco()));
				} catch (BancoException ex) {
					exibirMsgErro(ex);
				}
				
			}
		});
    }
    
    public void exibirMsgErro(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
     }
    
    public String getNomeBanco(){
        return textNomeBanco.getText();
    }
 
    @Override
    public void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
	@Override
	public void limpar() {
		textNomeBanco.setText("");
	}
    
    public void init() {
        setTitle("Novo Banco");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 338, 140);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        textNomeBanco = new JTextField();
        textNomeBanco.setBounds(58, 31, 198, 20);
        contentPane.add(textNomeBanco);
        textNomeBanco.setColumns(10);

        JLabel lblNomeDoBanco = new JLabel("Nome do Banco");
        lblNomeDoBanco.setBounds(58, 11, 146, 14);
        contentPane.add(lblNomeDoBanco);

        btnSalvar = new JButton("Salvar");

        btnSalvar.setBounds(58, 62, 89, 23);
        contentPane.add(btnSalvar);
    }




}
