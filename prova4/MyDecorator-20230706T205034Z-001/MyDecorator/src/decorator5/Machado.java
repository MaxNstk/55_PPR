package decorator5;

import java.util.Random;

public class Machado extends OrcDecorator {

	public Machado(Orc orc) {
		super(orc);
	}
	
	@Override
	public int atacar() {
		return new Random().nextInt(1, 5);
	}

}
