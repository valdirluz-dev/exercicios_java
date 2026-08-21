/** Sinaliza que os dados informados pelo usuário são inválidos. */
package exception;

public class ValidatorException extends RuntimeException{
	
	public ValidatorException(String message) {
	super(message);
	}
}
