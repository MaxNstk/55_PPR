package visitor4.personagens;

import visitor4.personagens.visitor.PersonagensVisitor;

public class Catapulta extends Personagem {

	public Catapulta() {
		super(8, 5);
	}

	@Override
	public void accept(PersonagensVisitor visitor) {
		visitor.visitCatapulta(this);
		
	}

}
