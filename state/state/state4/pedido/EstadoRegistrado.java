package state4.pedido;

public class EstadoRegistrado extends EstadoPedido{

    public EstadoRegistrado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void analisar() throws Exception {
        pedido.setEstado(new EstadoEmAnalise(pedido));
    }
}
