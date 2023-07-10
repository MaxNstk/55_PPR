package visitor4.personagens;

import java.util.ArrayList;
import java.util.List;

import visitor4.personagens.visitor.PersonagensVisitor;

public class Exercito {

	private List<Personagem> personagens = new ArrayList<>();
	
	public void add(Personagem p) {
		personagens.add(p);
	}
	
	public void accept(PersonagensVisitor visitor) {
		for(Personagem p : personagens) {
			p.accept(visitor);
		}
	}
}
