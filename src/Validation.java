//Purpose: validate user input for name, email, and password using regex
//Author: Bryan Crombach

import java.util.regex.Pattern;

public class Validation {

    //regex validation for names
    public boolean validateName(String name) {
        return Pattern.matches("^[a-zA-Z.'-]+( [a-zA-Z.'-]+)*$", name);
    }

    //regex validation for emails
    public boolean validateEmail(String email){
        return Pattern.matches("^([a-zA-Z0-9][\\w.-]{0,62}[a-zA-Z0-9]|[a-zA-Z0-9])[@]([a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]|[a-zA-Z0-9])(([.][a-zA-Z]{2,5})+)$", email);
    }

    //validation for passwords
    public boolean validatePassword(String password){
        return Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[^a-zA-Z0-9\\s]).{8,}$", password);
        //must be at least 8 characters
        //must contain a number
        //must contain an uppercase letter
        //must contain a lowercase letter
        //must contain a special character
    }
}
