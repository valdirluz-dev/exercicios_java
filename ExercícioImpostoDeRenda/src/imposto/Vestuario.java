package imposto;

public class Vestuario implements IR {

	@Override
	public double imposto(double valor) {
		return valor*0.025;
	}
	
	@Override
	public boolean teste(String produto) {
		boolean resultado = produto.equalsIgnoreCase("Vestuário");
		return resultado;
	}
}
