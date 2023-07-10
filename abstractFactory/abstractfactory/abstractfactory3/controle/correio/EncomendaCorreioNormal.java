package abstractfactory3.controle.correio;

import abstractfactory3.controle.abstractfactory.Destino;
import abstractfactory3.controle.abstractfactory.Encomenda;

public class EncomendaCorreioNormal extends Encomenda {

    @Override
    public double getPreco() throws Exception {
        switch (this.getDestino()) {
            case NORTE:
                return getPeso() * 0.03;
            case CENTROOESTE:
                return getPeso() * 0.04;
            case NORDESTE:
                return getPeso() * 0.02;
            case SUDESTE:
                return getPeso() * 0.025;
            case SUL:
                return getPeso() * 0.01;
        }
        throw new Exception("Destino inváido");
    }

}
