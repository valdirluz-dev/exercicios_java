package users;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		var relatorio = new Relatorio();
		Usuarios usuario = null;

		while(true){

			System.out.print("sair (sim/não)? ");
			var sair = sc.nextLine();

			if (sair.equalsIgnoreCase("sim")) break;
			else if (sair.equalsIgnoreCase("não")) {
				
				System.out.print("tipo de usuario: ");
				var user = sc.nextLine();
				
				String nome, email, senha;
				
				System.out.print("nome: ");
				nome = sc.nextLine();

				System.out.print("email: ");
				email = sc.nextLine();

				System.out.print("senha: ");
				senha = sc.nextLine();

				if(user.equalsIgnoreCase("Gerente")) usuario = new Gerente(nome,email,senha);
				else if(user.equalsIgnoreCase("Vendedor")) usuario = new Vendedor(nome,email,senha);
				else if(user.equalsIgnoreCase("Atendente")) usuario = new Atendente (nome,email,senha);
				
				
				System.out.print("Digite seu email: ");
				email = sc.nextLine();
				System.out.print("Digite sua senha: ");
				senha = sc.nextLine();
				
				boolean condicao = usuario.realizarLogin(email,senha);
				
				if (condicao && (usuario != null)) {
							while (true) {
								if (usuario instanceof Gerente) System.out.print("Digite o que deseja fazer 1 = logoff, 2 = alterar dados, 3 = alterar senha, 4 = gerar relatório, 5 = consultar vendas: ");
								else if (usuario instanceof Vendedor) System.out.print("Digite o que deseja fazer 1 = logoff, 2 = alterar dados, 3 = alterar senha, 4 = realizar venda, 5 = consultar vendas: ");
								else if (usuario instanceof Atendente) System.out.print("Digite o que deseja fazer 1 = logoff, 2 = alterar dados, 3 = alterar senha, 4 = receber pagamento, 5 = fechar o caixa: ");
								var opcao = sc.nextLine();

								if (opcao.equalsIgnoreCase("1")) {
									usuario.realizarLogOff();
									break;
								}

								else if (opcao.equalsIgnoreCase("2")) {
									System.out.print("Digite o novo nome: ");
									nome = sc.nextLine();

									System.out.print("Digite o novo email: ");
									email = sc.nextLine();

									usuario.alterarDados(nome, email);
								}

								else if (opcao.equalsIgnoreCase("3")) {

									System.out.print("Digite a nova senha: ");
									senha = sc.nextLine();

									usuario.alterarSenha(senha);

								}

								else if (opcao.equalsIgnoreCase("4")) {
									if (usuario instanceof Gerente) ((Gerente) usuario).gerarRelatorioFinanceiro(relatorio);
									else if (usuario instanceof Vendedor) ((Vendedor) usuario).realizarVenda(relatorio);
									else {
										System.out.print("Digite o valor recebido: ");
										double valor = sc.nextDouble();
										sc.nextLine();
										((Atendente) usuario).receberPagamento(relatorio, valor);}
									}
								
								else if (opcao.equalsIgnoreCase("5")) {
									
									if ((usuario instanceof Gerente) || (usuario instanceof Vendedor)) usuario.consultarVendas(relatorio);
									else ((Atendente) usuario).fecharCaixa(); }
									
								else System.out.println("opção inválida, digite novamente.");
							}
						}	
					} 
				

			else System.out.println("Digite uma opção valida");

		}//fim do loop principal

		sc.close();
	}//fim do método main
}//fim da classe Main
