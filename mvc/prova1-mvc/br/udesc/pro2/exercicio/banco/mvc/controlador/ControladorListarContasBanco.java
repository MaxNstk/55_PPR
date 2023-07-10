package br.udesc.pro2.exercicio.banco.mvc.controlador;

import br.udesc.pro2.exercicio.banco.mvc.ObserverListaBancos;
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
    private List<ObserverListaBancos> observers;

    public ControladorListarContasBanco() {
    }

    public void atualizarInfo(){
        List<Banco> bancos = BancoDAO.getBancos();

        for (ObserverListaBancos obs:this.observers){
            obs.listandoBancos(bancos);
            if (!bancos.isEmpty()){
                obs.listandoContas(bancos.get(0).getContas());
            }
        }

    }

    public void trocarBanco(Banco bancoSelecionado){
        for (ObserverListaBancos obs:observers){
            obs.listandoContas(bancoSelecionado.getContas());
        }
    }

}
