package br.udesc.pro2.exercicio.banco.mvc;

import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;

import java.util.List;

public interface ObserverNovaConta {

    void listandoBancos(List<Banco> bancos);
}