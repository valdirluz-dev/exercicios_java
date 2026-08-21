/** Define o contrato de cálculo das categorias de imposto de renda. */
package imposto;

public interface IR {
	double imposto (double valor);
	boolean teste (String produto);
}
