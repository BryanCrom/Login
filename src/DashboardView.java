import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class DashboardView extends JPanel {

    private final JLabel dashboardMsg;

    private final JButton logOutBtn;

    private final JButton deleteBtn;

    public DashboardView() {
        this.setLayout(null);

        dashboardMsg = new JLabel("DashBoard", SwingConstants.CENTER);
        dashboardMsg.setFont(new Font("Dialog", BOLD, 14));
        dashboardMsg.setVisible(true);
        dashboardMsg.setBounds(150, 70, 200, 30);
        this.add(dashboardMsg);

        logOutBtn = new JButton("Log Out");
        logOutBtn.setLocation(200, 370);
        logOutBtn.setSize(100, 25);
        this.add(logOutBtn);

        deleteBtn = new JButton("Delete Account");
        deleteBtn.setLocation(175, 400);
        deleteBtn.setSize(150, 25);
        this.add(deleteBtn);
    }

    public JLabel getDashboardMsg() {
        return dashboardMsg;
    }

    public JButton getLogOutBtn() {
        return logOutBtn;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }
}
