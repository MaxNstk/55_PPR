package builder4;

public class PicantePizzaBuilder extends PizzaBuilder{

    @Override
    public void construirCobertura(String cobertura) {
        super.construirCobertura("Peperoni+Salame");
    }

    @Override
    public void construirMolho(String molho) {
        super.construirMolho("Apimentado");
    }

}
