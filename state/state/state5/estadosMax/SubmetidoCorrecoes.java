package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class SubmetidoCorrecoes extends EstadoArtigo {
    public SubmetidoCorrecoes(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void correcoesRevisadas(int nota) throws Exception {
        artigo.addNotaCorrecaoRevisor(nota);
        artigo.setEstado(new RevisandoCorrecoes(artigo));
    }
}
