public class WebSite implements Observer{
    private String url;

    public WebSite(String url) {
        this.url = url;
    }

    @Override
    public void receberEdicao(Edicao edicao) {
        System.out.println("A edição "+edicao.getNumero()+" da revista"+edicao.getRevista()+" contem os seguintes artigos:");
        for(Artigo artigo: edicao.getArtigos()){
            System.out.println(String.valueOf(artigo.getTitulo()));
        }
    }
}
