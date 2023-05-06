import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class color_choser {
    public static void main(String[] args) {
        Frame f = new Frame("Color Chooser");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button b = new Button("Color");
        final Color[] color = { Color.black };
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color c=null;
                color[0] = JColorChooser.showDialog(null, "Choose a color", color[0]);
                if (color[0] != null) {
                    c = color[0];
                }
              f.setBackground(c);            
            }
        });
        f.add(b);
        f.setVisible(true);
    }
    
}
