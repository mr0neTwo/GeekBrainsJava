package HomeWorkOOP.HomeWork05.Views;

import HomeWorkOOP.HomeWork05.Controller.UserController;
import HomeWorkOOP.HomeWork05.Model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {
    private UserController userController;
    private ValidateData validate = new ValidateData();

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands command;

        while (true) {
            try {
                String inputCommand = prompt("Введите команду: ");
                command = Commands.valueOf(inputCommand.toUpperCase());

                if (command == Commands.EXIT) return;
                switch (command) {
                    case CREATE -> createUser();
                    case READ -> readUser();
                    case LIST -> printAllUsers();
                    case UPDATE -> updateUser();
                    case DELETE -> deleteUser();
                }

            } catch (Exception error) {
                System.out.println(error.getMessage());
            }
        }
    }

    private void deleteUser() {
        String id = prompt("Идентификатор пользователя: ");
        userController.deleteUser(id);
    }

    private void createUser() {
        userController.saveUser(inputUser());
    }
    private User inputUser(){
        String firstName;
        String lastName;
        String phone;
        do {
            firstName = prompt("Имя: ");
        } while(validate.checkFirstName(firstName));
        do {
            lastName = prompt("Фамилия: ");
        } while( validate.checkLastName(lastName));
        do {
            System.out.println("Формат: +7(000)0000000");
            phone = prompt("Номер телефона: ");
        } while(validate.validatePhone(phone));
        
        return  new User(firstName, lastName, phone);
    }
    private String readUser() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private void updateUser() {
        String id = readUser();
        User updatedUser = inputUser();
        updatedUser.setId(id);
        userController.updateUser(updatedUser);
    }

    private void printAllUsers() {
        List<User> users = userController.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
