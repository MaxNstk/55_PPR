package observer2;


public class Sistema {

	public static void main(String[] args) {

		Suporte suporte = new Suporte();
		
		AnalistaChefe chefe = new AnalistaChefe();
		suporte.attach(chefe);
		Tecnico tec1 = new Tecnico("Xico", "SistemaX");
		suporte.attach(tec1);
		Tecnico tec2 = new Tecnico("Joca", "SistemaY");
		suporte.attach(tec2);
		suporte.enviarMensagem(new Cliente("AAA"), "Meu Windows nao funciona");
		suporte.enviarMensagem(new Cliente("BBB"), "Nao consigo entrar no SistemaX");
		suporte.enviarMensagem(new Cliente("CCC"), "Erro no SistemaY com impressao");
		
	}

}
