package br.udesc.pro2.exercicio.banco.mvc.observers;

import java.util.List;

import br.udesc.pro2.exercicio.banco.mvc.modelo.Banco;
import br.udesc.pro2.exercicio.banco.mvc.modelo.ContaCorrente;

public interface ObserverListaBanco {

	void listaBancos(List<Banco> list);
	void listandoContas(List<ContaCorrente> contas);
}
