package composite3;

public class Pagina extends ComponenteSite {

	private String conteudo;
	
	
	
	public String getConteudo() {
		return conteudo;
	}



	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}



	@Override
	public void imprimir() {
		System.out.println(super.getTitulo() + " " + super.getUrl() + " " + this.conteudo);
	}

}
