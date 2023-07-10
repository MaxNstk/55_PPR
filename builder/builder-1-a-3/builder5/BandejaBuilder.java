package builder5;

public abstract class BandejaBuilder {

    private Bandeja bandeja;

    public Bandeja getBandeja(){
        return this.bandeja;
    }

    public void reset(){
        this.bandeja = new Bandeja();
    }

    public void construirHamburguer(String hambuger){
        this.bandeja.setHamburguer(hambuger);
    }
    public void construirBatata(String batata){
        this.bandeja.setBatata(batata);
    }
    public void construirBrinquedo(String brinquedo){
        this.bandeja.setBrinquedo(brinquedo);
    }

}
