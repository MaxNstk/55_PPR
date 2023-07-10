package state4.pedido;

public class Pedido {

	EstadoPedido estado;

	public Pedido(){
		this.setEstado(new EstadoRegistrado(this));
	}

	public void setEstado(Object estado) {
		System.out.println(estado);
	}
	
	public void analisar() throws Exception  {
		this.estado.analisar();
	}
	
	public void suspender() throws Exception  {
		this.estado.suspender();
	}
	
	public void retomar() throws Exception  {
		this.estado.retomar();
	}
	
	public void cancelar() throws Exception  {
		
	}
	
	public void aprovar() throws Exception  {
		
	}
	
	public void atender() throws Exception  {
		
	}
}
