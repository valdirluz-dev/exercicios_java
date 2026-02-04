package list;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		var sc = new Scanner (System.in);
		System.out.println("=======================");
		System.out.println("1 = soma\n2 = subtração\n3 = divisão\n4 = multiplicação");
		System.out.print("Digite a operação:");
		var operacao = sc.nextInt();
		sc.nextLine();
		System.out.println("=======================");
		
		System.out.print("Digite o valor 1: ");
		var v1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o valor 2: ");
		var v2 = sc.nextInt();
		sc.nextLine();
		
		var calculo = OperationEnum.values()[operacao - 1];
		var resultado = calculo.getCalculate().apply(v1, v2);
		
		System.out.println("O resultado é: " + resultado);
		
		sc.close();
	}
}
