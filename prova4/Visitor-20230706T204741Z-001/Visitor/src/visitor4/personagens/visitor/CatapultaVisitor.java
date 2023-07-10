package visitor4.personagens.visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;

public class CatapultaVisitor implements PersonagensVisitor {

	private Catapulta atacante;

	public CatapultaVisitor(Catapulta catapulta) {
		this.atacante = catapulta;
	}
	
	@Override
	public void visitArqueiro(Arqueiro arqueiro) {
		arqueiro.setPontoVida(arqueiro.getPontoVida() - (atacante.getForcaAtaque() + 1));
		
	}

	@Override
	public void visitLanceiro(Lanceiro lanceiro) {
		lanceiro.setPontoVida(lanceiro.getPontoVida() - (atacante.getForcaAtaque() + 2));
		
	}

	@Override
	public void visitCatapulta(Catapulta catapulta) {
		catapulta.setPontoVida(catapulta.getPontoVida() - atacante.getForcaAtaque());
	}

}
