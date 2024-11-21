//Account class to create Account objects for login information
public class Account {

    //variables that the database needs to know for a new account
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //constructor of the objects
    public Account(String firstName, String lastName, String email, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
