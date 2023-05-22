package HomeWorkOOP.HomeWork06;

public class EmailReporter implements IReport {

    private final User user;

    public EmailReporter(User user) {
        this.user = user;
    }

    public void report(){
        System.out.println("Send email for user: " + user.getName());
    }
}
