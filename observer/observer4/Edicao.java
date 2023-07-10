import java.util.ArrayList;

public class Edicao {
    private int numero;
    private Revista revista;
    private ArrayList<Artigo> artigos = new ArrayList<>();

    public Edicao(int numero){
        this.numero = numero;
    }
    public String getRevista(){
        return this.revista.toString();
    }

    public void addArtigo(Artigo artigo){
        this.artigos.add(artigo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<Artigo> artigos) {
        this.artigos = artigos;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }
}
