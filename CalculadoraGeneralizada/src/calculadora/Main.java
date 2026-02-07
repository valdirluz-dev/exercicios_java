package calculadora;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		var sc = new Scanner(System.in);
		String valores;
		int op;

		do {

			do {
				System.out.print("=================\n0 = sair \n1 = soma \n2 = subtração)\nDigite a operação:");
				op = sc.nextInt();
				sc.nextLine();

				System.out.println("=================");
				if ((op != 0)&&(op != 1)&&(op != 2)) System.out.println("Operação inválida, tente novamente!");
				if (op == 0) break;

			} while((op != 1) && (op != 2));

			if (op == 0) break;

			System.out.print("Digite os valores separados por vírgula:");
			valores = sc.nextLine();

			Operacoes.resultado(op, valores);
			
		} while((op != 0));

		sc.close();
	}
}
