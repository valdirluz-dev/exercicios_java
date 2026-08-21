/** Sinaliza que o usuário solicitado não foi encontrado. */
package exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(final String message) {
		super(message);
	}
	
}
