package OnlineMedicalShop;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class userView implements ActionListener{
   void userview(){
    Frame f=new Frame("User View");
         Label l1=new Label("User Name :");
         Label l2=new Label("User Id :");
            Label l3=new Label("User Password :");
           TextField t1=new TextField(20);
              TextField t2=new TextField(20);
                    TextField t3=new TextField(20);
                    Button b1=new Button("Submit");
                    Button b2=new Button("Cancel");
                    GridLayout g=new GridLayout(4,2);
                    f.setLayout(g);
                    f.add(l1);
                    f.add(t1);
                    f.add(l2);
                    f.add(t2);
                    f.add(l3);
                    f.add(t3);
                    f.add(b1);
                    f.add(b2);
                    f.setSize(400,400);
                    f.setVisible(true);
                    f.setBackground(Color.green);
                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    f.add(b1);
                    f.add(b2);
                    f.addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                            System.exit(0);
                        }
                    });
   }    
}
