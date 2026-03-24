package poo;

public class Ingresso{
	
	protected String nome;
	protected double valor;
	protected boolean dublado;
	
	public Ingresso (String nome, double valor, boolean dublado) {
		this.nome = nome;
		this.valor = valor;
		this.dublado = dublado;
	}
	
	public double getValor () {
		return this.valor;
	}
	
}

class Meia extends Ingresso {
	
	public Meia (double valor, String nome, boolean dublado) {
		super (nome,valor,dublado);}
	
	@Override
	public double getValor() {
		return super.getValor()/2; //evitar erro de stack overflow (caso não tivesse o super ele viraria uma função recursiva infinita)
	}
}

class Familia extends Ingresso {
	
	private int num_members;
	
	public Familia (double valor, String nome, boolean dublado, int num_members) {
		super (nome,valor,dublado);
		this.num_members = num_members;}
	
	@Override
	public double getValor() {
		if (num_members > 3) {
			double desconto = valor*num_members*0.05;
			return valor*num_members-desconto;
			}
		else return valor*num_members;
	}
}

