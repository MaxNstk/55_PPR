package br.udesc.pp55.command3.command;

import br.udesc.pp55.command3.dao.BancoPessoas;
import br.udesc.pp55.command3.modelo.Pessoa;
import br.udesc.pp55.command3.observer.Observer;

public class DeleteCommand extends Command {

    Pessoa pessoa;
    private String[] dados;
    private BancoPessoas banco = BancoPessoas.getInstance();

    public DeleteCommand(Observer observer, String[] dados) {
        super(observer);
        this.dados = dados;
    }

    @Override
    public void execute() {
        this.pessoa = banco.removerPessoa(Integer.parseInt(dados[0]));
    }

    @Override
    public void undo() {
        banco.addPessoa(pessoa.getId(), pessoa.getNome());

    }

    @Override
    public void redo() {
        execute();
    }
}
