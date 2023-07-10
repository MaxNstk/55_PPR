package decorator2;

public class Sistema {

	public static void main(String[] args) {
		PedidoBase pedido = new Pedido(100);
		
		pedido.concluir();
		
		PedidoBase frete = new FreteDecorator(pedido, "Transportadora");
	
		frete.concluir();
		
		PedidoBase mensagem = new FreteDecorator(new MensagemDecorator("122131231232", pedido), "Correio");
		
		mensagem.concluir();
		
		PedidoBase mensagem2 = new MensagemDecorator("213131321", new FreteDecorator(pedido, "Transportadora"));
		
		mensagem2.concluir();
	}
}
