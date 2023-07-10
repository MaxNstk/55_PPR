package builder4;

public class Sistema {

    public static void main(String[] args) {

        DirectorPizza picante = new DirectorPizza(new PicantePizzaBuilder());
        System.out.println(picante.costruir());

        DirectorPizza havai = new DirectorPizza(new HavaiPizzaBuilder());
        System.out.println(havai.costruir());

    }
}
