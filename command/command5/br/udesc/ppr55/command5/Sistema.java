package br.udesc.ppr55.command5;

import java.util.List;
import java.util.Scanner;

public class Sistema implements Observer {

	public static void main(String[] args) {
		new Sistema().executar();
	}

	public void executar(){

		Musica m1 = new Musica("Aaahhhh", 15430, 15, 13.2f);
		Musica m2 = new Musica("Vai moleque", 22311, 72, 13.2f);
		Musica m3 = new Musica("Louca da caixa d'agua", 35723, 84, 13.2f);
		
		BancoMusicas.getInstancia().add(m1);
		BancoMusicas.getInstancia().add(m2);
		BancoMusicas.getInstancia().add(m3);
		
		CarrinhoCompras cc = new CarrinhoCompras();

		CommandInvoker invoker = new CommandInvoker();
		Command comm = null;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Menu");
			System.out.println("1-Adicionar no carrinho");
			System.out.println("2-Listar carrinho");
			System.out.println("3-Tamanho das m\u00FAsicas");
			System.out.println("4-Pre\u00E7o total");
			
			int op = sc.nextInt();
			switch (op) {
			    case 1: // adicionar no carrinho
			    		System.out.println("Escolha a m\u00FAsica (1 a 3)");
			    		comm = new AddCommand(sc.nextInt() - 1, cc);
			    		break;
			    		
			    case 2:	// listar carrinho 
						comm = new ListarCommand(this, cc);
			    		break;
			    		
			    case 3: // tamanho das musicas
						comm = new TamanhoMusicaCommand(this, cc);
			    		break;
			    		
			    case 4: // preco total
			    		comm = new PrecoTotalCommand(this, cc);
			    		break;

			}
			invoker.execute(comm);

		}
	}

	@Override
	public void listandoMusicas(List<Musica> musicas) {
		for (Musica mus:musicas) {
			System.out.println("> " + mus);
		}
	}

	@Override
	public void imprimir(String msg) {
		System.out.println(msg);
	}
}
