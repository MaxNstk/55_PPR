package br.udesc.ppr55.command2.command;

import br.udesc.ppr55.command2.controle.Deposito;

public class RemoverEstoque implements Command{

    private Deposito deposito;
    private int valor;

    public RemoverEstoque(Deposito deposito, int valor){
        this.deposito = deposito;
        this.valor = valor;
    }

    @Override
    public void execute() {
        this.deposito.remove(valor);
    }

    @Override
    public void undo() {
        this.deposito.add(valor);
    }

    @Override
    public void redo() {
        this.deposito.remove(valor);
    }
}
