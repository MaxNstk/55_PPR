package br.udesc.pro2.exercicio.banco.mvc.visao;

import br.udesc.pro2.exercicio.banco.mvc.controlador.ControladorNovaConta;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.ContaException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TelaNovaConta extends JFrame {

    private JPanel contentPane;
    private JTextField textNomeCorrentista;
    private JComboBox<String> cbTipoConta;
    private JComboBox<Banco> cbBanco;
    private JButton btnSalvar;
    ControladorNovaConta controlador;

    public TelaNovaConta() {
        controlador = new ControladorNovaConta();
        controlador.atualizarInfo();
        init();

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarCampos();

            }
        });
    }
    
    public void exibirTela(){
        setVisible(true);
    }
    
    public void fecharTela(){
        dispose();
    }
    
    public void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public void adicionarAcaoBtnSalvar(ActionListener acao){
        btnSalvar.addActionListener(acao);
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
    
    public void popularBancos(List<Banco> bancos){
        for (Banco banco : bancos) {
            cbBanco.addItem(banco);
        }
    }
    
    public void validarCampos() throws ContaException {
        if(textNomeCorrentista.getText().isEmpty())
            throw new ContaException("Nome do correntista inválido");
        if(cbBanco.getSelectedItem() == null)
            throw new ContaException("Nenhum banco selecionado");
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

}
