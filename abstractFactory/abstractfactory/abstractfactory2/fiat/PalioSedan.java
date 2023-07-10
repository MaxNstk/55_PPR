package abstractfactory2.fiat;

import abstractfactory2.abstractFactory.CarroSedan;

public class PalioSedan implements CarroSedan {

    private int bagagem;

    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Palio\nFábrica:Fiat\nCategoria:Sedan");
    }

    @Override
    public void colocarBagagem(int kg) throws Exception {
        if (kg+bagagem < 400) {
            bagagem+=kg;
        } else {
            throw new Exception("Excesso de bagagem");
        }
    }

    @Override
    public int getKgBagageiro() {
        if (bagagem > 300)
            return 300;
        return bagagem;
    }
}
