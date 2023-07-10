package abstractfactory3.controle.exportarEUA;

import abstractfactory3.controle.abstractfactory.AbstractFreteFactory;
import abstractfactory3.controle.abstractfactory.Encomenda;

public class ExportarEUAFactory extends AbstractFreteFactory {

    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        return new EncomendaExportarEUAExpresso();
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new EncomendaExportarEUANormal();
    }
}
