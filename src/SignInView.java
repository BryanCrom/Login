import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class SignInView extends JPanel implements Images{

    private final JLabel signInMsg;

    private final JLabel emailSignInMsg;
    private final JTextField emailSignInField;

    private final JLabel passwordSignInMsg;

    private final JPasswordField passwordSignInField;

    private final JLabel wrongSignInMsg;

    private final JButton signInBackBtn;
    private final JButton signInSubmitBtn;

    public SignInView() {
        this.setLayout(null);

        signInMsg = new JLabel("SIGN IN", SwingConstants.CENTER);
        signInMsg.setFont(new Font("Dialog", BOLD, 14));
        signInMsg.setVisible(true);
        signInMsg.setBounds(40, 30, 200, 25);
        this.add(signInMsg);

        emailSignInMsg = new JLabel("EMAIL:");
        emailSignInMsg.setVisible(true);
        emailSignInMsg.setBounds(40, 60, 200, 25);
        this.add(emailSignInMsg);

        emailSignInField = new JTextField();
        emailSignInField.setVisible(true);
        emailSignInField.setBounds(40, 85, 210, 25);
        this.add(emailSignInField);

        passwordSignInMsg = new JLabel("PASSWORD:");
        passwordSignInMsg.setVisible(true);
        passwordSignInMsg.setBounds(40, 110, 200, 25);
        this.add(passwordSignInMsg);



        passwordSignInField = new JPasswordField();
        passwordSignInField.setVisible(true);
        passwordSignInField.setBounds(40, 135, 210, 25);
        this.add(passwordSignInField);

        wrongSignInMsg = new JLabel("EMAIL OR PASSWORD IS INCORRECT");
        wrongSignInMsg.setVisible(false);
        wrongSignInMsg.setForeground(Color.RED);
        wrongSignInMsg.setBounds(40, 160, 250, 25);
        this.add(wrongSignInMsg);

        signInBackBtn = new JButton("BACK");
        signInBackBtn.setVisible(true);
        signInBackBtn.setSize(100, 25);
        signInBackBtn.setLocation(40, 200);
        this.add(signInBackBtn);

        signInSubmitBtn = new JButton("SUBMIT");
        signInSubmitBtn.setVisible(true);
        signInSubmitBtn.setSize(100, 25);
        signInSubmitBtn.setLocation(150, 200);
        this.add(signInSubmitBtn);
    }

    public JLabel getSignInMsg() {
        return signInMsg;
    }

    public JLabel getEmailSignInMsg() {
        return emailSignInMsg;
    }

    public JTextField getEmailSignInField() {
        return emailSignInField;
    }

    public JLabel getPasswordSignInMsg() {
        return passwordSignInMsg;
    }

    public JPasswordField getPasswordSignInField() {
        return passwordSignInField;
    }

    public JLabel getWrongSignInMsg() {
        return wrongSignInMsg;
    }

    public JButton getSignInBackBtn() {
        return signInBackBtn;
    }

    public JButton getSignInSubmitBtn() {
        return signInSubmitBtn;
    }
}
