package HomeWorkOOP.HomeWork05.Views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {
    private final Pattern namePattern = Pattern.compile("^\\S+$", Pattern.MULTILINE);
    private final Pattern phonePattern = Pattern.compile("^\\+7\\(\\d{3}\\)\\d{7}$", Pattern.MULTILINE); // формат +7(000)0000000
    
    public boolean checkFirstName(String firstName){
        Matcher matcher = namePattern.matcher(firstName);
        return !matcher.find();
    }

    public boolean checkLastName(String firstName){
        Matcher matcher = namePattern.matcher(firstName);
        return !matcher.find();
    }

    public boolean validatePhone(String phoneNumber) {

        Matcher matcher = phonePattern.matcher(phoneNumber);
        return !matcher.find();
    }
}
