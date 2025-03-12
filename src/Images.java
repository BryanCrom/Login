import javax.swing.*;
import java.awt.*;

public interface Images {
    Image hide = new ImageIcon("./photos/hidden.PNG").getImage().getScaledInstance(17, 18, java.awt.Image.SCALE_SMOOTH);
    Image show = new ImageIcon("./photos/show.PNG").getImage().getScaledInstance(17, 12, java.awt.Image.SCALE_SMOOTH);
}
