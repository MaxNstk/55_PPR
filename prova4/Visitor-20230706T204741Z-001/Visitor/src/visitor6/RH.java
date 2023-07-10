package visitor6;

import java.util.ArrayList;
import java.util.List;

import visitor6.equipe.Funcionario;
import visitor6.visitor.VisitorProjeto;

public class RH {

	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public void add(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void accept(VisitorProjeto visitor) {
		for(Funcionario f : funcionarios) {
			f.accept(visitor);
		}
	}
}
