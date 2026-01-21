package users;

public abstract class Usuarios {//impede a criação de um usuário sem cargos
	protected String nome,email, senha;
	protected boolean admin;
	
	public Usuarios (String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public void alterarDados(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void alterarSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean realizarLogin(String email, String senha) {
		if (email.equals(this.email) && senha.equals(this.senha)) {
			System.out.println("Login realizado com sucesso!");
			return true;
		}
		
		else {	
			System.out.println("dados incorretos, digite novamente.");
			return false;	
		
		}
	}
	
	public void realizarLogOff() {
		System.out.println("você saiu do sistema!");
	}
	
	public void consultarVendas(Relatorio r) {
		 System.out.println("Foram realizadas "+ r.getVendas() + " vendas.");
	}
	
}

//gerente
class Gerente extends Usuarios {
	
	public Gerente (String nome, String email, String senha) {
		super (nome, email, senha);
		super.admin = true;
	}
	
	public void gerarRelatorioFinanceiro(Relatorio r) {
		System.out.println("Vendas: " + r.getVendas() + " caixa: R$" + r.getCaixa() + " reais");
	}
}

//vendedor
class Vendedor extends Usuarios {
	
	public Vendedor (String nome, String email, String senha) {
		super (nome, email, senha);
		super.admin = false;
	}
	
	
	public void realizarVenda(Relatorio r) {
		System.out.println("venda realizada");
		r.realizarVendas(1);
	}
	
	@Override
	public void realizarLogOff() {
		System.out.println("Vendedor deslogou do sistema");
	}
}

//atendente
class Atendente extends Usuarios {
	
	public Atendente (String nome, String email, String senha) {
		super (nome, email, senha);
		super.admin = false;
	}
	
	public void receberPagamento(Relatorio r, double valor) {
		r.receberPagamento(valor);
	}
	
	public void fecharCaixa () {
		System.out.println("O caixa foi fechado");
	}
	
	
	@Override
	public void realizarLogOff() {
		System.out.println("Atendente deslogou do sistema");
	}
	
	@Override
	public void consultarVendas(Relatorio r) {
		System.out.println("Acesso negado!");
	}
	
}


