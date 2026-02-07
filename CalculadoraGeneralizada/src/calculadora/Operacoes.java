package calculadora;

import java.util.List;

public class Operacoes {

	public static void resultado (int op, String valores) {

		RetornoDeNumeros conversao = new RetornoDeNumeros (valores);
		List<Double> valoresNumericos = conversao.getNumeros();

		if (op == 1) System.out.println(Operacoes.soma(valoresNumericos));
		if (op == 2) System.out.println(Operacoes.subtracao(valoresNumericos, valoresNumericos.get(0)));

	}

	public static double soma(List<Double> valoresNumericos) {
		return valoresNumericos.stream()
				.reduce(0.0, Double::sum);
	}

	public static double subtracao(List<Double> lista, double inicial) {
		return lista.stream()
				.skip(1) 
				.reduce(inicial, (subtotal, proximo) -> subtotal - proximo);
	}
}


