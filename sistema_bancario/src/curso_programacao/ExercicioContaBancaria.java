package curso_programacao;

import java.util.Scanner;

public class ExercicioContaBancaria {
	
	public static void main (String[] args) {
	    var sc = new Scanner (System.in);
	    var cb = new ContaBancaria ();
	    String input;

	    while (true) { // Loop infinito que nós controlamos lá dentro
	        System.out.print("Digite 1 para depositar, 2 para sacar, 3 pra pagar boleto ou 'exit' para sair: ");
	        input = sc.nextLine();

	        // 1. Verificamos o SAIR logo no começo
	        if (input.equalsIgnoreCase("exit")) {
	            System.out.println("Programa encerrado!");
	            break; // Sai do loop imediatamente
	        }

	        // 2. Só pedimos o valor se ele NÃO quis sair
	        System.out.print("Digite o valor: ");
	        var valor = sc.nextDouble();
	        sc.nextLine(); // Limpa o buffer do Enter

	        if (input.equals("1")) {
	            cb.depositar(valor);
	        } else if (input.equals("2")) {
	            cb.sacar(valor);
	        } else if(input.equals("3")){
	        	cb.PagarBoleto(valor);
	        } 
	        else {
	            System.out.println("Opção inválida!");
	        }

	        cb.verStatus();
	    }
	    sc.close();
	}
}
