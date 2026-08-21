/** Implementa o envio de mensagens de marketing por WhatsApp. */
package sistema;

public class WhatsApp implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada por WhatsApp");
	}
}