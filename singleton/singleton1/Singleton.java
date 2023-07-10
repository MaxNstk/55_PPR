package singleton1;

public class Singleton {

	// construtor prviado lek
	private Singleton() { }
	
	// atributo privado da classe
	private static Singleton instance;

	// método para obter instanncias
	public synchronized static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		
		return instance;
	}

	public void facaAlgo() {
		System.out.println("Eu fiz");
	}
}
