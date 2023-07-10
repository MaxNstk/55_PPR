package abstractfactory3.controle.exportarEUA;

import abstractfactory3.controle.abstractfactory.Encomenda;

public class EncomendaExportarEUANormal extends Encomenda {

    @Override
    public double getPreco() throws Exception {
        double fatorModificacao;
        if (this.getCubagem() <= 27000){
            fatorModificacao = 0.3;
        } else if (this.getCubagem() <= 29000) {
            fatorModificacao = 0.7;
        }else{
            fatorModificacao = 1.0;
        }


        return getCubagem() * 0.009 + this.getPeso() * fatorModificacao * 0.005;
    }

}
