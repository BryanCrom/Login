import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class DashboardView extends JPanel {

    private final JLabel dashboardLabel;

    private final JLabel greetingLabel;

    private final JButton logOutBtn;

    private final JButton deleteAccBtn;

    public DashboardView() {
        this.setLayout(null);

        dashboardLabel = new JLabel("DashBoard", SwingConstants.CENTER);
        dashboardLabel.setFont(new Font("Dialog", BOLD, 14));
        dashboardLabel.setVisible(true);
        dashboardLabel.setBounds(140, 70, 200, 30);
        this.add(dashboardLabel);

        greetingLabel = new JLabel("", SwingConstants.CENTER);
        greetingLabel.setVisible(true);
        greetingLabel.setBounds(140, 150, 200, 30);
        this.add(greetingLabel);

        logOutBtn = new JButton("Log Out");
        logOutBtn.setLocation(193, 370);
        logOutBtn.setSize(100, 25);
        this.add(logOutBtn);

        deleteAccBtn = new JButton("Delete Account");
        deleteAccBtn.setLocation(168, 400);
        deleteAccBtn.setSize(150, 25);
        this.add(deleteAccBtn);
    }

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
