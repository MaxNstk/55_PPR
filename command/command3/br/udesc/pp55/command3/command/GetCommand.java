package br.udesc.pp55.command3.command;

import br.udesc.pp55.command3.dao.BancoPessoas;
import br.udesc.pp55.command3.modelo.Pessoa;
import br.udesc.pp55.command3.observer.Observer;

public class GetCommand extends Command{
    String[] dados;
    BancoPessoas banco = BancoPessoas.getInstance();

    public GetCommand(Observer observer, String[] dados) {
        super(observer);
        this.dados = dados;
    }

    @Override
    public void execute() {
        Pessoa pessoa = banco.getPessoa(Integer.parseInt(dados[0]));
        String[][] matriz = new String[1][2];
        matriz[0][0] = String.valueOf(pessoa.getId());
        matriz[0][1] = pessoa.getNome();
        observer.buscouDados(matriz);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {
 // n necess[´riop
    }
}
