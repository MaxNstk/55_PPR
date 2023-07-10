package builder5;

public class Bandeja {

    private String hamburguer;

    public String getHamburguer() {
        return hamburguer;
    }

    @Override
    public String toString() {
        return "Bandeja{" +
                "hamburguer='" + hamburguer + '\'' +
                ", batata='" + batata + '\'' +
                ", brinquedo='" + brinquedo + '\'' +
                '}';
    }

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    private String batata;
    private String brinquedo;

}
