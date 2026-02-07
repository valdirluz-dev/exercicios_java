package calculadora;

import java.util.List;

public class Operacoes {

	public static double soma(List<Double> valoresNumericos) {
		return valoresNumericos.stream()
				.reduce(0.0, Double::sum);
	}

	public static double subtracao(List<Double> lista, double inicial) {
        // Usamos skip(1) para não subtrair o primeiro número dele mesmo
        return lista.stream()
                    .skip(1) 
                    .reduce(inicial, (subtotal, proximo) -> subtotal - proximo);
    }
}


