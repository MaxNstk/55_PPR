package visitor4.personagens.visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;

public interface PersonagensVisitor {
	
	void visitArqueiro(Arqueiro arqueiro);
	void visitLanceiro(Lanceiro lanceiro);
	void visitCatapulta(Catapulta catapulta);
}
