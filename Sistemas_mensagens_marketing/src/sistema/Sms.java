/** Implementa o envio de mensagens de marketing por SMS. */
package sistema;

public class Sms implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada por Sms");
	}
}
	

