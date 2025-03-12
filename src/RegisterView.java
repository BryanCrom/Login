import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.awt.Font.BOLD;

public class RegisterView extends JPanel implements Images {

    private final JLabel registerMsg;

    private final JLabel firstNameMsg;
    private final JTextField firstNameField;
    private final JLabel firstNameRegisterValidateMsg;

    private final JLabel lastNameMsg;
    private final JTextField lastNameField;
    private final JLabel lastNameRegisterValidateMsg;

    private final JLabel emailMsg;
    private final JTextField emailRegisterField;
    private final JLabel emailRegisterValidateMsg;
    private final JLabel emailInUseMsg;

    private final JLabel passwordMsg;
    private final JPasswordField passwordRegisterField;
    private final JLabel passwordRegisterValidateMsg;

    private final JLabel passwordInfo;
    private final String passwordInfoMsg;

    private final JCheckBox showRegisterPassword;

    private final JButton registerBackBtn;
    private final JButton registerSubmitBtn;

    public RegisterView() {
        this.setLayout(null);

        registerMsg = new JLabel("Register", SwingConstants.CENTER);
        registerMsg.setFont(new Font("Dialog", BOLD, 14));
        registerMsg.setVisible(true);
        registerMsg.setBounds(90, 25, 200, 25);
        this.add(registerMsg);

        firstNameMsg = new JLabel("First Name:");
        firstNameMsg.setVisible(true);
        firstNameMsg.setBounds(40, 60, 200, 25);
        this.add(firstNameMsg);

        firstNameField = new JTextField();
        firstNameField.setVisible(true);
        firstNameField.setBounds(130, 60, 210, 25);
        this.add(firstNameField);

        firstNameRegisterValidateMsg = new JLabel("FIRST NAME IS INVALID");
        firstNameRegisterValidateMsg.setVisible(false);
        firstNameRegisterValidateMsg.setForeground(Color.RED);
        firstNameRegisterValidateMsg.setBounds(130, 85, 200, 25);
        this.add(firstNameRegisterValidateMsg);

        lastNameMsg = new JLabel("Last Name:");
        lastNameMsg.setVisible(true);
        lastNameMsg.setBounds(40, 110, 200, 25);
        this.add(lastNameMsg);

        lastNameField = new JTextField();
        lastNameField.setVisible(true);
        lastNameField.setBounds(130, 110, 210, 25);
        this.add(lastNameField);

        lastNameRegisterValidateMsg = new JLabel("LAST NAME IS INVALID");
        lastNameRegisterValidateMsg.setVisible(false);
        lastNameRegisterValidateMsg.setForeground(Color.RED);
        lastNameRegisterValidateMsg.setBounds(130, 135, 200, 25);
        this.add(lastNameRegisterValidateMsg);

        emailMsg = new JLabel("Email:");
        emailMsg.setVisible(true);
        emailMsg.setBounds(40, 160, 200, 25);
        this.add(emailMsg);

        emailRegisterField = new JTextField();
        emailRegisterField.setVisible(true);
        emailRegisterField.setBounds(130, 160, 210, 25);
        this.add(emailRegisterField);

        emailRegisterValidateMsg = new JLabel("EMAIL IS INVALID");
        emailRegisterValidateMsg.setVisible(false);
        emailRegisterValidateMsg.setForeground(Color.RED);
        emailRegisterValidateMsg.setBounds(130, 185, 200, 25);
        this.add(emailRegisterValidateMsg);

        emailInUseMsg = new JLabel("EMAIL TAKEN");
        emailInUseMsg.setVisible(false);
        emailInUseMsg.setForeground(Color.RED);
        emailInUseMsg.setBounds(130, 185, 200, 25);
        this.add(emailInUseMsg);

        passwordMsg = new JLabel("Password:");
        passwordMsg.setVisible(true);
        passwordMsg.setBounds(40, 210, 200, 25);
        this.add(passwordMsg);

        showRegisterPassword = new JCheckBox(new ImageIcon(hide));
        showRegisterPassword.setVisible(true);
        showRegisterPassword.setBounds(102, 213, 22, 20);
        this.add(showRegisterPassword);

        ToolTipManager.sharedInstance().setInitialDelay(0);
        ToolTipManager.sharedInstance().setDismissDelay(10000);
        passwordInfo = new JLabel(UIManager.getIcon("OptionPane.informationIcon"));
        passwordInfoMsg = "<html><p>Password must be at least 8 characters<br>Password must contain a number<br>Password must contain a lowercase letter<br>Password must contain an uppercase letter<br>Password must contain a special character<p><html>";
        passwordInfo.setToolTipText(passwordInfoMsg);
        passwordInfo.setVisible(true);
        passwordInfo.setBounds(345, 207, 35, 35);
        this.add(passwordInfo);

        passwordRegisterField = new JPasswordField();
        passwordRegisterField.setVisible(true);
        passwordRegisterField.setBounds(130, 210, 210, 25);
        this.add(passwordRegisterField);

        passwordRegisterValidateMsg = new JLabel("PASSWORD IS INVALID");
        passwordRegisterValidateMsg.setVisible(false);
        passwordRegisterValidateMsg.setForeground(Color.RED);
        passwordRegisterValidateMsg.setBounds(130, 235, 200, 25);
        this.add(passwordRegisterValidateMsg);

        registerBackBtn = new JButton("Back");
        registerBackBtn.setVisible(true);
        registerBackBtn.setBounds(90, 285, 100, 25);
        this.add(registerBackBtn);

        registerSubmitBtn = new JButton("Submit");
        registerSubmitBtn.setVisible(true);
        registerSubmitBtn.setBounds(200, 285, 100, 25);
        this.add(registerSubmitBtn);
    }

    public JLabel getRegisterMsg() {
        return registerMsg;
    }

    public JLabel getFirstNameMsg() {
        return firstNameMsg;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public JLabel getFirstNameRegisterValidateMsg() {
        return firstNameRegisterValidateMsg;
    }

    public JLabel getLastNameMsg() {
        return lastNameMsg;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public JLabel getLastNameRegisterValidateMsg() {
        return lastNameRegisterValidateMsg;
    }

    public JLabel getEmailMsg() {
        return emailMsg;
    }

    public JTextField getEmailRegisterField() {
        return emailRegisterField;
    }

    public JLabel getEmailRegisterValidateMsg() {
        return emailRegisterValidateMsg;
    }

    public JLabel getEmailInUseMsg() {
        return emailInUseMsg;
    }

    public JLabel getPasswordMsg() {
        return passwordMsg;
    }

    public JPasswordField getPasswordRegisterField() {
        return passwordRegisterField;
    }

    public JLabel getPasswordRegisterValidateMsg() {
        return passwordRegisterValidateMsg;
    }

    public JLabel getPasswordInfo() {
        return passwordInfo;
    }

    public String getPasswordInfoMsg() {
        return passwordInfoMsg;
    }

    public Image getHide() {
        return hide;
    }

    public Image getShow() {
        return show;
    }

    public JCheckBox getShowRegisterPassword() {
        return showRegisterPassword;
    }

    public JButton getRegisterBackBtn() {
        return registerBackBtn;
    }

    public JButton getRegisterSubmitBtn() {
        return registerSubmitBtn;
    }
}
