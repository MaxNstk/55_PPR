package builder2;


import builder2.builder.Banco;
import builder2.builder.BradescoBuilder;
import builder2.builder.CaixaBuilder;

public class Cliente {

	public static void main(String[] args) {

//		Desenvolva um ConcreteBuilder para a Caixa e outro para o Bradesco.
//		Caixa: o cedente sempre será em letras maiúsculas
//		Bradesco: a carteira sempre será 06

//		Tarefa: Implementar os ConcreteBuilders.
//		Reflita a existência de código repetido nessas classes, e refatore aquelas já prontas.
//		Atualizar a classe de cliente para testar cada um dos concrete builders.

		// Bradesco
		Banco builder = new BradescoBuilder();
		GeradorBoleto gerador1 = new GeradorBoleto(builder /*TODO passar o builder como parametro */);
		gerador1.construir("Bino", "001", "01010101");
		 System.out.println(builder.getBoleto());
		
		// Caixa
		// TODO instanciar o builder da Caixa
		builder = new CaixaBuilder();
		GeradorBoleto gerador2 = new GeradorBoleto(builder /*TODO passar o builder como parametro */);
		gerador2.construir("Bino", "001", "01010101");
		 System.out.println(builder.getBoleto());
		
		// Terceiro teste: NovoBoleto 
	}

}
