package br.udesc.pro2.exercicio.banco.mvc.controlador;

import java.util.ArrayList;
import java.util.List;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverNovaConta;

/**
 *
 * @author mattheus
 */
public class ControladorNovaConta {

	private List<ObserverNovaConta> observadores = new ArrayList<>();

	public ControladorNovaConta() {
	}

	public void anexar(ObserverNovaConta obs) {
		this.observadores.add(obs);
	}

	public void salvarConta(String nomeCorrentista, String tipoConta, Banco banco) throws Exception {
		ContaCorrente conta;
		if (tipoConta.equals("Conta Corrente")) {
			conta = banco.criarContaCorrente(nomeCorrentista);
		} else {
			conta = banco.criarContaPoupanca(nomeCorrentista);
		}

		for (ObserverNovaConta obs : observadores) {
			obs.exibirMensagem("Conta aberta com sucesso! " + conta);
			obs.limpar();
		}
	}

	public void atualizaInfo() {
		List<Banco> bancos = BancoDAO.getBancos();

		for (ObserverNovaConta obs : observadores) {
			obs.listaBancos(bancos);
		}

	}

}
