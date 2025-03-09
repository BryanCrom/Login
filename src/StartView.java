import javax.swing.*;

public class StartView extends JPanel {

    private JLabel welcomeMsg;

    private JButton registerBtn;

    private JButton signInBtn;

    public StartView() {
        setLayout(null);

        this.welcomeMsg = new JLabel("Welcome", SwingConstants.CENTER);
        this.welcomeMsg.setVisible(true);
        this.welcomeMsg.setBounds(40, 25, 200, 30);
        this.add(this.welcomeMsg);

        this.registerBtn = new JButton("Register");
        this.registerBtn.setLocation(35, 75);
        this.registerBtn.setSize(100, 25);
        this.add(this.registerBtn);

        this.signInBtn = new JButton("Sign In");
        this.signInBtn.setLocation(155, 75);
        this.signInBtn.setSize(100, 25);
        this.add(this.signInBtn);
    }

    public JLabel getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(JLabel welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public JButton getRegisterBtn() {
        return registerBtn;
    }

    public void setRegisterBtn(JButton signUpBtn) {
        this.registerBtn = signUpBtn;
    }

    public JButton getSignInBtn() {
        return signInBtn;
    }

    public void setSignInBtn(JButton signInBtn) {
        this.signInBtn = signInBtn;
    }
}
