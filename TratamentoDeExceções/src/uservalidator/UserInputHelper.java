package uservalidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exception.ValidatorException;
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
		while(true) {
			try {
				System.out.println("Informe o nome de usuário: ");
				var name = sc.nextLine().trim();
				UserValidator.validateName(name);
				return name;
			} catch(ValidatorException e) {
				System.out.println(e.getMessage());
			}}}

	public String readEmail() {

		while(true) {
			try {
				System.out.println("Informe o email do usuário: ");
				var email = sc.nextLine().trim();
				UserValidator.validateEmail(email);
				return email;
			}catch(ValidatorException e) {
				System.out.println(e.getMessage());
			}}}

	public LocalDate readBirthday() {
		while(true) {
			System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
			String birthdayString = sc.nextLine().trim();
			try {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				return LocalDate.parse(birthdayString, formatter);
			} catch (Exception e) {
				System.out.println("Data de nascimento obrigatória ou inválida.");
			}}}

	public UserModel readUserData(long id) {
		String name = readName();
		String email = readEmail();
		LocalDate birthday = readBirthday();
		UserModel user = new UserModel(id, name, email, birthday); 
		return user;
	}
}
