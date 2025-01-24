import javax.swing.*;

public class SignUpView extends JPanel {

    private JLabel signUpMsg;

    private JLabel firstNameMsg;
    private JTextField firstNameField;

    private JLabel lastNameMsg;
    private JTextField lastNameField;

    private JLabel emailMsg;
    private JTextField emailField;

    private JLabel passwordMsg;
    private JPasswordField passwordField;

    private JButton signUpBackBtn;
    private JButton signUpSubmitBtn;

    public SignUpView() {
        setLayout(null);

        this.signUpMsg = new JLabel("Sign Up", SwingConstants.CENTER);
        this.signUpMsg.setVisible(true);
        this.signUpMsg.setBounds(10, 10, 300, 200);
        this.add(this.signUpMsg);

        this.firstNameMsg = new JLabel("First Name:");
        this.firstNameMsg.setVisible(true);
        this.firstNameMsg.setBounds(10, 50, 300, 200);
        this.add(this.firstNameMsg);

        this.firstNameField = new JTextField();
        this.firstNameField.setVisible(true);
        this.firstNameField.setBounds(10, 80, 300, 200);
        this.add(this.firstNameField);

        this.lastNameMsg = new JLabel("Last Name:");
        this.lastNameMsg.setVisible(true);
        this.lastNameMsg.setBounds(10, 100, 300, 200);
        this.add(this.lastNameMsg);

        this.lastNameField = new JTextField();
        this.lastNameField.setVisible(true);
        this.lastNameField.setBounds(10, 140, 300, 200);
        this.add(this.lastNameField);

        this.emailMsg = new JLabel("Email:");
        this.emailMsg.setVisible(true);
        this.emailMsg.setBounds(10, 170, 300, 200);
        this.add(this.emailMsg);

        this.passwordMsg = new JLabel("Password:");
        this.passwordMsg.setVisible(true);
        this.passwordMsg.setBounds(10, 200, 300, 200);
        this.add(this.passwordMsg);

        this.passwordField = new JPasswordField();
        this.passwordField.setVisible(true);
        this.passwordField.setBounds(10, 240, 300, 200);
        this.add(this.passwordField);

        this.signUpBackBtn = new JButton("Back");
        this.signUpBackBtn.setVisible(true);
        this.signUpBackBtn.setBounds(10, 270, 300, 200);
        this.add(this.signUpBackBtn);

        this.signUpSubmitBtn = new JButton("Submit");
        this.signUpSubmitBtn.setVisible(true);
        this.signUpSubmitBtn.setBounds(10, 320, 300, 200);
        this.add(this.signUpSubmitBtn);
    }

    public JLabel getSignUpMsg() {
        return signUpMsg;
    }

    public void setSignUpMsg(JLabel signUpMsg) {
        this.signUpMsg = signUpMsg;
    }

    public JLabel getFirstNameMsg() {
        return firstNameMsg;
    }

    public void setFirstNameMsg(JLabel firstNameMsg) {
        this.firstNameMsg = firstNameMsg;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(JTextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public JLabel getLastNameMsg() {
        return lastNameMsg;
    }

    public void setLastNameMsg(JLabel lastNameMsg) {
        this.lastNameMsg = lastNameMsg;
    }

    public JLabel getEmailMsg() {
        return emailMsg;
    }

    public void setEmailMsg(JLabel emailMsg) {
        this.emailMsg = emailMsg;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public void setEmailField(JTextField emailField) {
        this.emailField = emailField;
    }

    public JLabel getPasswordMsg() {
        return passwordMsg;
    }

    public void setPasswordMsg(JLabel passwordMsg) {
        this.passwordMsg = passwordMsg;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getSignUpBackBtn() {
        return signUpBackBtn;
    }

    public void setSignUpBackBtn(JButton signUpBackBtn) {
        this.signUpBackBtn = signUpBackBtn;
    }

    public JButton getSignUpSubmitBtn() {
        return signUpSubmitBtn;
    }

    public void setSignUpSubmitBtn(JButton signUpSubmitBtn) {
        this.signUpSubmitBtn = signUpSubmitBtn;
    }
}
