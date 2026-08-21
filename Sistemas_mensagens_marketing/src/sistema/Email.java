/** Implementa o envio de mensagens de marketing por e-mail. */
package sistema;


public class Email implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada por email");
	}
}