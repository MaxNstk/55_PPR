package br.udesc.pro2.exercicio.banco.mvc.controlador;

import java.util.ArrayList;
import java.util.List;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverListaBanco;

/**
 *
 * @author mattheus
 */
public class ControladorListarContasBanco {
	
    private List<ObserverListaBanco> observadores = new ArrayList<>();
    
    public ControladorListarContasBanco() {

    }
    
    public void anexar(ObserverListaBanco obs) {
    	this.observadores.add(obs);
    }

	public void atualizarInfo() {
		List<Banco> bancos = BancoDAO.getBancos();
		
		for(ObserverListaBanco obs : observadores) {
			obs.listaBancos(bancos);
			
			if(!bancos.isEmpty()) {
				obs.listandoContas(bancos.get(0).getContas());
			}
		}
	}

	public void trocarBanco(Banco bancoSelecionado) {
		for(ObserverListaBanco obs : observadores) {
			obs.listandoContas(bancoSelecionado.getContas());
		}
		
	}
}
