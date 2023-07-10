package abstractfactory3.controle.correio;

import abstractfactory3.controle.abstractfactory.AbstractFreteFactory;
import abstractfactory3.controle.abstractfactory.Encomenda;

public class CorreioFactory extends AbstractFreteFactory {

    @Override
    public Encomenda prepararEncomendaExpresso() throws Exception {
        return new EncomendaCorreioExpresso();
    }

    @Override
    public Encomenda prepararEncomendaNormal() throws Exception {
        return new EncomendaCorreioNormal();
    }
}
