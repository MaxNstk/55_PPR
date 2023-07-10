package br.udesc.pro2.exercicio.banco.mvc.visao;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.BancoException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class TelaNovoBanco extends JFrame {

    private JPanel contentPane;
    private JTextField textNomeBanco;
    private JButton btnSalvar;

    public TelaNovoBanco() {
        init();
    }
    
    public String getNomeBanco(){
        return textNomeBanco.getText();
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
    
    public void validarCampos() throws BancoException {
        if(textNomeBanco.getText().isEmpty())
            throw new BancoException("Nome do banco inválido");
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
