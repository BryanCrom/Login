import javax.swing.*;
import java.awt.*;

public class RegisterView extends JPanel {

    private JLabel registerMsg;

    private JLabel firstNameMsg;
    private JTextField firstNameField;
    private JLabel firstNameRegisterValidateMsg;

    private JLabel lastNameMsg;
    private JTextField lastNameField;
    private JLabel lastNameRegisterValidateMsg;

    private JLabel emailMsg;
    private JTextField emailRegisterField;
    private JLabel emailRegisterValidateMsg;
    private JLabel emailInUseMsg;

    private JLabel passwordMsg;
    private JPasswordField passwordRegisterField;
    private JLabel passwordRegisterValidateMsg;

    private JButton registerBackBtn;
    private JButton registerSubmitBtn;

    public RegisterView() {
        setLayout(null);

        this.registerMsg = new JLabel("Register", SwingConstants.CENTER);
        this.registerMsg.setVisible(true);
        this.registerMsg.setBounds(90, 25, 200, 25);
        this.add(this.registerMsg);

        this.firstNameMsg = new JLabel("First Name:");
        this.firstNameMsg.setVisible(true);
        this.firstNameMsg.setBounds(40, 60, 200, 25);
        this.add(this.firstNameMsg);

        this.firstNameField = new JTextField();
        this.firstNameField.setVisible(true);
        this.firstNameField.setBounds(130, 60, 210, 25);
        this.add(this.firstNameField);

        this.firstNameRegisterValidateMsg = new JLabel("FIRST NAME IS INVALID");
        this.firstNameRegisterValidateMsg.setVisible(false);
        this.firstNameRegisterValidateMsg.setForeground(Color.RED);
        this.firstNameRegisterValidateMsg.setBounds(130, 85, 200, 25);
        this.add(this.firstNameRegisterValidateMsg);

        this.lastNameMsg = new JLabel("Last Name:");
        this.lastNameMsg.setVisible(true);
        this.lastNameMsg.setBounds(40, 110, 200, 25);
        this.add(this.lastNameMsg);

        this.lastNameField = new JTextField();
        this.lastNameField.setVisible(true);
        this.lastNameField.setBounds(130, 110, 210, 25);
        this.add(this.lastNameField);

        this.lastNameRegisterValidateMsg = new JLabel("LAST NAME IS INVALID");
        this.lastNameRegisterValidateMsg.setVisible(false);
        this.lastNameRegisterValidateMsg.setForeground(Color.RED);
        this.lastNameRegisterValidateMsg.setBounds(130, 135, 200, 25);
        this.add(this.lastNameRegisterValidateMsg);

        this.emailMsg = new JLabel("Email:");
        this.emailMsg.setVisible(true);
        this.emailMsg.setBounds(40, 160, 200, 25);
        this.add(this.emailMsg);

        this.emailRegisterField = new JTextField();
        this.emailRegisterField.setVisible(true);
        this.emailRegisterField.setBounds(130, 160, 210, 25);
        this.add(this.emailRegisterField);

        this.emailRegisterValidateMsg = new JLabel("EMAIL IS INVALID");
        this.emailRegisterValidateMsg.setVisible(false);
        this.emailRegisterValidateMsg.setForeground(Color.RED);
        this.emailRegisterValidateMsg.setBounds(130, 185, 200, 25);
        this.add(this.emailRegisterValidateMsg);

        this.emailInUseMsg = new JLabel("EMAIL TAKEN");
        this.emailInUseMsg.setVisible(false);
        this.emailInUseMsg.setForeground(Color.RED);
        this.emailInUseMsg.setBounds(130, 185, 200, 25);
        this.add(this.emailInUseMsg);

        this.passwordMsg = new JLabel("Password:");
        this.passwordMsg.setVisible(true);
        this.passwordMsg.setBounds(40, 210, 200, 25);
        this.add(this.passwordMsg);

        this.passwordRegisterField = new JPasswordField();
        this.passwordRegisterField.setVisible(true);
        this.passwordRegisterField.setBounds(130, 210, 210, 25);
        this.add(this.passwordRegisterField);

        this.passwordRegisterValidateMsg = new JLabel("PASSWORD IS INVALID");
        this.passwordRegisterValidateMsg.setVisible(false);
        this.passwordRegisterValidateMsg.setForeground(Color.RED);
        this.passwordRegisterValidateMsg.setBounds(130, 235, 200, 25);
        this.add(this.passwordRegisterValidateMsg);

        this.registerBackBtn = new JButton("Back");
        this.registerBackBtn.setVisible(true);
        this.registerBackBtn.setBounds(90, 260, 100, 25);
        this.add(this.registerBackBtn);

        this.registerSubmitBtn = new JButton("Submit");
        this.registerSubmitBtn.setVisible(true);
        this.registerSubmitBtn.setBounds(200, 260, 100, 25);
        this.add(this.registerSubmitBtn);
    }

    public JLabel getRegisterMsg() {
        return registerMsg;
    }

    public void setRegisterMsg(JLabel registerMsg) {
        this.registerMsg = registerMsg;
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

    public JLabel getFirstNameRegisterValidateMsg() {
        return firstNameRegisterValidateMsg;
    }

    public void setFirstNameRegisterValidateMsg(JLabel firstNameRegisterValidateMsg) {
        this.firstNameRegisterValidateMsg = firstNameRegisterValidateMsg;
    }

    public JLabel getLastNameMsg() {
        return lastNameMsg;
    }

    public void setLastNameMsg(JLabel lastNameMsg) {
        this.lastNameMsg = lastNameMsg;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public JLabel getLastNameRegisterValidateMsg() {
        return lastNameRegisterValidateMsg;
    }

    public void setLastNameRegisterValidateMsg(JLabel lastNameRegisterValidateMsg) {
        this.lastNameRegisterValidateMsg = lastNameRegisterValidateMsg;
    }

    public JLabel getEmailMsg() {
        return emailMsg;
    }

    public void setEmailMsg(JLabel emailMsg) {
        this.emailMsg = emailMsg;
    }

    public JTextField getEmailRegisterField() {
        return emailRegisterField;
    }

    public void setEmailRegisterField(JTextField emailRegisterField) {
        this.emailRegisterField = emailRegisterField;
    }

    public JLabel getEmailRegisterValidateMsg() {
        return emailRegisterValidateMsg;
    }

    public void setEmailRegisterValidateMsg(JLabel emailRegisterValidateMsg) {
        this.emailRegisterValidateMsg = emailRegisterValidateMsg;
    }

    public JLabel getEmailInUseMsg() {
        return emailInUseMsg;
    }

    public void setEmailInUseMsg(JLabel emailInUseMsg) {
        this.emailInUseMsg = emailInUseMsg;
    }

    public JLabel getPasswordMsg() {
        return passwordMsg;
    }

    public void setPasswordMsg(JLabel passwordMsg) {
        this.passwordMsg = passwordMsg;
    }

    public JPasswordField getPasswordRegisterField() {
        return passwordRegisterField;
    }

    public void setPasswordRegisterField(JPasswordField passwordRegisterField) {
        this.passwordRegisterField = passwordRegisterField;
    }

    public JLabel getPasswordRegisterValidateMsg() {
        return passwordRegisterValidateMsg;
    }

    public void setPasswordRegisterValidateMsg(JLabel passwordRegisterValidateMsg) {
        this.passwordRegisterValidateMsg = passwordRegisterValidateMsg;
    }

    public JButton getRegisterBackBtn() {
        return registerBackBtn;
    }

    public void setRegisterBackBtn(JButton registerBackBtn) {
        this.registerBackBtn = registerBackBtn;
    }

    public JButton getRegisterSubmitBtn() {
        return registerSubmitBtn;
    }

    public void setRegisterSubmitBtn(JButton registerSubmitBtn) {
        this.registerSubmitBtn = registerSubmitBtn;
    }
}
