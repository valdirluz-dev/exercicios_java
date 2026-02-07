package br.com.my;

import java.util.Scanner;

import exception.EmptyStorageException;
import exception.UserNotFoundException;
import exception.ValidatorException;
import usermodel.UserModel;
import uservalidator.UserInputHelper;
import uservalidator.UserValidator;

public class Main {

    private static final UserDAO dao = new UserDAO();
    private static final Scanner sc = new Scanner(System.in);
    private static final UserInputHelper inputHelper = new UserInputHelper(sc);

    public static void main(String[] args) {
        while (true) {
            int userInput = readMenuOption();

            switch (MenuOption.values()[userInput - 1]) {

                case SAVE -> {
                    try {
                        UserModel user = inputHelper.readUserData(0); // 0 indica novo usuário
                        UserValidator.validate(user);
                        dao.save(user);
                        System.out.printf("Usuário salvo %s%n", user);
                    } catch (ValidatorException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case UPDATE -> {
                    try {
                        long id = inputHelper.readId();
                        UserModel user = inputHelper.readUserData(id);
                        UserValidator.validate(user);
                        dao.update(user);
                        System.out.printf("Usuário atualizado %s%n", user);
                    } catch (ValidatorException | UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case DELETE -> {
                    try {
                        long id = inputHelper.readId();
                        dao.delete(id);
                        System.out.println("Usuário excluído");
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("==========================\n");
                    }
                }

                case FIND_BY_ID -> {
                    try {
                        long id = inputHelper.readId();
                        UserModel user = dao.findById(id);
                        System.out.printf("Usuário com id %s: %s%n", id, user);
                    } catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados:");
                    System.out.println("=====================");
                    users.forEach(System.out::println);
                    System.out.println("==========fim==========");
                }

                case EXIT -> System.exit(0);
            }
        }
    }

    // ---------------- MÉTODO MENU ----------------
    private static int readMenuOption() {
        int option;
        while (true) {
            System.out.println();
            System.out.println("Bem vindo ao cadastro de usuários");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");

            String input = sc.nextLine().trim();
            try {
                option = Integer.parseInt(input);
                if (option < 1 || option > 6) {
                    System.out.println("Opção inválida. Digite um número entre 1 e 6.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números.");
            }
        }
        return option;
    }
}
