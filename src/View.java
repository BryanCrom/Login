import javax.swing.*;

public class View extends JPanel {

    private JLabel welcomeMsg;

    private JButton signUpBtn;

    private JButton signInBtn;

    public View() {
        setLayout(null);

        this.welcomeMsg = new JLabel("Welcome", SwingConstants.CENTER);
        this.welcomeMsg.setVisible(true);
        this.welcomeMsg.setBounds(100, 25, 200, 30);
        this.add(this.welcomeMsg);

        this.signUpBtn = new JButton("Sign Up");
        this.signUpBtn.setLocation(70, 75);
        this.signUpBtn.setSize(100, 25);
        this.add(this.signUpBtn);

        this.signInBtn = new JButton("Sign In");
        this.signInBtn.setLocation(240, 75);
        this.signInBtn.setSize(100, 25);
        this.add(this.signInBtn);
    }
}
