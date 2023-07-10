package decorator5;

public class JoiaDaVida extends OrcDecorator {

	public JoiaDaVida(Orc orc) {
		super(orc);
		
		setSaude((int) (getSaude() + (getSaude() * 0.2)));
	}

	@Override
	public void setSaude(int saude) {
		super.setSaude(saude);
	}
}
