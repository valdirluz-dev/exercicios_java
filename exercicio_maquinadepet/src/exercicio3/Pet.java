package exercicio3;

public class Pet {
	
	private String nome;
	private boolean limpo = false;
	protected boolean naMaquina;
	
	
	public String getNome () {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean getLimpo() {
		return limpo;
	}
	
	public void setNaMaquina(boolean naMaquina) {
		this.naMaquina = naMaquina;
	}
	
	public void limpar () {
		this.limpo = true;
	}
	
	public void colocarNaMaquina () {
		this.setNaMaquina(true);
	}
	
	public void retirarDaMaquina () {
		this.setNaMaquina(false);
	}
}
