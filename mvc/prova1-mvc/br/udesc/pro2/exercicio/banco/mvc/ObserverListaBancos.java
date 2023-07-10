package br.udesc.pro2.exercicio.banco.mvc;

import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;

import java.util.List;

public interface ObserverListaBancos {

    void listandoBancos(List<Banco> bancos);
    void listandoContas(List<ContaCorrente> contas);
}
