package visitor5.taxi;

public class Sistema {

	public static void main(String[] args) {
		Frota frota = new Frota();
		frota.add(new Taxi(100, 1));
		frota.add(new Taxi(101, 2));
		frota.add(new Taxi(102, 2));
		frota.add(new Taxi(103, 1));
		frota.add(new Taxi(104, 3));
	
		testarAtendimento(new Cliente(1, "91234"), frota);
		testarAtendimento(new Cliente(2, "95678"), frota);
		testarAtendimento(new Cliente(4, "90000"), frota);
		testarAtendimento(new Cliente(1, "92468"), frota);
		testarAtendimento(new Cliente(1, "90001"), frota);
	}
	
	private static void testarAtendimento(Cliente cliente, Frota frota) {
		AtendimentoVisitor visitor = new AtendimentoVisitor(cliente);
		
		frota.accept(visitor);
		
		if(!visitor.isAtendido())
			System.out.println("Atendimento ligou para cliente " + cliente.getNumeroTelefone() + " avisando que não tem taxi.");
	}
}
