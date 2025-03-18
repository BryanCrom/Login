//Purpose: Interface for the images used in the checkboxes that toggles the visibility of the text in the password fields
//Author: Bryan Crombach

import javax.swing.*;
import java.awt.*;

public interface Images {

    //the two images, one for when the password is showing and one for when it is hidden
    Image hide = new ImageIcon("./photos/hidden.PNG").getImage().getScaledInstance(17, 18, java.awt.Image.SCALE_SMOOTH);
    Image show = new ImageIcon("./photos/show.PNG").getImage().getScaledInstance(17, 12, java.awt.Image.SCALE_SMOOTH);
}
