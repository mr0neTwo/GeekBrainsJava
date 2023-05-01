package HomeWorkOOP.HomeWork05.Model;

import java.util.StringJoiner;

public class UserMapper {

    private final String separator;

    public UserMapper(String separator) {
        this.separator = separator;
    }

    public String map(User user) {
        StringJoiner result = new StringJoiner(separator);
        result.add(user.getId());
        result.add(user.getFirstName());
        result.add(user.getLastName());
        result.add(user.getPhone());
        
        return result.toString();
    }

    public User map(String line) {
        String[] lines = line.split(separator);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
