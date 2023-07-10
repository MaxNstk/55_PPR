package br.udesc.pro2.exercicio.banco.mvc.visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {

    private JPanel contentPane;
    private JButton btnNovoBanco;
    private JButton btnNovaConta;
    private JButton btnListarContas;

    public TelaInicial() {
        init();
        btnNovoBanco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaNovoBanco();
            }
        });
        btnNovaConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaNovaConta();
            }
        });
        btnListarContas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaListarContasBanco();
            }
        });
        this.setVisible(true);

    }

    public void exibirTela() {
        setVisible(true);
    }

    public void adicionarAcaoBtnNovoBanco(ActionListener acao) {
        btnNovoBanco.addActionListener(acao);
    }

    public void adicionarAcaoBtnNovaConta(ActionListener acao) {
        btnNovaConta.addActionListener(acao);
    }

    public void adicionarAcaoBtnListarContas(ActionListener acao) {
        btnListarContas.addActionListener(acao);
    }

    public void init() {
        setTitle("Banco - Tela Inicial");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 239, 183);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnNovoBanco = new JButton("Novo Banco");
        btnNovoBanco.setBounds(40, 31, 141, 23);
        contentPane.add(btnNovoBanco);

        btnNovaConta = new JButton("Nova Conta");
        btnNovaConta.setBounds(40, 65, 141, 23);
        contentPane.add(btnNovaConta);

        btnListarContas = new JButton("Listar Contas");

        btnListarContas.setBounds(40, 99, 141, 23);
        contentPane.add(btnListarContas);
    }

}
