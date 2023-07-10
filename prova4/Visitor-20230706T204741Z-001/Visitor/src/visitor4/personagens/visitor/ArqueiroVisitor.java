package visitor4.personagens.visitor;

import visitor4.personagens.Arqueiro;
import visitor4.personagens.Catapulta;
import visitor4.personagens.Lanceiro;

public class ArqueiroVisitor implements PersonagensVisitor {

	private Arqueiro atacante;

	public ArqueiroVisitor(Arqueiro arqueiro) {
		this.atacante = arqueiro;
	}
	
	@Override
	public void visitArqueiro(Arqueiro arqueiro) {
		arqueiro.setPontoVida(arqueiro.getPontoVida() - atacante.getForcaAtaque());
	}

	@Override
	public void visitLanceiro(Lanceiro lanceiro) {
		lanceiro.setPontoVida(lanceiro.getPontoVida() - (atacante.getForcaAtaque() + 1));
		
	}

	@Override
	public void visitCatapulta(Catapulta catapulta) {	
		catapulta.setPontoVida(catapulta.getPontoVida() - atacante.getForcaAtaque());
	}

}
