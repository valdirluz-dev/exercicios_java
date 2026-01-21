package sistema;

public class WhatsApp implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada por WhatsApp");
	}
}