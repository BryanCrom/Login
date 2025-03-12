import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class Controller extends JFrame {

    private final Database database;
    private final StartView startView;
    private final DashboardView dashboardView;
    private final SignInView signInView;
    private final RegisterView registerView;
    private final Validation validation;

    public Controller() {

        super("Login");
        database = new Database();
        startView = new StartView();
        dashboardView = new DashboardView();
        signInView = new SignInView();
        registerView = new RegisterView();
        validation = new Validation();

        this.getContentPane().add(this.startView);
        this.setResizable(false);
        this.setSize(300, 170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                super.windowClosing(e);
                database.disconnect();
            }
        });

        startView.getSignInBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(signInView);
                changeWindowSize(300, 295);
            }
        });

        startView.getRegisterBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(registerView);
                changeWindowSize(400, 380);
            }
        });

        dashboardView.getLogOutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startView);
                changeWindowSize(300, 170);
            }
        });

        dashboardView.getDeleteBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startView);
                changeWindowSize(300, 170);
            }
        });

        signInView.getSignInBackBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startView);
                changeWindowSize(300, 170);

                signInView.getWrongSignInMsg().setVisible(false);
                signInView.getEmailSignInField().setText("");
                signInView.getPasswordSignInField().setText("");
            }
        });

        signInView.getSignInSubmitBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!database.accountExists(signInView.getEmailSignInField().getText(), new String(signInView.getPasswordSignInField().getPassword()))) {
                    signInView.getWrongSignInMsg().setVisible(true);
                }
                else {
                    signInView.getWrongSignInMsg().setVisible(false);
                    swapViews(dashboardView);
                    changeWindowSize(500, 500);
                    signInView.getEmailSignInField().setText("");
                    signInView.getPasswordSignInField().setText("");
                }
            }
        });

        registerView.getShowRegisterPassword().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(registerView.getShowRegisterPassword().isSelected()){
                    registerView.getShowRegisterPassword().setIcon(new ImageIcon(registerView.getShow()));
                }
                else{
                    registerView.getShowRegisterPassword().setIcon(new ImageIcon(registerView.getHide()));
                }
            }
        });

        registerView.getRegisterBackBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               swapViews(startView);
               changeWindowSize(300, 170);

               registerView.getFirstNameRegisterValidateMsg().setVisible(false);
               registerView.getLastNameRegisterValidateMsg().setVisible(false);
               registerView.getPasswordRegisterValidateMsg().setVisible(false);
               registerView.getEmailRegisterValidateMsg().setVisible(false);
               registerView.getEmailInUseMsg().setVisible(false);

               registerView.getFirstNameField().setText("");
               registerView.getLastNameField().setText("");
               registerView.getEmailRegisterField().setText("");
               registerView.getPasswordRegisterField().setText("");
           }
        });

        registerView.getRegisterSubmitBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String firstName = registerView.getFirstNameField().getText();
               String lastName = registerView.getLastNameField().getText();
               String email = registerView.getEmailRegisterField().getText();
               String password = new String(registerView.getPasswordRegisterField().getPassword());
               Account account = new Account(firstName, lastName, email, password);

               boolean firstNameValid = validation.validateName(firstName);
               boolean lastNameValid = validation.validateName(lastName);
               boolean emailValid = validation.validateEmail(email);
               boolean passwordValid = validation.validatePassword(password);
               boolean emailExists = database.emailExists(account);

               registerView.getFirstNameRegisterValidateMsg().setVisible(!firstNameValid);
               registerView.getLastNameRegisterValidateMsg().setVisible(!lastNameValid);
               registerView.getPasswordRegisterValidateMsg().setVisible(!passwordValid);

               if(!emailValid){
                   registerView.getEmailRegisterValidateMsg().setVisible(true);
               }
               else{
                   registerView.getEmailRegisterValidateMsg().setVisible(false);
                   registerView.getEmailInUseMsg().setVisible(emailExists);
               }

               if(firstNameValid && lastNameValid && emailValid && passwordValid && !emailExists) {
                   swapViews(startView);
                   changeWindowSize(300, 170);
                   database.addAccount(account);
                   registerView.getFirstNameField().setText("");
                   registerView.getLastNameField().setText("");
                   registerView.getEmailRegisterField().setText("");
                   registerView.getPasswordRegisterField().setText("");
               }
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
