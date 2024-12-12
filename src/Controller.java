import javax.swing.*;

public class Controller extends JFrame {

    private Database database;
    private View view;

    public Controller(String title) {

        super(title);
        this.database = new Database();
        this.view = new View();

        this.getContentPane().add(this.view);

        //could be used to switch between multiple views
        //this.getContentPane().remove(this.view);

        this.setResizable(false);
        this.setSize(410, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
