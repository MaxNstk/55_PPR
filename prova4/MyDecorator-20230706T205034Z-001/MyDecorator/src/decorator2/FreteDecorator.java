package decorator2;

public class FreteDecorator extends PedidoDecorator {

	private PedidoBase pedido;
	private String tipo;
	
	public FreteDecorator(PedidoBase pedido, String tipo) {
		super(pedido);
		this.pedido = pedido;	
		this.tipo = tipo;
	}
	
	@Override
	public double getTotal() {
		if(this.tipo.equals("Transportadora"))
			return pedido.getTotal() + 30;
		
		return pedido.getTotal() + 40;
	}
	
	@Override
	public void concluir() {
		pedido.concluir();
		
		System.out.println("Se comunicando com " + tipo);
	}

}
