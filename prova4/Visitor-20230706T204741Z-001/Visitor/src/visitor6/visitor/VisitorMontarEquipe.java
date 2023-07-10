package visitor6.visitor;

import java.util.ArrayList;
import java.util.List;

import visitor6.equipe.Funcionario;

public class VisitorMontarEquipe implements VisitorProjeto {

	private String nomeProjeto;
	private int qtdAnalistas;
	private int qtdProjetistas;
	private int qtdProgramadores;
	
	private int contAnalistas = 0;
	private int contProjetistas = 0;
	private int contProgramadores = 0;
	
	private boolean completo;

	private List<Funcionario> funcionariosProjeto = new ArrayList<>();
	
	public VisitorMontarEquipe(String nomeProjeto, int qtdAnalistas, int qtdProjetistas, int qtdProgramadores) {
		this.nomeProjeto = nomeProjeto;
		this.qtdAnalistas = qtdAnalistas;
		this.qtdProjetistas = qtdProjetistas;
		this.qtdProgramadores = qtdProgramadores;
	}
	
	@Override
	public void visitFuncionario(Funcionario funcionario) {
		if(funcionario.getProjetoAtual().isBlank()) {
			funcionario.setProjetoAtual(nomeProjeto);
			funcionariosProjeto.add(funcionario);
			
			for(String funcao : funcionario.getFuncoes()) {
				if(funcao.equalsIgnoreCase("Programador")) {
					contProgramadores++;
					break;
				}
				
				if(funcao.equalsIgnoreCase("Analista")) {
					contAnalistas++;
					break;
				}
				
				if(funcao.equalsIgnoreCase("Projetista")) {
					contProjetistas++;
					break;
				}
			}
		}
		
		if(contAnalistas == qtdAnalistas && contProgramadores == qtdProgramadores && contProjetistas == qtdProjetistas)
			completo = true;

		
	}

}
