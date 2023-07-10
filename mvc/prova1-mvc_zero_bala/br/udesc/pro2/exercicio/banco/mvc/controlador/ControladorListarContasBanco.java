package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.dao.BancoDAO;
import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;
import br.udesc.pro2.exercicio.banco.mvc.observers.ObserverListarContasBanco;
import br.udesc.pro2.exercicio.banco.mvc.visao.TelaListarContasBanco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mattheus
 */
public class ControladorListarContasBanco{

    private TelaListarContasBanco telaListarContasBanco;
    private List<ContaCorrente> modeloContas;
    private List<ObserverListarContasBanco> observers = new ArrayList<>();

    public void anexarObserver(ObserverListarContasBanco obs){
        this.observers.add(obs);
    }

    public void capturarContas(Banco bancoSelecionado){
        for (ObserverListarContasBanco obs:observers){
            obs.listandoContas(bancoSelecionado.getContas());
        }
    }
    public void atualizarInfo(){
        List<Banco> bancos = BancoDAO.getBancos();
        for (ObserverListarContasBanco obs:observers){
            obs.listandoBancos(bancos);
        }
    }
}
