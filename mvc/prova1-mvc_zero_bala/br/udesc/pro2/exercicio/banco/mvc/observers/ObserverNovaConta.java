package br.udesc.pro2.exercicio.banco.mvc.observers;

import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;

import java.util.List;

public interface ObserverNovaConta {

    void listandoBancos(List<Banco> bancos);
    void salvandoContas(ContaCorrente conta);

}
