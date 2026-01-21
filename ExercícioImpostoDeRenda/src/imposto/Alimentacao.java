package imposto;

public class Alimentacao implements IR {

	@Override
	public double imposto(double valor) {
		
		return valor*0.01;
	}

	@Override
	public boolean teste(String produto) {
		boolean resultado = produto.equalsIgnoreCase("Alimentação");
		return resultado;
	}
	
}
