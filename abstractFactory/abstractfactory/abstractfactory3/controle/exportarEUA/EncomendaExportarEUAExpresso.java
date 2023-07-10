package abstractfactory3.controle.exportarEUA;

import abstractfactory3.controle.abstractfactory.Encomenda;
import jdk.jshell.spi.ExecutionControl;

public class EncomendaExportarEUAExpresso extends Encomenda {

    @Override
    public double getPreco() throws Exception {
        throw new ExecutionControl.NotImplementedException("Não disponível");
    }
}
