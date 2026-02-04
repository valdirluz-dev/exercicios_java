package poo;

public class TestePolimorfismo {
	public static void main (String[] args){
		
		Operacao soma = new Operacao() {
			@Override
			public int executar (int a, int b) {return a+b;}
		};
		
		System.out.println(soma.executar(2, 3));
		
	}
}



