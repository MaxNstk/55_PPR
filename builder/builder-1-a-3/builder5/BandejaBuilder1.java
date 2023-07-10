package builder5;

public class BandejaBuilder1 extends BandejaBuilder{

    @Override
    public void construirHamburguer(String hambuger) {
        super.construirHamburguer("hmaburguer");
    }

    @Override
    public void construirBatata(String batata) {
        super.construirBatata("batata pequena");
    }

    @Override
    public void construirBrinquedo(String brinquedo) {
        super.construirBrinquedo("Carrinho");
    }
}
