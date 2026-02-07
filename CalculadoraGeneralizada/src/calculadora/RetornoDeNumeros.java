package calculadora;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RetornoDeNumeros {
	private List <Double> numeros = new ArrayList<>();

	public List<Double> getNumeros() {
		return numeros;
	}

	public RetornoDeNumeros (String s) {
		this.numeros = Arrays.stream(s.trim().split(","))
				.map(Double::valueOf)
				.collect(Collectors.toList());

	}

}
