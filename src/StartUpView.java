import javax.swing.*;

public class StartUpView extends JPanel {

    private JLabel welcomeMsg;

    private JButton signUpBtn;

    private JButton signInBtn;

    public StartUpView() {
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

    public JLabel getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(JLabel welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public JButton getSignUpBtn() {
        return signUpBtn;
    }

    public void setSignUpBtn(JButton signUpBtn) {
        this.signUpBtn = signUpBtn;
    }

    public JButton getSignInBtn() {
        return signInBtn;
    }

    public void setSignInBtn(JButton signInBtn) {
        this.signInBtn = signInBtn;
    }
}
