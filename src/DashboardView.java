//Purpose: the GUI panel that controls what the dashboard looks like
//Author: Bryan Crombach

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class DashboardView extends JPanel {

    //GUI component variables
    private final JLabel dashboardLabel;

    private final JLabel greetingLabel;

    private final JButton logOutBtn;

    private final JButton deleteAccBtn;

    public DashboardView() {
        //no layout
        this.setLayout(null);

        //dashboard title label
        dashboardLabel = new JLabel("DashBoard", SwingConstants.CENTER);
        dashboardLabel.setFont(new Font("Dialog", BOLD, 14));
        dashboardLabel.setVisible(true);
        dashboardLabel.setBounds(140, 70, 200, 30);
        this.add(dashboardLabel);

        //the greeting label on dashboard that includes the full name of the signed in account
        greetingLabel = new JLabel("", SwingConstants.CENTER);
        greetingLabel.setVisible(true);
        greetingLabel.setBounds(140, 150, 200, 30);
        this.add(greetingLabel);

        //log out button
        logOutBtn = new JButton("Log Out");
        logOutBtn.setLocation(193, 370);
        logOutBtn.setSize(100, 25);
        this.add(logOutBtn);

        //delete account button
        deleteAccBtn = new JButton("Delete Account");
        deleteAccBtn.setLocation(168, 400);
        deleteAccBtn.setSize(150, 25);
        this.add(deleteAccBtn);
    }

    //getters
    public JLabel getDashboardLabel() {
        return dashboardLabel;
    }

    public JLabel getGreetingLabel() {
        return greetingLabel;
    }

    public JButton getLogOutBtn() {
        return logOutBtn;
    }

    public JButton getDeleteAccBtn() {
        return deleteAccBtn;
    }
}
