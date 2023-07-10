package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class Avaliando extends EstadoArtigo {
    public Avaliando(Artigo artigo) {
        super(artigo);

    }

    @Override
    public void proxEstado() {
        if (artigo.getMediaRevisao() < artigo.getRevista().getNotaCorte()){
            artigo.setEstado(new Reprovado(artigo));
        } else {
            artigo.setEstado(new AceitoParapublicacao(artigo));
        }
    }
}
