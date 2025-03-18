//Purpose: main method starts the program
//Author: Bryan Crombach

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //runs the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Controller();
            }
        });
    }
}