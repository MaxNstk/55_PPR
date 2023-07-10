package visitor4.personagens;

import visitor4.personagens.visitor.ArqueiroVisitor;
import visitor4.personagens.visitor.CatapultaVisitor;
import visitor4.personagens.visitor.LanceiroVisitor;

public class Sistema {

	public static void main(String[] args) {
		Arqueiro a = new Arqueiro();
		Catapulta c = new Catapulta();
		Lanceiro l = new Lanceiro();
		
		Exercito e = new Exercito();
		
		System.out.println("Vida Arqueiro: " + a.getPontoVida());
		System.out.println("Vida Catapulta: " + c.getPontoVida());
		System.out.println("Vida Lanceiro: " + l.getPontoVida());
		System.out.println("---------------------------------------");
		
		e.add(a);
		e.add(c);
		e.add(l);
		 
		ArqueiroVisitor av = new ArqueiroVisitor(new Arqueiro());
		e.accept(av);
		
		System.out.println("Vida Arqueiro: " + a.getPontoVida());
		System.out.println("Vida Catapulta: " + c.getPontoVida());
		System.out.println("Vida Lanceiro: " + l.getPontoVida());
		System.out.println("---------------------------------------");
		CatapultaVisitor cv = new CatapultaVisitor(new Catapulta());
		e.accept(cv);
		
		System.out.println("Vida Arqueiro: " + a.getPontoVida());
		System.out.println("Vida Catapulta: " + c.getPontoVida());
		System.out.println("Vida Lanceiro: " + l.getPontoVida());
		System.out.println("---------------------------------------");
		
		LanceiroVisitor lv = new LanceiroVisitor(new Lanceiro());
		e.accept(lv);
		
		System.out.println("Vida Arqueiro: " + a.getPontoVida());
		System.out.println("Vida Catapulta: " + c.getPontoVida());
		System.out.println("Vida Lanceiro: " + l.getPontoVida());
		
	}
}
