package builder1.builder;

// Director
public class Montadora {

	private Robo robo;

	public Montadora(Robo robo) {
		this.robo = robo;
	}
	
	public void construir() {
		this.robo.reset();
		this.robo.construirMotor();
		this.robo.construirPneus();
	}

	public void construirPicape(int carga){
		this.robo.reset();
		this.robo.construirMotor();
		this.robo.construirPneus();
		this.robo.construirCacamba(carga);
	}
}
