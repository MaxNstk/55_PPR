package visitor3;
import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;
import visitor3.empresa.Setor;
import visitor3.visitor.ImprimirGastoFolha;
import visitor3.visitor.TirarFeriasVisitor;

public class Sistema {

	public static void main(String[] args) {

		FuncNivelA f1 = new FuncNivelA("J", 5000);
		FuncNivelA f2 = new FuncNivelA("K", 4500);
		
		FuncNivelB f3 = new FuncNivelB("X", 1200);
		FuncNivelB f4 = new FuncNivelB("Y", 1500);
		
		Gerente g = new Gerente("AAA", 8000);
		
		Setor s = new Setor();
		s.add(f1);
		s.add(f2);
		s.add(f3);
		s.add(f4);
		s.add(g);
		
		s.setGerente(g);
		 
		ImprimirGastoFolha fv1 = new ImprimirGastoFolha();
		s.accept(fv1);
		
		System.out.println("Gasto: " + fv1.getGasto());
		
		TirarFeriasVisitor fv2 = new TirarFeriasVisitor();
		s.accept(fv2);
		
		System.out.println("Funcionários de férias: " + fv2.getQtdFuncFerias());
	}

}
