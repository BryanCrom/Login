import javax.swing.*;
import java.awt.event.*;

public class Controller extends JFrame implements Images{

    private final Database database;
    private final StartView startView;
    private final DashboardView dashboardView;
    private final SignInView signInView;
    private final RegistrationView registrationView;
    private final Validation validation;

    Account currentAccount;

    char hiddenChar;

    //registration labels
    JLabel registrationFirstNameValidationLabel;
    JLabel registrationLastNameValidationLabel;
    JLabel registrationPasswordValidationLabel;
    JLabel registrationEmailValidationLabel;
    JLabel registrationEmailInUseLabel;

    //registration text fields
    JTextField registrationFirstNameField;
    JTextField registrationLastNameField;
    JTextField registrationEmailField;
    JPasswordField registrationPasswordField;

    //check boxes
    JCheckBox registrationShowPasswordCheckBox;
    JCheckBox signInShowPasswordCheckBox;

    //wrong sign in label
    JLabel signInWrongLoginLabel;

    //sign in text fields
    JTextField signInEmailField;
    JPasswordField signInPasswordField;

    public Controller() {

        super("Login");
        database = new Database();
        startView = new StartView();
        dashboardView = new DashboardView();
        signInView = new SignInView();
        registrationView = new RegistrationView();
        validation = new Validation();

        //character that JPasswordFields use to hide the text
        hiddenChar = registrationView.getPasswordField().getEchoChar();

        //validation Labels for the registration TextFields
        registrationFirstNameValidationLabel = registrationView.getFirstNameValidationLabel();
        registrationLastNameValidationLabel = registrationView.getLastNameValidationLabel();
        registrationPasswordValidationLabel = registrationView.getPasswordValidationLabel();
        registrationEmailValidationLabel = registrationView.getEmailValidationLabel();
        registrationEmailInUseLabel = registrationView.getEmailInUseLabel();

        //registration TextFields
        registrationFirstNameField = registrationView.getFirstNameField();
        registrationLastNameField = registrationView.getLastNameField();
        registrationEmailField = registrationView.getEmailField();
        registrationPasswordField = registrationView.getPasswordField();

        //toggle show password text JCheckBoxes
        registrationShowPasswordCheckBox = registrationView.getShowPasswordCheckBox();
        signInShowPasswordCheckBox = signInView.getShowPasswordCheckBox();

        //wrong login label
        signInWrongLoginLabel = signInView.getWrongLoginLabel();

        //Sign in TextFields
        signInEmailField = signInView.getEmailField();
        signInPasswordField = signInView.getPasswordField();



        //set up frame
        this.getContentPane().add(this.startView);
        this.setResizable(false);
        this.setSize(300, 170);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //disconnect with database when the window is closed
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                super.windowClosing(e);
                database.disconnect();
            }
        });

        //sign in button takes you to sign in view
        startView.getSignInBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(signInView);
                changeWindowSize(300, 295);
            }
        });

        //registration button takes you to registration view
        startView.getRegisterBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(registrationView);
                changeWindowSize(400, 380);
            }
        });


        //log out button takes you back to start view
        dashboardView.getLogOutBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startView);
                changeWindowSize(300, 170);
            }
        });

        //delete account button deletes your account and takes you back to start view
        dashboardView.getDeleteAccBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?", "Login", JOptionPane.YES_NO_OPTION);

                if(choice == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "Account has been deleted successfully");

                    database.removeAccount(currentAccount);

                    swapViews(startView);
                    changeWindowSize(300, 170);
                }
            }
        });

        //sign in view's JCheckBox toggles weather the JPasswordField shows its text
        signInShowPasswordCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toggleShowPassword(signInShowPasswordCheckBox, signInPasswordField);
            }
        });

        //sign in view's back JButton takes you back to start view and resets sign in view
        signInView.getBackBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapViews(startView);
                changeWindowSize(300, 170);

                signInWrongLoginLabel.setVisible(false);

                resetSignInView();
            }
        });

        //sign in submit JButton checks the JTextFields for validation if all correct reset view and take you to dashboard view
        signInView.getSubmitBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = signInEmailField.getText();
                String password = new String(signInPasswordField.getPassword());

                boolean correctSignIn = database.accountExists(email, password);
                signInWrongLoginLabel.setVisible(!correctSignIn);

                if(correctSignIn) {
                    currentAccount = database.getAccount(email, password);

                    dashboardView.getGreetingLabel().setText("Hello " + currentAccount.getFirstName() + " " + currentAccount.getLastName());

                    swapViews(dashboardView);
                    changeWindowSize(500, 500);

                    resetSignInView();
                }
            }
        });

        //registration view's JCheckBox toggles weather the JPasswordField shows its text
        registrationShowPasswordCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toggleShowPassword(registrationShowPasswordCheckBox, registrationPasswordField);
            }
        });

        //registration view's back JButton takes you back to start view and resets registration view
        registrationView.getBackBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               swapViews(startView);
               changeWindowSize(300, 170);

               registrationFirstNameValidationLabel.setVisible(false);
               registrationLastNameValidationLabel.setVisible(false);
               registrationPasswordValidationLabel.setVisible(false);
               registrationEmailValidationLabel.setVisible(false);
               registrationEmailInUseLabel.setVisible(false);

               resetRegistrationView();
           }
        });

        //registration submit JButton checks the JTextFields for validation if all correct reset view and take you to start view
        registrationView.getSubmitBtn().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String firstName = registrationFirstNameField.getText();
               String lastName = registrationLastNameField.getText();
               String email = registrationEmailField.getText();
               String password = new String(registrationPasswordField.getPassword());
               Account account = new Account(firstName, lastName, email, password);

               boolean firstNameValid = validation.validateName(firstName);
               boolean lastNameValid = validation.validateName(lastName);
               boolean emailValid = validation.validateEmail(email);
               boolean passwordValid = validation.validatePassword(password);
               boolean emailExists = database.emailExists(account);

               registrationFirstNameValidationLabel.setVisible(!firstNameValid);
               registrationLastNameValidationLabel.setVisible(!lastNameValid);
               registrationPasswordValidationLabel.setVisible(!passwordValid);

               if(!emailValid){
                   registrationEmailValidationLabel.setVisible(true);
               }
               else{
                   registrationEmailValidationLabel.setVisible(false);
                   registrationEmailInUseLabel.setVisible(emailExists);
               }

               if(firstNameValid && lastNameValid && emailValid && passwordValid && !emailExists) {
                   swapViews(startView);
                   changeWindowSize(300, 170);
                   database.addAccount(account);

                   resetRegistrationView();

                   JOptionPane.showMessageDialog(null , "Account created successfully!");
               }
           }
        });
    }

    //swap the current view to the new view
    public void swapViews(JPanel newPanel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(newPanel);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
    }

    //change the size of the frame
    public void changeWindowSize(int width, int height) {
        this.setSize(width, height);
    }

    //state change method for Checkboxes
    public void toggleShowPassword(JCheckBox checkBox, JPasswordField passwordField) {
        if(checkBox.isSelected()){
            checkBox.setIcon(new ImageIcon(show));
            passwordField.setEchoChar((char)0);
        }
        else{
            checkBox.setIcon(new ImageIcon(hide));
            passwordField.setEchoChar(hiddenChar);
        }
    }

    //reset sign in view
    public void resetSignInView(){
        signInEmailField.setText("");
        signInPasswordField.setText("");

        signInShowPasswordCheckBox.setIcon(new ImageIcon(hide));
        signInPasswordField.setEchoChar(hiddenChar);
        signInShowPasswordCheckBox.setSelected(false);
    }

    //reset registration view
    public void resetRegistrationView(){
        registrationFirstNameField.setText("");
        registrationLastNameField.setText("");
        registrationEmailField.setText("");
        registrationPasswordField.setText("");

        registrationShowPasswordCheckBox.setIcon(new ImageIcon(hide));
        registrationPasswordField.setEchoChar(hiddenChar);
        registrationShowPasswordCheckBox.setSelected(false);
    }
}
