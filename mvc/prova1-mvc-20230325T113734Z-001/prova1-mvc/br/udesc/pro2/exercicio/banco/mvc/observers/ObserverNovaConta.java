package br.udesc.pro2.exercicio.banco.mvc.observers;

import java.util.List;

import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;

public interface ObserverNovaConta extends Observador {
	void listaBancos(List<Banco> list);
}
