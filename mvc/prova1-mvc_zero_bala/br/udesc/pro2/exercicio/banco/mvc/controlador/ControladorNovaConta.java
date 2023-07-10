package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.ContaException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverNovaConta;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovaConta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class ControladorNovaConta {

    private TelaNovaConta telaNovaConta;
    private ContaCorrente modeloConta;
    private List<ObserverNovaConta> observers = new ArrayList<>();

    public void anexarObservador(ObserverNovaConta conta){
        this.observers.add(conta);
    }

    public void atualizarInfo(){
        List<Banco> bancos = BancoDAO.getBancos();
        for (ObserverNovaConta obs:observers){
            obs.listandoBancos(bancos);
        }
    }

    public ControladorNovaConta() {
//        this.telaNovaConta = telaNovaConta;
//        this.modeloConta = modeloConta;
//        adicionarAcaoBotoes();
//        telaNovaConta.popularBancos(BancoDAO.getBancos());
    }

    public void salvarConta(String nomeCorrentista, String tipoConta, Banco banco) throws ContaException{
        modeloConta = criarNovaConta(banco, nomeCorrentista, tipoConta);
        for (ObserverNovaConta obs:observers){
            obs.salvandoContas(modeloConta);
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
