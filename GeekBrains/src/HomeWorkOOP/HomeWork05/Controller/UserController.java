package HomeWorkOOP.HomeWork05.Controller;

import HomeWorkOOP.HomeWork05.Model.Repository;
import HomeWorkOOP.HomeWork05.Model.User;

import java.util.List;

public class UserController {
    private final Repository repository;


    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> getUsers(){
        return repository.getAllUsers();
    }

    public void updateUser(User updatedUser) {
        repository.updateUser(updatedUser);

    }

    public void deleteUser(String id) {
        repository.deleteUser(id);
    }
    
}
