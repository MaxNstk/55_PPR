package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class TirarFeriasVisitor implements FuncionarioVisitor {

	private int qtdFuncFerias;
	
	@Override
	public void visitGerente(Gerente gerente) {
		gerente.setFeriasAGozar(10);
		qtdFuncFerias++;
	
	}

	@Override
	public void visitFuncNivelA(FuncNivelA funcionario) {
		if(funcionario.getSalario() >= 5000) {
			funcionario.setFeriasAGozar(10);
			qtdFuncFerias++;
		
		}
		
	}

	@Override
	public void visitFuncNivelB(FuncNivelB funcionario) {
		if(funcionario.getSalario() >= 1500) {
			funcionario.setFeriasAGozar(5);
			qtdFuncFerias++;
			
		}
		
	}
	
	public int getQtdFuncFerias() {
		return qtdFuncFerias;
	}

}
