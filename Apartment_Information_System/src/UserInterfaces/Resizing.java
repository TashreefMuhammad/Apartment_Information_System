/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterfaces;

import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Dragneel
 */
public class Resizing {
    
//    public static Font resizeLabel(JLabel label){
//        Font labelFont = label.getFont();
//        String labelText = label.getText();
//
//        int stringWidth = label.getFontMetrics(labelFont).stringWidth(labelText);
//        int componentWidth = label.getWidth();
//
//        double widthRatio = (double) componentWidth / (double) stringWidth;
//
//        int newFontSize = (int) (labelFont.getSize() * widthRatio);
//        int componentHeight = label.getHeight();
//
//        int fontSizeToUse = (Math.min(newFontSize, componentHeight)) * 3;
//
//        return new Font(labelFont.getName(), Font.PLAIN, fontSizeToUse);
//    }
    
    public static ImageIcon resizeIcon(String add, JButton btn) {
        return new ImageIcon(new ImageIcon(add).getImage().
                getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH));
    }
    
    public static ImageIcon resizeIcon(String add, JLabel lbl) {
        return new ImageIcon(new ImageIcon(add).getImage().
                getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
    }
}
