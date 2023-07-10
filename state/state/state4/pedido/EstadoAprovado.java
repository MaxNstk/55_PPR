package state4.pedido;

public class EstadoAprovado extends EstadoPedido{

    public EstadoAprovado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void atender() throws Exception {
        this.pedido.setEstado(new EstadoAtendido(this.pedido));
    }
}
