package visitor4.personagens;

import visitor4.personagens.visitor.PersonagensVisitor;

public class Lanceiro extends Personagem {

	public Lanceiro() {
		super(10, 1);
	}

	@Override
	public void accept(PersonagensVisitor visitor) {
		visitor.visitLanceiro(this);
		
	}

}
