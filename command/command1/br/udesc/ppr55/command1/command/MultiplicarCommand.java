package br.udesc.ppr55.command1.command;

import br.udesc.ppr55.command1.controle.Calculadora;

public class MultiplicarCommand extends CalculadoraCommand {

    public MultiplicarCommand(Calculadora calc, int valor) {
        super(calc, valor);
    }

    @Override
    public void execute() {

        calc.multiplicar(valor);

    }

    @Override
    public void undo() {

        calc.dividir(valor);

    }

    @Override
    public void redo() {

        calc.multiplicar(valor);

    }

    @Override
    public String toString() {
        return " + " + valor;
    }

}
