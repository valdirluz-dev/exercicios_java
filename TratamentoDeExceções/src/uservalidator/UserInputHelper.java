package uservalidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import usermodel.UserModel;

public class UserInputHelper {

    private final Scanner sc;

    public UserInputHelper(Scanner sc) {
        this.sc = sc;
    }

    public long readId() {
        while (true) {
            System.out.println("Informe o identificador: ");
            String input = sc.nextLine().trim();
            try {
                return Long.parseLong(input);
            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Digite apenas números.");
            }
        }
    }

    public String readName() {
        System.out.println("Informe o nome de usuário: ");
        return sc.nextLine().trim();
    }

    public String readEmail() {
        System.out.println("Informe o email do usuário: ");
        return sc.nextLine().trim();
    }

    public LocalDate readBirthday() {
        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
        String birthdayString = sc.nextLine().trim();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(birthdayString, formatter);
        } catch (Exception e) {
            return null; // validação vai ser feita na camada UserValidator
        }
    }

    public UserModel readUserData(long id) {
        String name = readName();
        String email = readEmail();
        LocalDate birthday = readBirthday();
        return new UserModel(id, name, email, birthday);
    }
}
