package state4.pedido;

public class EstadoEmAnalise extends EstadoPedido{

    public EstadoEmAnalise(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void suspender() throws Exception {
        pedido.setEstado(new EstadoPendente(this.pedido));
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new EstadoCancelado(this.pedido));
    }

    @Override
    public void aprovar() throws Exception {
        pedido.setEstado(new EstadoAprovado(this.pedido));
    }
}
