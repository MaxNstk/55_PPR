package br.udesc.pp55.command3.sistema;

import java.util.Scanner;

import br.udesc.pp55.command3.command.Command;
import br.udesc.pp55.command3.command.CommandFactory;
import br.udesc.pp55.command3.command.CommandInvoker;

public class Servidor {

// Já está implementado um dos comandos para listar todas as pessoas e um esqueleto da classe para incluir novas pessoas
//+ Implementar outros três comandos para incluir, excluir e obter uma pessoa. Verificar a classe CommandFactory para ter uma noção do nome da classe
//+ À medida que vai implementando novos Command, deve adicionar mais métodos no Observer
	
	public static void main(String[] args) throws Exception {

		CommandInvoker ci = new CommandInvoker();
		CommandFactory factory = new CommandFactory(new ConsoleObserver());
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("Digite um comando (new, all, get, delete, undo, redo) : ");
			String scomm = s.next();
			if (scomm.equals("undo")) {
				ci.undo();
			} else {
			   if (scomm.equals("redo")) {
				   ci.redo();
			   } else {
				   String[] dados = null;
				   if (!scomm.equals("all")) {
					   System.out.print("Codigo: ");
					   dados = new String[2];
					   
					   dados[0] = s.next();
	
					   if (scomm.equals("new")) {
						   System.out.print("Nome: ");
						   dados[1] = s.next();
					   }
				   }
				   Command comm = factory.getCommand(scomm, dados);
				   ci.execute(comm);
					
			   }
			}
				
			
		} while (true);
		
	}
}
