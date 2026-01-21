package imposto;

public class Cultura implements IR{

	@Override
	public double imposto(double valor) {
		return valor*0.04;
	}
	
	@Override
	public boolean teste(String produto) {
		boolean resultado = produto.equalsIgnoreCase("Cultura");
		return resultado;
	}

}
