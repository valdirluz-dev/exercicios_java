package exercicio_carro;


import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		var sc = new Scanner(System.in);
		var carro = new Carro ();
		
		System.out.println("Welcome to the carro");
		
		while (true) {
			System.out.print("sair, ligar, desligar, trocar marcha, virar, acelerar, desacelerar ou verificar velocidade?");
			var opcao = sc.nextLine();
			
			if (opcao.equalsIgnoreCase("sair")) {System.out.println("Você saiu do carro"); break;}
			else if (opcao.equalsIgnoreCase("ligar")) carro.ligarCarro();
			else if (opcao.equalsIgnoreCase("desligar")) carro.desligarCarro();
			else if (opcao.equalsIgnoreCase("trocar marcha")) {
				
				System.out.print("Digite 1 para avançar ou -1 para recuar: ");
				var marcha = sc.nextInt();
				sc.nextLine();
				carro.trocaMarcha(marcha);
				
			}
			
			else if (opcao.equalsIgnoreCase("virar")) {
				
				System.out.print("Esquerda ou direita? ");
				var direcao = sc.nextLine();
				carro.virarCarro(direcao);
				
			}
			
			else if (opcao.equalsIgnoreCase("acelerar")) carro.acelerarCarro();
			else if (opcao.equalsIgnoreCase("desacelerar")) carro.dasacelerarCarro();
			else if (opcao.equalsIgnoreCase("verificar velocidade")) System.out.println(carro.verificarVelocidade());
			
			else if (opcao.equalsIgnoreCase("dar uma festa")) System.out.println("Você deu uma festa no carro");
			
			else System.out.println ("Opção inválida.");
		}
	
	sc.close();
	}
}
