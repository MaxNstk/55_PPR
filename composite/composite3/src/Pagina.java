public class Pagina extends ComponenteSite{

    private String conteudo;

    public Pagina(String titulo, String url) {
        super(titulo, url);
    }

    @Override
    public void imprimir() {
        System.out.println( "<"+this.titulo+"><"+this.url+"><"+this.conteudo+">");
    }
}
