/** Representa a categoria de despesas de saúde para o cálculo do imposto. */
package imposto;

public class Saude implements IR {

	@Override
	public double imposto(double valor) {
		return valor*0.015;
	}
	
	@Override
	public boolean teste(String produto) {
		boolean resultado = produto.equalsIgnoreCase("Saude");
		return resultado;
	}
}
