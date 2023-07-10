package state4.pedido;

public abstract class EstadoPedido {

    public EstadoPedido(Pedido pedido){
        this.pedido = pedido;
    }

    protected Pedido pedido;

    public void analisar() throws Exception{}
    public void retomar() throws Exception{}
    public void suspender() throws Exception{}
    public void aprovar() throws Exception{}
    public void cancelar() throws Exception{}
    public void atender() throws Exception{}
}
