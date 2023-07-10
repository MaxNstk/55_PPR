package decorator4;

public class SanduicheFechado implements Sanduiche {

	public double getPreco() {
		return 1;
	}

	@Override
	public String toString() {
		return "(Tudo dentro da caixa)";
	}
}
