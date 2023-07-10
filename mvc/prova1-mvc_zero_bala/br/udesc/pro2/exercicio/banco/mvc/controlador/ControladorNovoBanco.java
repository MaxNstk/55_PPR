package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.excecoes.BancoException;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverNovoBanco;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaNovoBanco;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mattheus
 */
public class ControladorNovoBanco {

    private Banco modeloBanco;
    private List<ObserverNovoBanco> observadores = new ArrayList<>();

    public ControladorNovoBanco() {
//        this.telaNovoBanco = telaNovoBanco;
//        this.modeloBanco = modeloBanco;
//        adicionarAcaoBotoes();
    }

    public void anexarObservador(ObserverNovoBanco obs){
        this.observadores.add(obs);
    }

    public void salvarBanco(Banco banco) throws BancoException{
        BancoDAO.salvarBanco(banco);
        for (ObserverNovoBanco obs:observadores){
            obs.salvandoBanco(banco);
        }
    }
}
