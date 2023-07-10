package builder1;

import builder1.builder.Montadora;
import builder1.builder.Robo;
import builder1.builder.RoboPicapePika;
import builder1.produto.Carro;

public class Cliente {

	public static void main(String[] args) {
		
		Robo robo = new RoboEsportivoBasico();
		Montadora montadora = new Montadora(robo);
		montadora.construir();
		Carro carro = robo.getResult();
		System.out.println(carro);

		robo = new RoboPicapePika();
		montadora = new Montadora(robo);
		montadora.construir();
		carro = robo.getResult();
		System.out.println(carro);

	}

}
