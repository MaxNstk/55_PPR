package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaListarContasBanco;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class ControladorListarContasBanco {

    private TelaListarContasBanco telaListarContasBanco;
    private List<ContaCorrente> modeloContas;

    public ControladorListarContasBanco(TelaListarContasBanco telaListarContasBanco, List<ContaCorrente> modeloContas) {
        this.telaListarContasBanco = telaListarContasBanco;
        this.modeloContas = modeloContas;
        List<Banco> bancos = BancoDAO.getBancos();
        telaListarContasBanco.popularComboBoxBanco(bancos);

        //Inicia a tela com as contas do primeiro banco
        if (!bancos.isEmpty()) {
            telaListarContasBanco.popularDataTable(bancos.get(0).getContas());
        }

        adicionarAcoes();
    }

    private void adicionarAcoes() {
        telaListarContasBanco.adicionarAcaoCbBanco(e -> popularDataTable());
    }

    public void abrirTela() {
        telaListarContasBanco.exibirTela();
    }

    public void popularDataTable() {
        Banco banco = telaListarContasBanco.getBancoSelecionado();
        modeloContas = banco.getContas();
        telaListarContasBanco.popularDataTable(modeloContas);
    }

}
