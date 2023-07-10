package decorator3;

public class Inversor extends TextoDecorator {

	public Inversor(Texto texto) {
		super(texto);
	}
	
	@Override
	public String getTexto() {
		return new StringBuilder(super.getTexto()).reverse().toString();
	}

}
