package abstractfactory2.sistema;

import abstractfactory2.abstractFactory.CarroPopular;
import abstractfactory2.abstractFactory.CarroSedan;
import abstractfactory2.abstractFactory.FabricaDeCarro;
import abstractfactory2.fiat.FabricaFiat;
import abstractfactory2.ford.FabricaFord;

public class Cliente {
	
	public static void main(String[] args) {
		
//		FabricaDeCarro fabrica = new FabricaFord(); // aqui vai trocar para new FabricaFiat();
		FabricaDeCarro fabrica = new FabricaFiat(); // aqui vai trocar para new FabricaFiat();

		criarSedan(fabrica);
		criarPopular(fabrica);

	}

	private static void criarPopular(FabricaDeCarro fabrica) {
		CarroPopular popular = fabrica.criarCarroPopular();
		popular.exibirInfoPopular();
		System.out.println();
		
	}

	private static void criarSedan(FabricaDeCarro fabrica) {

		CarroSedan sedan = fabrica.criarCarroSedan();
		sedan.exibirInfoSedan();
		System.out.println();
		
	}
}
