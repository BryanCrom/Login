import javax.swing.*;

public class DashboardView extends JPanel {

    private JLabel dashboardMsg;

    private JButton logOutBtn;

    private JButton deleteBtn;

    public DashboardView() {
        setLayout(null);

        this.dashboardMsg = new JLabel("DashBoard", SwingConstants.CENTER);
        this.dashboardMsg.setVisible(true);
        this.dashboardMsg.setBounds(150, 70, 200, 30);
        this.add(this.dashboardMsg);

        this.logOutBtn = new JButton("Log Out");
        this.logOutBtn.setLocation(200, 370);
        this.logOutBtn.setSize(100, 25);
        this.add(this.logOutBtn);

        this.deleteBtn = new JButton("Delete Account");
        this.deleteBtn.setLocation(175, 400);
        this.deleteBtn.setSize(150, 25);
        this.add(this.deleteBtn);
    }

    public JLabel getDashboardMsg() {
        return dashboardMsg;
    }

    public void setDashboardMsg(JLabel dashboardMsg) {
        this.dashboardMsg = dashboardMsg;
    }

    public JButton getLogOutBtn() {
        return logOutBtn;
    }

    public void setLogOutBtn(JButton logOutBtn) {
        this.logOutBtn = logOutBtn;
    }

    public JButton getDeleteBtn() {
        return deleteBtn;
    }

    public void setDeleteBtn(JButton deleteBtn) {
        this.deleteBtn = deleteBtn;
    }
}
