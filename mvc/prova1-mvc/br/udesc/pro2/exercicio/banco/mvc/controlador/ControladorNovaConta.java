package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.ObserverNovaConta;
import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.ContaException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovaConta;

import java.util.List;

/**
 *
 * @author mattheus
 */
public class ControladorNovaConta {

    private ContaCorrente modeloConta;
    private List<ObserverNovaConta> observers;
    public ControladorNovaConta() {
    }

//    private void adicionarAcaoBotoes() {
//        telaNovaConta.adicionarAcaoBtnSalvar(acao -> acaoSalvar());
//    }
//
//    public void abrirTela() {
//        telaNovaConta.exibirTela();
//    }

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

    public void atualizarInfo(){
        List<Banco> bancos = BancoDAO.getBancos();
        for(ObserverNovaConta obs:observers){
            obs.listandoBancos(bancos);
        }
    }



}
