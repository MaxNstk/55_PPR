package builder4;

public class HavaiPizzaBuilder extends PizzaBuilder{

    @Override
    public void construirCobertura(String cobertura) {
        super.construirCobertura("Presunto+Abacaxi");
    }

    @Override
    public void construirMolho(String molho) {
        super.construirMolho("Suave");
    }
}
