package builder4;

public class DirectorPizza {

    public DirectorPizza(PizzaBuilder builder){
        this.builder = builder;
    }
    private PizzaBuilder builder;

    public Pizza costruir(){
        this.builder.reset();
        this.builder.construirCobertura("");
        this.builder.construirMolho("");
        return this.builder.getPizza();
    }
}
