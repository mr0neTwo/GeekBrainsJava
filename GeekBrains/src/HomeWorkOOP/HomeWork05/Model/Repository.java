package HomeWorkOOP.HomeWork05.Model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);

    void updateUser(User user);

    void deleteUser(String id);
}
