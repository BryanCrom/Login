import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //JFrame frame = new Controller("Login");
        //frame.setVisible(true);

        Validation val = new Validation();
        System.out.println(val.validateName("D.B. Cooper"));
    }
}
