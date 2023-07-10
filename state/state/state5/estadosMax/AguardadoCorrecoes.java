package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class AguardadoCorrecoes extends EstadoArtigo {
    public AguardadoCorrecoes(Artigo artigo) {
        super(artigo);
    }

    @Override
    public void corrigido() throws Exception {
        this.artigo.setEstado(new SubmetidoCorrecoes(artigo));
    }
}
