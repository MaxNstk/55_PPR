package br.udesc.pro2.exercicio.banco.mvc.controlador;

import java.util.ArrayList;
import java.util.List;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.BancoException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.observers.Observador;

/**
 *
 * @author mattheus
 */
public class ControladorNovoBanco {

	private List<Observador> observadores = new ArrayList<>();

	public ControladorNovoBanco() {
	}

	public void anexar(Observador obs) {
		this.observadores.add(obs);
	}

	public void salvarBanco(Banco banco) throws BancoException {

		try {
			BancoDAO.salvarBanco(banco);

			for (Observador obs : observadores) {
				obs.exibirMensagem("Banco adicionado com sucesso!: " + banco);
				obs.limpar();
			}
		} catch (BancoException ex) {
			throw new BancoException(ex.getMessage());
		}

	}
}
