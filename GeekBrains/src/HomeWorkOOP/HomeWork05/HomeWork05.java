package HomeWorkOOP.HomeWork05;

import HomeWorkOOP.HomeWork05.Controller.UserController;
import HomeWorkOOP.HomeWork05.Model.*;
import HomeWorkOOP.HomeWork05.Views.ViewUser;

public class HomeWork05 {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
