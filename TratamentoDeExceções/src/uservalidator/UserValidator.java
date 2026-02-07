package uservalidator;

import java.time.LocalDate;

import exception.ValidatorException;
import usermodel.UserModel;

public class UserValidator {

    public static void validate(UserModel user) throws ValidatorException {
        if (user.getName() == null || user.getName().isBlank())
            throw new ValidatorException("Nome obrigatório.");
        if (user.getName().length() < 2)
            throw new ValidatorException("O nome deve ter pelo menos 2 caracteres.");

        if (user.getEmail() == null || user.getEmail().isBlank())
            throw new ValidatorException("Email obrigatório.");
        if (!user.getEmail().contains("@") || !user.getEmail().contains("."))
            throw new ValidatorException("Email inválido.");

        LocalDate birthday = user.getBirthday();
        if (birthday == null)
            throw new ValidatorException("Data de nascimento obrigatória ou inválida.");
    }
}
