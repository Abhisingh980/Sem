import java.awt.TextArea;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
public class note extends JFrame {
    JMenuBar jBar = new JMenuBar();
    JMenu file = new JMenu("file");
    JMenuItem openFile = new JMenuItem("open");
    JMenuItem save=new JMenuItem("save");
    JTextField tfield = new JTextField();
    JTextField tfield1 = new JTextField();
    JScrollBar jscroll = new JScrollBar();
    note() {
        setTitle("pading");
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("note.png"));
        setIconImage(icon.getImage());
        setJMenuBar(jBar);
        file.add(openFile);
        file.add(save);
        jBar.add(file);
        add(tfield);
        tfield.add(jscroll);
        tfield.setBounds(0,0, 300, 600);
        save.addActionListener(new Perform());
        openFile.addActionListener(new Perform());
    }
    public static void main(String[] args) {
        new note().setVisible(true) ;
    }
}
class Perform implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("open")) {
            JTextField jtf = new JTextField();
            JTextField jtf1 = new JTextField();
            JLabel jl = new JLabel("name");
            JLabel jl1 = new JLabel("password");
            JButton jbt = new JButton("submit");
            JFrame jf = new JFrame();
            jf.setTitle("login");
            jf.setBounds(100, 100, 800, 600);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon icon = new ImageIcon(getClass().getResource("note.png"));
            jf.setIconImage(icon.getImage());
            jf.setLayout(null);
            jf.add(jtf);
            jf.add(jtf1);
            jf.add(jl);
            jf.add(jl1);
            jf.add(jbt);
            jl.setBounds(100, 100, 100, 100);
            jtf.setBounds(200, 100, 100, 100);
            jl1.setBounds(100, 200, 100, 100);
            jtf1.setBounds(200, 200, 100, 100);
            jbt.setBounds(200, 300, 100, 100);
            jf.setVisible(true);
            jbt.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = jtf.getText();
                    String password = jtf1.getText();
                    if (!name.equals(null) && !password.equals(null)) {
                        JFileChooser jfc = new JFileChooser();
                        jfc.showOpenDialog(null);
                        File file = jfc.getSelectedFile();
                        try {
                            FileInputStream fis = new FileInputStream("new.txt");
                            DataInputStream dis = new DataInputStream(fis);
                            String str = dis.readUTF();
                            while (str != null) {
                                System.out.println(str);
                                str = dis.readUTF();
                            }
                            dis.close();
                            fis.close();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "error");
                    }
                }
            });
        }
        if (cmd.equals("save")) {
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(null);
            File file = jfc.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fis);
                String str = dis.readUTF();
                while (str != null) {
                    System.out.println(str);
                    str = dis.readUTF();
                }
                dis.close();
                fis.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

}