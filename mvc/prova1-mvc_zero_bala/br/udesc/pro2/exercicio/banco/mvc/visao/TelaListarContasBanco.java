package br.udesc.pro2.exercicio.banco.mvc.visao;

import br.udesc.pro2.exercicio.banco.mvc.controlador.ControladorListarContasBanco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverListarContasBanco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class TelaListarContasBanco extends JFrame implements ObserverListarContasBanco {

    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JTable table;
    private JComboBox<Banco> cbBanco;
    private ControladorListarContasBanco controller;

    public TelaListarContasBanco() {
        init();
        this.controller = new ControladorListarContasBanco();
        this.controller.anexarObserver(this);
        this.controller.atualizarInfo();
//        this.controller.capturarContas((Banco) cbBanco.getSelectedItem());

        this.cbBanco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.capturarContas((Banco)cbBanco.getSelectedItem());
            }
        });
        exibirTela();
    }


    
    public void exibirTela() {
        setVisible(true);
    }

    public Banco getBancoSelecionado() {
        return (Banco) cbBanco.getSelectedItem();
    }

    public void init() {
        setTitle("Listar Contas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        cbBanco = new JComboBox<Banco>();
        cbBanco.setBounds(10, 17, 185, 20);
        contentPane.add(cbBanco);

        table = new JTable();
        scrollPane = new JScrollPane(table);
        contentPane.add(scrollPane);
        scrollPane.setBounds(10, 48, 414, 202);
    }

    @Override
    public void listandoContas(List<ContaCorrente> contas) {
        String[] nomeColunas = {"Código", "Tipo da Conta", "Nome", "Saldo"};
        String[][] dados = converteDados(contas);
        DefaultTableModel tableModel = new DefaultTableModel(dados, nomeColunas);
        table.setModel(tableModel);
    }

    @Override
    public void listandoBancos(List<Banco> bancos) {
        for (Banco banco:bancos){
            cbBanco.addItem(banco);
        }
    }

    private String[][] converteDados(List<ContaCorrente> contas) {
        String[][] dados = new String[contas.size()][4];
        for (int i = 0; i < contas.size(); i++) {
            ContaCorrente conta = contas.get(i);
            String[] linha = {String.valueOf(conta.getCodigo()), conta.getTipo(), conta.getNomeCorrentista(), String.valueOf(conta.getSaldo())};
            dados[i] = linha;
        }
        return dados;
    }
}
