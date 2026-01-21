package users;

public class Relatorio {
	private int vendas;
	private double caixa;
	
	public int getVendas() {
		return vendas;
	}
	public void realizarVendas(int valor) {
		this.vendas += valor;
	}
	public double getCaixa() {
		return caixa;
	}
	public void receberPagamento(double valor) {
		this.caixa += valor;
	}
	
}
