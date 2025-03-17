import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class StartView extends JPanel {

    private final JLabel welcomeLabel;

    private final JButton registerBtn;

    private final JButton signInBtn;

    public StartView() {
        this.setLayout(null);

        welcomeLabel = new JLabel("Welcome", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Dialog", BOLD, 14));
        welcomeLabel.setVisible(true);
        welcomeLabel.setBounds(40, 25, 200, 30);
        this.add(welcomeLabel);

        registerBtn = new JButton("Register");
        registerBtn.setLocation(35, 75);
        registerBtn.setSize(100, 25);
        this.add(registerBtn);

        signInBtn = new JButton("Sign In");
        signInBtn.setLocation(155, 75);
        signInBtn.setSize(100, 25);
        this.add(signInBtn);
    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public JButton getRegisterBtn() {
        return registerBtn;
    }

    public JButton getSignInBtn() {
        return signInBtn;
    }
}
