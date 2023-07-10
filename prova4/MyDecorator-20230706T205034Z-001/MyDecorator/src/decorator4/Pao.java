package decorator4;

public class Pao extends SanduicheDecorator {

	public Pao(Sanduiche sanduiche) {
		super(sanduiche);
	}
	
	@Override
	public String toString() {
		return "Pao " + super.toString();		
	}
	
	@Override
	public double getPreco() {
		return super.getPreco() + 0.5;
	}

}