
package View;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Resizing {
    
    public static ImageIcon resizeIcon(String add, JButton btn) {
        return new ImageIcon(new ImageIcon(add).getImage().
                getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH));
    }
    
    
    public static ImageIcon resizeIcon(String add, JLabel lbl) {
        return new ImageIcon(new ImageIcon(add).getImage().
                getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
    }
    
    
}
