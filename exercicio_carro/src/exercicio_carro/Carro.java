package exercicio_carro;


public class Carro {
	
	private boolean ligado = false;
	private int velocidade = 0;
	private int marcha = 0;
	private  int limiteVelocMin = 0;
	private int limiteVelocMax = 0;
	
	public void ligarCarro() {
		if (this.ligado == true) System.out.println("Carro ja está ligado!");
		else {
			this.ligado = true;
			System.out.println("O carro ligou!");}
		}
		
	public void desligarCarro() {
		if (this.ligado == false) System.out.println("O carro ja está desligado!");
		else if (!(this.marcha == 0)) System.out.println("Ajuste a marcha para zero");
		else {
			this.ligado = false;
			System.out.println  ("O carro desligou!");
		}
	}
	
	public void trocaMarcha (int valor) {
		if (this.ligado == false) System.out.println("Ligue o carro primeiro!");
		else if (valor == 1) this.marcha += (this.marcha >= 6)? 0:1;
		else if (valor == -1) this.marcha -= (this.marcha <= 0)? 0:1;
		else System.out.println ("Marcha inválida!");
		
		switch (this.marcha) {
			
		case 0: this.limiteVelocMin = 0; this.limiteVelocMax = 0; break;
		case 1: this.limiteVelocMin = 0; this.limiteVelocMax = 20; break;
		case 2: this.limiteVelocMin = 21; this.limiteVelocMax = 40; break;
		case 3: this.limiteVelocMin = 41; this.limiteVelocMax = 60; break;
		case 4: this.limiteVelocMin = 61; this.limiteVelocMax = 80; break;
		case 5: this.limiteVelocMin = 81; this.limiteVelocMax = 100; break;
		case 6: this.limiteVelocMin = 101; this.limiteVelocMax = 120; break;
		
		}
		
		System.out.println("O carro esta na " + this.marcha + "° marcha");
	}

	public void virarCarro (String direcao) {
		
		if (this.ligado == false) System.out.println("Ligue o carro primeiro!");
		else if (this.velocidade == 0 || this.velocidade >40) { 
			if(this.velocidade == 0) System.out.println("Acelere  para mudar");
			else System.out.println("Desacelere para mudar");}
		else { 
			if (direcao.equalsIgnoreCase("esquerda")) System.out.println ("Carro virou à esquerda");
			else if (direcao.equalsIgnoreCase("direita")) System.out.println ("Carro virou à direita");
			else System.out.println("direção inválida");		
		}
	}
	
	public void acelerarCarro () {
		
		if (this.ligado == false) System.out.println ("Ligue o carro primeiro!");
		else if (this.velocidade > this.limiteVelocMax){
			
			if (this.velocidade > 120) System.out.println("O carro não pode acelerar mais");
			else System.out.println ("Avance a marcha para acelerar mais.");
			
			}
		else {
			this.velocidade += 1;
			System.out.println("O carro acelerou para " + this.velocidade +" km/h");
		}
		
	}
	
	public void dasacelerarCarro () {
			
			if (this.ligado == false) System.out.println ("Ligue o carro primeiro!");
			else if (this.velocidade < this.limiteVelocMin){
				
				if (this.velocidade == 0) System.out.println("O carro não pode desacelerar mais");
				else System.out.println ("Recue a marcha para desacelerar mais.");
				
				}
			else {
				this.velocidade -= 1;
				System.out.println("O carro desacelerou para " + this.velocidade +" km/h");
			}
			
		}
	
	public int verificarVelocidade () {return this.velocidade;}
	
}
	
	
	


