package builder5;

public class BandejaBuilder4 extends BandejaBuilder{

    @Override
    public void construirHamburguer(String hambuger) {
        super.construirHamburguer("Cheeseburguer");
    }

    @Override
    public void construirBatata(String batata) {
        super.construirBatata("batata media");
    }

    @Override
    public void construirBrinquedo(String brinquedo) {
        super.construirBrinquedo("Boneqeuinha");
    }

}
