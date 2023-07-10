package visitor5.taxi;

public class AtendimentoVisitor {

	private Cliente cliente;
	private boolean atendido;
	
	public AtendimentoVisitor(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void visit(Taxi taxi) {
		if(!taxi.isOcupado() && taxi.getPontoTaxi() == cliente.getPontoProximo()) {
			taxi.atender(cliente);
			this.atendido = true;
		}
	}

	public boolean isAtendido() {
		return this.atendido;
	}
}
