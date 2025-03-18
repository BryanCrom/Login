//Purpose: the GUI panel that controls what the sign-in page looks like
//Author: Bryan Crombach

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class SignInView extends JPanel implements Images{

    //GUI components
    private final JLabel signInLabel;

    private final JLabel emailLabel;
    private final JTextField emailField;

    private final JLabel passwordLabel;
    private final JPasswordField passwordField;

    private final JCheckBox showPasswordCheckBox;

    private final JLabel wrongLoginLabel;

    private final JButton backBtn;
    private final JButton submitBtn;

    public SignInView() {
        //no layout
        this.setLayout(null);

        //sign in title label
        signInLabel = new JLabel("SIGN IN", SwingConstants.CENTER);
        signInLabel.setFont(new Font("Dialog", BOLD, 14));
        signInLabel.setVisible(true);
        signInLabel.setBounds(40, 30, 200, 25);
        this.add(signInLabel);

        //email label to label the email field
        emailLabel = new JLabel("EMAIL:");
        emailLabel.setVisible(true);
        emailLabel.setBounds(40, 60, 200, 25);
        this.add(emailLabel);

        //email field for user to input email
        emailField = new JTextField();
        emailField.setVisible(true);
        emailField.setBounds(40, 85, 210, 25);
        this.add(emailField);

        //password label to label the password field
        passwordLabel = new JLabel("PASSWORD:");
        passwordLabel.setVisible(true);
        passwordLabel.setBounds(40, 110, 200, 25);
        this.add(passwordLabel);

        //checkbox to hide or show password
        showPasswordCheckBox = new JCheckBox(new ImageIcon(hide));
        showPasswordCheckBox.setVisible(true);
        showPasswordCheckBox.setToolTipText("click me");
        showPasswordCheckBox.setBounds(112, 113, 22, 20);
        this.add(showPasswordCheckBox);

        //password field for user to input password
        passwordField = new JPasswordField();
        passwordField.setVisible(true);
        passwordField.setBounds(40, 135, 210, 25);
        this.add(passwordField);

        //label to show the user that the information they have tried to sign in with does not correspond with an account in the database
        wrongLoginLabel = new JLabel("EMAIL OR PASSWORD IS INCORRECT");
        wrongLoginLabel.setVisible(false);
        wrongLoginLabel.setForeground(Color.RED);
        wrongLoginLabel.setBounds(40, 160, 250, 25);
        this.add(wrongLoginLabel);

        //button to take user back to start screen
        backBtn = new JButton("BACK");
        backBtn.setVisible(true);
        backBtn.setSize(100, 25);
        backBtn.setLocation(40, 200);
        this.add(backBtn);

        //submit button to submit all user inputs for log in
        submitBtn = new JButton("SUBMIT");
        submitBtn.setVisible(true);
        submitBtn.setSize(100, 25);
        submitBtn.setLocation(150, 200);
        this.add(submitBtn);
    }

    //getters
    public JLabel getSignInLabel() {
        return signInLabel;
    }

    public JLabel getEmailLabel() {
        return emailLabel;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JCheckBox getShowPasswordCheckBox() {
        return showPasswordCheckBox;
    }

    public JLabel getWrongLoginLabel() {
        return wrongLoginLabel;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }
}
