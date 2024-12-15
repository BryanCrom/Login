import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {

    private Database database;
    private StartUpView startUpView;
    private DashboardView dashboardView;

    public Controller(String title) {

        super(title);
        this.database = new Database();
        this.startUpView = new StartUpView();
        this.dashboardView = new DashboardView();

        this.getContentPane().add(this.startUpView);
        this.setResizable(false);
        this.setSize(410, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.startUpView.getSignInBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(dashboardView);
            }
        });

        this.dashboardView.getLogOutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startUpView);
            }
        });
    }

    public void swapViews(JPanel newPanel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(newPanel);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }
}
