package sistema;


public class Email implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada por email");
	}
}