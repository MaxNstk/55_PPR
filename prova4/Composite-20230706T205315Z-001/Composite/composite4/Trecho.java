package composite4;

public abstract class Trecho {

	private LinhaAerea origem;
	private LinhaAerea destino;
	
	public Trecho(LinhaAerea origem, LinhaAerea destino) {
		this.origem = origem;
		this.destino = destino;
	}

	public LinhaAerea getOrigem() {
		return origem;
	}

	public void setOrigem(LinhaAerea origem) {
		this.origem = origem;
	}

	public LinhaAerea getDestino() {
		return destino;
	}

	public void setDestino(LinhaAerea destino) {
		this.destino = destino;
	}
	
	
}
