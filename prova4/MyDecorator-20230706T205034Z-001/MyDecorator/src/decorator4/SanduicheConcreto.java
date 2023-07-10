package decorator4;

public class SanduicheConcreto implements Sanduiche {

	private double preco;
	
	@Override
	public double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return "Sanduíche";
	}

}
