package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class AvaliandoCorrecoes extends EstadoArtigo {
    public AvaliandoCorrecoes(Artigo artigo) {
        super(artigo);

    }

    @Override
    public void proxEstado() {
        if( artigo.getMediaCorrecao() < artigo.getRevista().getNotaCorte()){
            artigo.setEstado(new Reprovado(artigo));
        } else if (artigo.getMediaCorrecao() >= artigo.getRevista().getNotaCortePublicacao()){
            artigo.setEstado(new AprovadoParaPublicacao(artigo));
        }else {
            artigo.resetNotasCorrecoes();
            artigo.setEstado(new AguardadoCorrecoes(artigo));
        }
    }
}
