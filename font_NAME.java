import java.awt.*;
import java.awt.event.*;
import java.net.SocketPermission;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;
import java.awt.Color;
public class font_NAME {
   public static void main(String[] args) {
        Frame f = new Frame("Font Chooser");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                System.exit(0);
             }
        });
        Button b = new Button("Font");
        String font[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JList<String> list = new JList<String>(font);
        list.setVisibleRowCount(10);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane jsp = new JScrollPane(list);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, jsp, "Font", JOptionPane.PLAIN_MESSAGE);
                String font = list.getSelectedValue();
                f.setFont(new Font(font, Font.PLAIN, 20));
            }
        });
        f.add(b);
        f.setVisible(true);
   } 
}
