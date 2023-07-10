package builder4;

public class Pizza {

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    private String cobertura;
    private String molho;

    public String toString(){
        return "Pizza: "+this.cobertura+" - "+this.molho;
    }
}
