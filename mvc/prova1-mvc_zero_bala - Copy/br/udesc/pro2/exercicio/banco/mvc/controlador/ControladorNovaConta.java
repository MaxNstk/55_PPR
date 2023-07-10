package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.ContaException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovaConta;

/**
 *
 * @author mattheus
 */
public class ControladorNovaConta {

    private TelaNovaConta telaNovaConta;
    private ContaCorrente modeloConta;

    public ControladorNovaConta(TelaNovaConta telaNovaConta, ContaCorrente modeloConta) {
        this.telaNovaConta = telaNovaConta;
        this.modeloConta = modeloConta;
        adicionarAcaoBotoes();
        telaNovaConta.popularBancos(BancoDAO.getBancos());
    }

    private void adicionarAcaoBotoes() {
        telaNovaConta.adicionarAcaoBtnSalvar(acao -> acaoSalvar());
    }

    public void abrirTela() {
        telaNovaConta.exibirTela();
    }

    private void acaoSalvar() {
        try {
            telaNovaConta.validarCampos();
            String nomeCorrentista = telaNovaConta.getNomeCorrentista();
            Banco banco = telaNovaConta.getBanco();
            String tipoConta = telaNovaConta.getTipoConta();
            modeloConta = criarNovaConta(banco, nomeCorrentista, tipoConta);
            telaNovaConta.exibirMensagem("Conta Adicionada: " + modeloConta);
            telaNovaConta.fecharTela();
        } catch (ContaException ex) {
            telaNovaConta.exibirMensagem(ex.getMessage());
        }
    }

    private ContaCorrente criarNovaConta(Banco banco, String nome, String tipoConta) {
        ContaCorrente conta;
        if (tipoConta.equals("Conta Corrente")) {
            conta = banco.criarContaCorrente(nome);
        } else {
            conta = banco.criarContaPoupanca(nome);
        }
        return conta;
    }

}
