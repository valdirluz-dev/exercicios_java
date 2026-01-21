package exercicio3;

public class MaquinaDePet {
	
	private Pet petNaMaquina;
	private boolean ocupada = false;
	private boolean limpa = true;
	private int capacMaxAgua = 30;
	private int capacMaxShampoo = 10;
	private int agua = 0;
	private int shampoo = 0;
	
	
	public void colocarPet(Pet p) {
		if(p.getLimpo()) System.out.println ("O pet já está limpo");
		else if(this.ocupada) System.out.println ("Já tem pet aqui, remova-o");
		else if(!this.limpa) System.out.println ("Limpe a maquina primeiro seu porco!");
		else {
			this.ocupada = true;
			this.petNaMaquina = p;
			p.colocarNaMaquina();
			System.out.println(p.getNome() + " entrou na máquina.");
		}
	}
	
	public void verificarAgua() {
		System.out.println (this.agua + " litros restantes");
	}
	
	public void verificarShampoo () {
		System.out.println (this.shampoo + " litros restantes");
	}
	
	public void verSeTemPet () {
		if (this.ocupada == true) System.out.println("Maquina ocupada");
		else System.out.println("Maquina livre");
	}
	
	public void darBanho() {
		if (this.petNaMaquina == null) System.out.println("Não tem pet na maquina.");
		else if (this.agua < 10) System.out.println("Pouca água!");
		else if (this.shampoo < 2) System.out.println("Pouco shampoo!");
		else {
			this.agua -= 10;
			this.shampoo -= 2;
			this.petNaMaquina.limpar();
			this.limpa = false; // AGORA A MÁQUINA FICOU SUJA!
			System.out.println("Banho tomado!");
		}
	}
	
	public void abastecerAgua() {
		if (this.agua >= this.capacMaxAgua) System.out.println("Já está cheio d´agua");
		else {
			this.agua += 2;
			System.out.println("Abastecido. Novo valor: " + this.agua + " litros");
		}
	}
	
	public void abastecerShampoo() {
		if (this.shampoo >= this.capacMaxShampoo) System.out.println("Já está cheio de shampoo");
		else {
			this.shampoo += 2;
			System.out.println("Abastecido. Novo valor: " + this.shampoo + " litros");
		}
	}
	
	public void retirarPet() {
		if (this.petNaMaquina == null) System.out.println("Maquina ja está vazia!");
		else {
			this.petNaMaquina.retirarDaMaquina();
			this.petNaMaquina = null; // IMPORTANTE: Limpar a referência do objeto
			this.ocupada = false;
			System.out.println("Você retirou o animal da maquina");
		}
	}
	
	public void limpar () {
		if(!(this.petNaMaquina == null)) System.out.println("Retire o pet da máquina primeiro");
		else if (this.limpa == true) System.out.println("Maquina ja esta limpa");
		else if (this.agua < 3) System.out.println("Pouca agua. Reabasteça a maquina!");
		else if (this.shampoo < 1) System.out.println("Pouco shampoo. Reabasteça o shampoo!");
		else {
			this.agua -= 3;
			this.shampoo -= 1;
			this.limpa = true;
			System.out.println("A maquina foi limpa!");
		}
	}
	
	
	
	
	
	
}
