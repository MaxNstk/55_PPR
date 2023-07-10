
public class Cliente {

	private String nome;
	private int idade;
	public Cliente() {
		this.nome = "Padrao";
	}
	
	
	public Cliente(String nome) {
		this.nome  = nome;
	}

	public Cliente(int nome) {
		this.idade  = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	private String privateMethod(){
		return "max";
	}

	public String toString(){
		return nome;
	}
}
