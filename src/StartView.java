//Purpose: the GUI panel that controls what the start page looks like
//Author: Bryan Crombach

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class StartView extends JPanel {

    //GUI components
    private final JLabel welcomeLabel;

    private final JButton registerBtn;

    private final JButton signInBtn;

    public StartView() {
        //no layout
        this.setLayout(null);

        //start screen title label
        welcomeLabel = new JLabel("Welcome", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Dialog", BOLD, 14));
        welcomeLabel.setVisible(true);
        welcomeLabel.setBounds(40, 25, 200, 30);
        this.add(welcomeLabel);

        //register button to take user to the registration screen
        registerBtn = new JButton("Register");
        registerBtn.setLocation(35, 75);
        registerBtn.setSize(100, 25);
        this.add(registerBtn);

        //sign in button to take user to the sign in screen
        signInBtn = new JButton("Sign In");
        signInBtn.setLocation(155, 75);
        signInBtn.setSize(100, 25);
        this.add(signInBtn);
    }

    //getters
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
