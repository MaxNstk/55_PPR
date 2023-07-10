package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class AceitoParapublicacao extends EstadoArtigo {

    public AceitoParapublicacao(Artigo artigo) {
        super(artigo);

    }

    @Override
    public void proxEstado() {
        if (artigo.getMediaRevisao() >= artigo.getRevista().getNotaCortePublicacao()){
            artigo.setEstado(new AprovadoParaPublicacao(artigo));
        }else {
            artigo.setEstado(new AguardadoCorrecoes(artigo));
        }
    }
}
