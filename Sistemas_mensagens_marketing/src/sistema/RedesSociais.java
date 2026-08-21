/** Implementa o envio de mensagens de marketing por redes sociais. */
package sistema;

public class RedesSociais implements Mensagens{

	@Override
	public void enviarMensagem(String mensagem) {
		System.out.println("Mensagem enviada pelas Redes Sociais");
	}
}
