package br.udesc.pp55.command3.command;

import br.udesc.pp55.command3.dao.BancoPessoas;
import br.udesc.pp55.command3.modelo.Pessoa;
import br.udesc.pp55.command3.observer.Observer;

public class NewCommand extends Command {
	int codigo;
	private String[] dados;
	private BancoPessoas banco = BancoPessoas.getInstance();

	public NewCommand(Observer observer, String[] dados) {
		super(observer);
		this.dados = dados;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		codigo = banco.addPessoa(Integer.parseInt(dados[0]), dados[1]);
	}

	@Override
	public void undo() {
		banco.removerPessoa(codigo);
	}

	@Override
	public void redo() {
		execute();
	}

}
