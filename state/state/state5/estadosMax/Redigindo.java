package state5.estadosMax;

import state5.artigo.Artigo;
import state5.artigo.EstadoArtigo;

public class Redigindo extends EstadoArtigo {

	public Redigindo(Artigo artigo) {
		super(artigo);
	}
	
	@Override
	public void submeter() throws Exception {
		artigo.setEstado(new Submetido(artigo));
	}

}
