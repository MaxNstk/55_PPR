package visitor4.personagens;

import visitor4.personagens.visitor.PersonagensVisitor;

public class Arqueiro extends Personagem {

	public Arqueiro() {
		super(15, 2);
	}

	@Override
	public void accept(PersonagensVisitor visitor) {
		visitor.visitArqueiro(this);
		
	}

}
