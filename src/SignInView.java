import javax.swing.*;

public class SignInView extends JPanel{

    private JLabel emailSignInMsg;
    private JTextField emailSignInField;

    private JLabel passwordSignInMsg;
    private JTextField passwordSignInField;

    private JButton backBtn;
    private JButton submitBtn;

    public SignInView() {
        setLayout(null);

        this.emailSignInMsg = new JLabel("EMAIL:");
        this.emailSignInMsg.setVisible(true);
        this.emailSignInMsg.setBounds(100, 10, 200, 25);
        this.add(emailSignInMsg);

        this.emailSignInField = new JTextField();
        this.emailSignInField.setVisible(true);
        this.emailSignInField.setBounds(100, 35, 210, 25);
        this.add(emailSignInField);

        this.passwordSignInMsg = new JLabel("PASSWORD:");
        this.passwordSignInMsg.setVisible(true);
        this.passwordSignInMsg.setBounds(100, 60, 200, 25);
        this.add(passwordSignInMsg);

        this.passwordSignInField = new JTextField();
        this.passwordSignInField.setVisible(true);
        this.passwordSignInField.setBounds(100, 85, 210, 25);
        this.add(passwordSignInField);

        this.backBtn = new JButton("BACK");
        this.backBtn.setVisible(true);
        this.backBtn.setSize(100, 25);
        this.backBtn.setLocation(100, 120);
        this.add(backBtn);

        this.submitBtn = new JButton("SUBMIT");
        this.submitBtn.setVisible(true);
        this.submitBtn.setSize(100, 25);
        this.submitBtn.setLocation(210, 120);
        this.add(submitBtn);
    }

    public JLabel getEmailSignInMsg() {
        return emailSignInMsg;
    }

    public void setEmailSignInMsg(JLabel emailSignInMsg) {
        this.emailSignInMsg = emailSignInMsg;
    }

    public JTextField getEmailSignInField() {
        return emailSignInField;
    }

    public void setEmailSignInField(JTextField emailSignInField) {
        this.emailSignInField = emailSignInField;
    }

    public JLabel getPasswordSignInMsg() {
        return passwordSignInMsg;
    }

    public void setPasswordSignInMsg(JLabel passwordSignInMsg) {
        this.passwordSignInMsg = passwordSignInMsg;
    }

    public JTextField getPasswordSignInField() {
        return passwordSignInField;
    }

    public void setPasswordSignInField(JTextField passwordSignInField) {
        this.passwordSignInField = passwordSignInField;
    }

    public JButton getSubmitBtn() {
        return submitBtn;
    }

    public void setSubmitBtn(JButton submitBtn) {
        this.submitBtn = submitBtn;
    }

    public JButton getBackBtn() {
        return backBtn;
    }

    public void setBackBtn(JButton backBtn) {
        this.backBtn = backBtn;
    }
}
