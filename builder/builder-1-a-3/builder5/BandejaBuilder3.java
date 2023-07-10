package builder5;

public class BandejaBuilder3 extends BandejaBuilder{

    @Override
    public void construirHamburguer(String hambuger) {
        super.construirHamburguer("Cheesburguer");
    }

    @Override
    public void construirBatata(String batata) {
        super.construirBatata("batata média");
    }

    @Override
    public void construirBrinquedo(String brinquedo) {
        super.construirBrinquedo("Carrinho");
    }

}
