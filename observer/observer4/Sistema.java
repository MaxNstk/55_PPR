public class Sistema {

    public static void main(String[] args) {

        Revista R1 = new Revista("R1");
        Revista R2 = new Revista("R2");

        Assinante A1 = new Assinante("A1", "Endereço");
        Assinante A2 = new Assinante("A2", "Endereço");
        Assinante A3 = new Assinante("A3", "Endereço");
        Assinante A4 = new Assinante("A4", "Endereço");
        WebSite ws = new WebSite("url");

        R1.anexarObserver(A1);
        R1.anexarObserver(A2);
        R1.anexarObserver(A3);
        R1.anexarObserver(A4);
        R1.anexarObserver(ws);

        R2.anexarObserver(A2);
        R2.anexarObserver(A4);
        R2.anexarObserver(ws);

        Artigo T1 = new Artigo("T1");
        Artigo T2 = new Artigo("T2");
        Artigo T3 = new Artigo("T3");
        Artigo T4 = new Artigo("T4");
        Artigo T5 = new Artigo("T5");
        Edicao E1 = new Edicao(1);
        E1.addArtigo(T1);
        E1.addArtigo(T2);

        Edicao E2 = new Edicao(2);
        E2.addArtigo(T3);
        E2.addArtigo(T4);
        E2.addArtigo(T5);
        R1.lancarNovaEdicao(E1);
        R2.lancarNovaEdicao(E2);
    }
}
