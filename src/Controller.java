import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {

    private Database database;
    private final StartUpView startUpView;
    private final DashboardView dashboardView;
    private final SignInView signInView;
    private final SignUpView signUpView;

    public Controller(String title) {

        super(title);
        this.database = new Database();
        this.startUpView = new StartUpView();
        this.dashboardView = new DashboardView();
        this.signInView = new SignInView();
        this.signUpView = new SignUpView();

        this.getContentPane().add(this.startUpView);
        this.setResizable(false);
        this.setSize(410, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.startUpView.getSignInBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(signInView);
                changeWindowSize(410, 300);
            }
        });

        this.startUpView.getSignUpBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(signUpView);
                changeWindowSize(410, 400);
            }
        });

        this.dashboardView.getLogOutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startUpView);
                changeWindowSize(410, 200);
            }
        });

        this.signInView.getSignInBackBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startUpView);
                changeWindowSize(410, 200);
            }
        });

        this.signInView.getSignInSubmitBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(dashboardView);
                changeWindowSize(500, 500);
            }
        });

        this.signUpView.getSignUpBackBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               swapViews(startUpView);
               changeWindowSize(410, 200);
           }
        });

        this.signUpView.getSignUpSubmitBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               swapViews(startUpView);
               changeWindowSize(410, 200);
           }
        });
    }

    public void swapViews(JPanel newPanel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(newPanel);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    public void changeWindowSize(int width, int height) {
        this.setSize(width, height);
    }
}
