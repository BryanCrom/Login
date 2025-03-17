import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class RegistrationView extends JPanel implements Images {

    private final JLabel registrationLabel;

    private final JLabel firstNameLabel;
    private final JTextField firstNameField;
    private final JLabel firstNameValidationLabel;

    private final JLabel lastNameLabel;
    private final JTextField lastNameField;
    private final JLabel lastNameValidationLabel;

    private final JLabel emailLabel;
    private final JTextField emailField;
    private final JLabel emailValidationLabel;
    private final JLabel emailInUseLabel;

    private final JLabel passwordLabel;
    private final JPasswordField passwordField;
    private final JLabel passwordValidationLabel;

    private final JLabel passwordRulesLabel;
    private final String passwordRules;

    private final JCheckBox showPasswordCheckBox;

    private final JButton backBtn;
    private final JButton submitBtn;

    public RegistrationView() {
        this.setLayout(null);

        registrationLabel = new JLabel("Register", SwingConstants.CENTER);
        registrationLabel.setFont(new Font("Dialog", BOLD, 14));
        registrationLabel.setVisible(true);
        registrationLabel.setBounds(90, 25, 200, 25);
        this.add(registrationLabel);

        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setVisible(true);
        firstNameLabel.setBounds(40, 60, 200, 25);
        this.add(firstNameLabel);

        firstNameField = new JTextField();
        firstNameField.setVisible(true);
        firstNameField.setBounds(130, 60, 210, 25);
        this.add(firstNameField);

        firstNameValidationLabel = new JLabel("FIRST NAME IS INVALID");
        firstNameValidationLabel.setVisible(false);
        firstNameValidationLabel.setForeground(Color.RED);
        firstNameValidationLabel.setBounds(130, 85, 200, 25);
        this.add(firstNameValidationLabel);

        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setVisible(true);
        lastNameLabel.setBounds(40, 110, 200, 25);
        this.add(lastNameLabel);

        lastNameField = new JTextField();
        lastNameField.setVisible(true);
        lastNameField.setBounds(130, 110, 210, 25);
        this.add(lastNameField);

        lastNameValidationLabel = new JLabel("LAST NAME IS INVALID");
        lastNameValidationLabel.setVisible(false);
        lastNameValidationLabel.setForeground(Color.RED);
        lastNameValidationLabel.setBounds(130, 135, 200, 25);
        this.add(lastNameValidationLabel);

        emailLabel = new JLabel("Email:");
        emailLabel.setVisible(true);
        emailLabel.setBounds(40, 160, 200, 25);
        this.add(emailLabel);

        emailField = new JTextField();
        emailField.setVisible(true);
        emailField.setBounds(130, 160, 210, 25);
        this.add(emailField);

        emailValidationLabel = new JLabel("EMAIL IS INVALID");
        emailValidationLabel.setVisible(false);
        emailValidationLabel.setForeground(Color.RED);
        emailValidationLabel.setBounds(130, 185, 200, 25);
        this.add(emailValidationLabel);

        emailInUseLabel = new JLabel("EMAIL TAKEN");
        emailInUseLabel.setVisible(false);
        emailInUseLabel.setForeground(Color.RED);
        emailInUseLabel.setBounds(130, 185, 200, 25);
        this.add(emailInUseLabel);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setVisible(true);
        passwordLabel.setBounds(40, 210, 200, 25);
        this.add(passwordLabel);

        ToolTipManager.sharedInstance().setInitialDelay(0);
        ToolTipManager.sharedInstance().setDismissDelay(10000);

        showPasswordCheckBox = new JCheckBox(new ImageIcon(hide));
        showPasswordCheckBox.setVisible(true);
        showPasswordCheckBox.setBounds(102, 212, 22, 20);
        showPasswordCheckBox.setToolTipText("click me");
        this.add(showPasswordCheckBox);

        passwordRulesLabel = new JLabel(UIManager.getIcon("OptionPane.informationIcon"));
        passwordRules = "<html><p>Password must be at least 8 characters<br>Password must contain a number<br>Password must contain a lowercase letter<br>Password must contain an uppercase letter<br>Password must contain a special character<p><html>";
        passwordRulesLabel.setToolTipText(passwordRules);
        passwordRulesLabel.setVisible(true);
        passwordRulesLabel.setBounds(345, 207, 35, 35);
        this.add(passwordRulesLabel);

        passwordField = new JPasswordField();
        passwordField.setVisible(true);
        passwordField.setBounds(130, 210, 210, 25);
        this.add(passwordField);

        passwordValidationLabel = new JLabel("PASSWORD IS INVALID");
        passwordValidationLabel.setVisible(false);
        passwordValidationLabel.setForeground(Color.RED);
        passwordValidationLabel.setBounds(130, 235, 200, 25);
        this.add(passwordValidationLabel);

        backBtn = new JButton("Back");
        backBtn.setVisible(true);
        backBtn.setBounds(90, 285, 100, 25);
        this.add(backBtn);

        submitBtn = new JButton("Submit");
        submitBtn.setVisible(true);
        submitBtn.setBounds(200, 285, 100, 25);
        this.add(submitBtn);
    }

    public JLabel getRegistrationLabel() {
        return registrationLabel;
    }

    public JLabel getFirstNameLabel() {
        return firstNameLabel;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public JLabel getFirstNameValidationLabel() {
        return firstNameValidationLabel;
    }

    public JLabel getLastNameLabel() {
        return lastNameLabel;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public JLabel getLastNameValidationLabel() {
        return lastNameValidationLabel;
    }

    public JLabel getEmailLabel() {
        return emailLabel;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JLabel getEmailValidationLabel() {
        return emailValidationLabel;
    }

    public JLabel getEmailInUseLabel() {
        return emailInUseLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JLabel getPasswordValidationLabel() {
        return passwordValidationLabel;
    }

    public JLabel getPasswordRulesLabel() {
        return passwordRulesLabel;
    }

    public String getPasswordRules() {
        return passwordRules;
    }

    public JCheckBox getShowPasswordCheckBox() {
        return showPasswordCheckBox;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }
}
