package visitor3.visitor;

import visitor3.empresa.FuncNivelA;
import visitor3.empresa.FuncNivelB;
import visitor3.empresa.Gerente;

public class ImprimirGastoFolha implements FuncionarioVisitor {

	private double gasto;
	
	@Override
	public void visitGerente(Gerente gerente) {
		gasto += gerente.getSalario();	
	}

	@Override
	public void visitFuncNivelA(FuncNivelA funcionario) {
		gasto += funcionario.getSalario();
	
	}

	@Override
	public void visitFuncNivelB(FuncNivelB funcionario) {
		gasto += funcionario.getSalario();
	}

	public double getGasto() {
		return gasto;
	}
}
