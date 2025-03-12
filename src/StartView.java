import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class StartView extends JPanel {

    private final JLabel welcomeMsg;

    private final JButton registerBtn;

    private final JButton signInBtn;

    public StartView() {
        this.setLayout(null);

        welcomeMsg = new JLabel("Welcome", SwingConstants.CENTER);
        welcomeMsg.setFont(new Font("Dialog", BOLD, 14));
        welcomeMsg.setVisible(true);
        welcomeMsg.setBounds(40, 25, 200, 30);
        this.add(welcomeMsg);

        registerBtn = new JButton("Register");
        registerBtn.setLocation(35, 75);
        registerBtn.setSize(100, 25);
        this.add(registerBtn);

        signInBtn = new JButton("Sign In");
        signInBtn.setLocation(155, 75);
        signInBtn.setSize(100, 25);
        this.add(signInBtn);
    }

    public JLabel getWelcomeMsg() {
        return welcomeMsg;
    }

    public JButton getRegisterBtn() {
        return registerBtn;
    }

    public JButton getSignInBtn() {
        return signInBtn;
    }
}
