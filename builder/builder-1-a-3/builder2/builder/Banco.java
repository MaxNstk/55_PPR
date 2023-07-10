package builder2.builder;

import builder2.produto.Boleto;

public abstract class Banco {

	protected Boleto boleto;

	public void construirCedente(String cedente) {
		getBoleto().setCedente(cedente);
	}

	public void construirCarteira(String carteira) {
		getBoleto().setCarteira(carteira);
	}

	public void construirNossoNumero(String nossoNumero) {
		getBoleto().setNossoNumero(nossoNumero);
	}

	public Boleto getBoleto(){
		return this.boleto;
	};

	public void reset(){
		this.boleto = new Boleto();
	};
}
