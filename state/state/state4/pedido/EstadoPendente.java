package state4.pedido;

public class EstadoPendente extends EstadoPedido{

    public EstadoPendente(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void retomar() throws Exception {
        this.pedido.setEstado(new EstadoEmAnalise(this.pedido));
    }

    @Override
    public void cancelar() throws Exception {
        this.pedido.setEstado(new EstadoCancelado(this.pedido));
    }

}
