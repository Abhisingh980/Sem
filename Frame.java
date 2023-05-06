import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class frame implements ActionListener{
  public static void main(String[] args) {
    ImageIcon image = new ImageIcon("note.png");
    Border border = BorderFactory.createLineBorder(Color.green, 3);
    JLabel label = new JLabel(image);
    label.setText("null");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(156,53,53));
    label.setFont(new java.awt.Font("Dialog", 1, 20));
    label.setIconTextGap(10);
    //label.setBackground(Color.black);
    label.setOpaque(true);
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    //labele.setBounds(100, 100, 250, 250);
    JButton button=new JButton("click me");
    button.setBounds(200,200, 50,50);
    button.setBackground(Color.red);
    button.setForeground(Color.green);
    button.addActionListener(e->System.out.println("pop"));
    JFrame frame = new JFrame();
    frame.setTitle("JFrame title goes here");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setSize(1000, 500);
    //frame.setLayout(null);
    frame.add(label);
    frame.add(button);
    frame.pack();
    frame.setVisible(true);
  }  
}
