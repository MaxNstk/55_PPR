package abstractfactory3.controle.correio;

import abstractfactory3.controle.abstractfactory.Enomenda;

public class EncomendaCorreioExpresso extends Encomenda {

    @Override
    public double getPreco() throws Exception {
        switch (this.getDestino()) {
            case NORTE:
                return this.getPeso() * 0.05;
            case NORDESTE:
                return this.getPeso() * 0.05;
            case CENTROOESTE:
                return this.getPeso() * 0.075;
        }
        return this.getPeso() * 0.025;
    }
}
