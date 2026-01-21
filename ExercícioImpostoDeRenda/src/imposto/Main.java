package imposto;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main  (String[] args) {
		var sc = new Scanner (System.in);
		List <IR> produto = new ArrayList<>();
		produto.add(new Alimentacao());
		produto.add(new Saude());
		produto.add(new Vestuario());
		produto.add(new Cultura());
		
		System.out.print("Digite o produto: ");
		var product = sc.nextLine();
		System.out.print("Digite o valor: ");
		var valor = sc.nextDouble();
		
		for (IR elemento : produto) {
			if (elemento.teste(product)) {
				System.out.println("O IR é: " + elemento.imposto(valor));
				break;
			}
			
			else continue;
		}
	sc.close();			
	}
	
}
