package br.udesc.ppr55.command2.command;

import br.udesc.ppr55.command2.controle.Deposito;

public abstract class CommandClass implements Command{

    private Deposito deposito;
    private int qtdade;

    public CommandClass(Deposito deposito, int qtdade) {
        this.deposito = deposito;
        this.qtdade = qtdade;
    }

}
