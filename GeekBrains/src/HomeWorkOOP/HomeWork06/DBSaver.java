package HomeWorkOOP.HomeWork06;

public class DBSaver implements ISave{

    private final User user;

    public DBSaver(User user) {
        this.user = user;
    }

    public void save() {
        System.out.println(user.getName() + " was saved in database");
    }
}
