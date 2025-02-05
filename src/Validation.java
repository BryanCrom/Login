import java.util.regex.Pattern;

public class Validation {

    public boolean validateName(String name) {
        return Pattern.matches("^[a-zA-Z.'-]+( [a-zA-Z.'-]+)*$", name);
    }

    public boolean validateEmail(String email){
        return Pattern.matches("", email);
    }

    public boolean validatePassword(String password){
        return Pattern.matches("", password);
    }
}
