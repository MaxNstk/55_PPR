package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class RevisandoCorrecoes extends EstadoArtigo {
    public RevisandoCorrecoes(Artigo artigo) {
        super(artigo);
//        artigo.resetNotasCorrecoes();
    }

    @Override
    public void correcoesRevisadas(int nota) throws Exception {
        artigo.addNotaCorrecaoRevisor(nota);
        if (artigo.getQuantasRevisoesCorrecao() == artigo.getRevista().getQuantasCorrecoes()){
            artigo.setEstado(new AvaliandoCorrecoes(artigo));
        }
    }
}
