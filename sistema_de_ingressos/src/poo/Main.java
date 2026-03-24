package poo;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		var sc = new Scanner (System.in);
		
		boolean dublado;
		
		System.out.print("Digite o nome do filme: ");
		var nome = sc.nextLine();
		
		System.out.print("Digite o valor do filme: ");
		var valor = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("O filme é dublado (sim/não)? ");
		var dubladosn = sc.nextLine();
		
		if (dubladosn.equalsIgnoreCase("sim")) dublado = true;
		else dublado = false;
		
		var ingresso = new Ingresso (nome, valor, dublado);
		
		System.out.print("inteira, meia ou familia? ");
		var imf = sc.nextLine();
		
		if (imf.equalsIgnoreCase("inteira")) System.out.println("O valor do ingresso é: " + ingresso.getValor() + " reais");
		
		else if (imf.equalsIgnoreCase("meia")) { 
			var meia = new Meia (valor, nome, dublado);
			System.out.println("O valor do ingresso é: " + meia.getValor() + " reais");
			}
		
		else if (imf.equalsIgnoreCase("familia")) {
			System.out.print("Digite o numero de membros: ");
			var num_members = sc.nextInt();
			sc.nextLine();
			
			var familia = new Familia(valor, nome, dublado, num_members);
			System.out.println("O valor do ingresso é: " + familia.getValor() + " reais");
		}
		
		else System.out.println("opção inválida.");
		sc.close();

	
	
	} //fecha método main
}//fecha classe main