package decorator2;

public class MensagemDecorator extends PedidoDecorator {

	private PedidoBase pedido;
	private String telefone;

	public MensagemDecorator(String telefone, PedidoBase pedido) {
		super(pedido);
		this.telefone = telefone;
		this.pedido = pedido;
	}

	@Override
	public void concluir() {
		pedido.concluir();
		
		System.out.println("Se comunicando com número " + telefone + " com o preço do pedido de " + pedido.getTotal());
	}
}
