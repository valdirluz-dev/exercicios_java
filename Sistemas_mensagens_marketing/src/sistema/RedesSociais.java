package sistema;

public class RedesSociais implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada pelas Redes Sociais");
	}
}
