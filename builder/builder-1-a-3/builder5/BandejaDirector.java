package builder5;

public class BandejaDirector {

    private BandejaBuilder builder;

    public BandejaDirector(BandejaBuilder builder) {
        this.builder = builder;
    }

    public Bandeja construir(){
        this.builder.reset();
        this.builder.construirHamburguer("");
        this.builder.construirBatata("");
        this.builder.construirBrinquedo("");
        return this.builder.getBandeja();
    }
}
