import javax.swing.*;
import java.awt.*;

public class SignInView extends JPanel{

    private JLabel signInMsg;

    private JLabel emailSignInMsg;
    private JTextField emailSignInField;

    private JLabel passwordSignInMsg;
    private JPasswordField passwordSignInField;
    private JLabel wrongSignInMsg;

    private JButton signInBackBtn;
    private JButton signInSubmitBtn;

    public SignInView() {
        setLayout(null);

        this.signInMsg = new JLabel("SIGN IN", SwingConstants.CENTER);
        this.signInMsg.setVisible(true);
        this.signInMsg.setBounds(40, 30, 200, 25);
        this.add(signInMsg);

        this.emailSignInMsg = new JLabel("EMAIL:");
        this.emailSignInMsg.setVisible(true);
        this.emailSignInMsg.setBounds(40, 60, 200, 25);
        this.add(emailSignInMsg);

        this.emailSignInField = new JTextField();
        this.emailSignInField.setVisible(true);
        this.emailSignInField.setBounds(40, 85, 210, 25);
        this.add(emailSignInField);

        this.passwordSignInMsg = new JLabel("PASSWORD:");
        this.passwordSignInMsg.setVisible(true);
        this.passwordSignInMsg.setBounds(40, 110, 200, 25);
        this.add(passwordSignInMsg);

        this.passwordSignInField = new JPasswordField();
        this.passwordSignInField.setVisible(true);
        this.passwordSignInField.setBounds(40, 135, 210, 25);
        this.add(passwordSignInField);

        this.wrongSignInMsg = new JLabel("Email or Password is Wrong");
        this.wrongSignInMsg.setVisible(false);
        this.wrongSignInMsg.setForeground(Color.RED);
        this.wrongSignInMsg.setBounds(40, 160, 200, 25);
        this.add(wrongSignInMsg);

        this.signInBackBtn = new JButton("BACK");
        this.signInBackBtn.setVisible(true);
        this.signInBackBtn.setSize(100, 25);
        this.signInBackBtn.setLocation(40, 200);
        this.add(signInBackBtn);

        this.signInSubmitBtn = new JButton("SUBMIT");
        this.signInSubmitBtn.setVisible(true);
        this.signInSubmitBtn.setSize(100, 25);
        this.signInSubmitBtn.setLocation(150, 200);
        this.add(signInSubmitBtn);
    }

    public JLabel getSignInMsg() {
        return signInMsg;
    }

    public void setSignInMsg(JLabel signInMsg) {
        this.signInMsg = signInMsg;
    }

    public JLabel getEmailSignInMsg() {
        return emailSignInMsg;
    }

    public void setEmailSignInMsg(JLabel emailSignInMsg) {
        this.emailSignInMsg = emailSignInMsg;
    }

    public JTextField getEmailSignInField() {
        return emailSignInField;
    }

    public void setEmailSignInField(JTextField emailSignInField) {
        this.emailSignInField = emailSignInField;
    }

    public JLabel getPasswordSignInMsg() {
        return passwordSignInMsg;
    }

    public void setPasswordSignInMsg(JLabel passwordSignInMsg) {
        this.passwordSignInMsg = passwordSignInMsg;
    }

    public JPasswordField getPasswordSignInField() {
        return passwordSignInField;
    }

    public void setPasswordSignInField(JPasswordField passwordSignInField) {
        this.passwordSignInField = passwordSignInField;
    }

    public JLabel getWrongSignInMsg() {
        return wrongSignInMsg;
    }

    public void setWrongSignInMsg(JLabel wrongSignInMsg) {
        this.wrongSignInMsg = wrongSignInMsg;
    }

    public JButton getSignInBackBtn() {
        return signInBackBtn;
    }

    public void setSignInBackBtn(JButton signInBackBtn) {
        this.signInBackBtn = signInBackBtn;
    }

    public JButton getSignInSubmitBtn() {
        return signInSubmitBtn;
    }

    public void setSignInSubmitBtn(JButton signInSubmitBtn) {
        this.signInSubmitBtn = signInSubmitBtn;
    }
}
