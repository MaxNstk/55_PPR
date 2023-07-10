package decorator5;

public abstract class OrcDecorator implements Orc{

	private Orc orc;
	
	public OrcDecorator(Orc orc) {
		this.orc = orc;
	}
	
	public int atacar() {
		return orc.atacar();
	}
	
	public void defender(int ataque) {
		orc.defender(ataque);
	}
	
	public void setSaude(int saude) {
		orc.setSaude(saude);
	}
	
	public int getSaude() {
		return orc.getSaude();
	}
}
