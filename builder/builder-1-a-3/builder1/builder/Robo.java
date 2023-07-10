package builder1.builder;

import builder1.produto.Carro;

// Builder abstrato
public abstract class Robo {

	protected Carro carro;

	// attr obrigatório usa abstract
	public abstract void construirMotor();
	public abstract void construirPneus();

	// attr opcional metodo vazio
	public void construirCacamba(int carga) {
		this.carro.setCargaCacamba(carga);
	}

	public void reset() {
		this.carro = new Carro();
	}

	public Carro getResult() {
		return carro;
	}

	public abstract void construirCacamba();
}
