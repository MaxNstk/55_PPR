package builder4;

public abstract class PizzaBuilder {

    private Pizza pizza;

    public Pizza getPizza(){
        return this.pizza;
    }

    public void reset(){
        this.pizza = new Pizza();
    }

    public void construirMolho(String molho){
        this.pizza.setMolho(molho);
    }

    public void construirCobertura(String cobertura){
        this.pizza.setCobertura(cobertura);
    }

}
