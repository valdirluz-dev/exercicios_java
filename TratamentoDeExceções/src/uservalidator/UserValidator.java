package uservalidator;

import exception.ValidatorException;

public class UserValidator {

    public static void validateName(String name) throws ValidatorException {
        if (name == null || name.isBlank())
            throw new ValidatorException("Nome obrigatório.");
        if (name.length() < 2)
            throw new ValidatorException("O nome deve ter pelo menos 2 caracteres.");}

    public static void validateEmail(String email) {
        if (email == null || email.isBlank())
            throw new ValidatorException("Email obrigatório.");
        if (!email.contains("@") || !email.contains("."))
            throw new ValidatorException("Email inválido.");
        }
}
