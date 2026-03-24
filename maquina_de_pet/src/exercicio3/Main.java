package exercicio3;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		var sc = new Scanner (System.in);
		var maquina = new MaquinaDePet();
		
		while (true) {
			
			var pet = new Pet();
			System.out.print("Usar maquina (sim/não)? ");
			var opcao = sc.nextLine();
			
			if (opcao.equalsIgnoreCase("sim")) {
				System.out.print("Digite o nome do pet: ");
				var nome = sc.nextLine();
				pet.setNome(nome);
				
				while (true) {
					
					System.out.print("Sair, colocar pet, verificar agua, verificar shampoo, dar banho, abastecer agua, abastecer shampoo, retirar pet, limpar:");
					var acao = sc.nextLine();
					
					if (acao.equalsIgnoreCase("Sair")) break;
					else if (acao.equalsIgnoreCase("colocar pet")) maquina.colocarPet(pet);
					else if (acao.equalsIgnoreCase("verificar agua")) maquina.verificarAgua();
					else if (acao.equalsIgnoreCase("verificar shampoo")) maquina.verificarShampoo();
					else if (acao.equalsIgnoreCase("dar banho")) maquina.darBanho();
					else if (acao.equalsIgnoreCase("abastecer agua")) maquina.abastecerAgua();
					else if (acao.equalsIgnoreCase("abastecer shampoo")) maquina.abastecerShampoo();
					else if (acao.equalsIgnoreCase("retirar pet")) maquina.retirarPet();
					else if (acao.equalsIgnoreCase("limpar")) maquina.limpar();
					else System.out.println ("Opção inválida, digite novamente.");
				}
			}
			
			System.out.print("Deseja sair (sim/não)?");
			var sair = sc.nextLine();
			if (sair.equalsIgnoreCase("sim")) {
			System.out.println("você saiu do programa");
			sc.close();
			break;}
			else if (sair.equalsIgnoreCase("não")) continue;
			else System.out.println("opção inválida");
			
		}
	}
}
	
