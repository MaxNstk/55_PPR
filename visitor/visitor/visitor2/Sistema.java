package visitor2;

import visitor2.arvore.ArvoreBinaria;
import visitor2.visitor.ExibirEmOrdemVisitor;
import visitor2.visitor.ExibirEmPosOrdemVisitor;
import visitor2.visitor.ExibirEmPreOrdemVisitor;

public class Sistema {

	public static void main(String[] args) throws Exception {
		ArvoreBinaria arvore = new ArvoreBinaria("F");

		arvore.inserir("G");
		arvore.inserir("I");
		arvore.inserir("H");
		arvore.inserir("B");
		arvore.inserir("A");
		arvore.inserir("D");
		arvore.inserir("C");
		arvore.inserir("E");

		System.out.println("Exibir em ordem");
//		ExibirEmOrdemVisitor v1 = new ExibirEmOrdemVisitor();
//		ExibirEmPreOrdemVisitor v1 = new ExibirEmPreOrdemVisitor();
		ExibirEmPosOrdemVisitor v1 = new ExibirEmPosOrdemVisitor();
		arvore.accept(v1);
	}

}
