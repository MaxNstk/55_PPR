package decorator4;

public class SanduicheAberto implements Sanduiche {

	@Override
	public String toString() {
		return "(Tudo colocado no prato)";
	}
	
	public double getPreco() {
		return 3;
	}
}
