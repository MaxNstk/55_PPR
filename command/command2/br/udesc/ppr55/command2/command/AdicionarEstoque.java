package br.udesc.ppr55.command2.command;

import br.udesc.ppr55.command2.controle.Deposito;

public class AdicionarEstoque implements Command{

	private Deposito deposito;
	private int qtdade;

	public AdicionarEstoque(Deposito deposito, int qtdade) {
		this.deposito = deposito;
		this.qtdade = qtdade;
	}

	public void execute() {
		deposito.add(qtdade);
	}

	public void undo() {
		deposito.remove(qtdade);
	}

	public void redo() {
		deposito.add(qtdade);
	}

}
