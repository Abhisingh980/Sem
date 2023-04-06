import java.awt.*;
import java.awt.event.*;
/*<applet code="calculator" width=300 height=300>
setbound method is used to set the position of the button

</applet>*/
import java.util.*;

public class calculator  implements ActionListener{
    int c,n;
    String s1,s2,s3,s4,s5;
    Frame f;
    TextField t;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bclr,bdot;
    GridLayout g;
    calculator(){
        f=new Frame("Calculator");
        t=new TextField(120);
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        badd=new Button("+");
        bsub=new Button("-");
        bmul=new Button("*");
        bdiv=new Button("/");
        beq=new Button("=");
        bclr=new Button("C");
        bdot=new Button(".");
        g=new GridLayout(4,4);
        f.setLayout(g);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(beq);
        f.add(bclr);
        f.add(bdot);
        f.setSize(400,400);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
        bdot.addActionListener(this);
        t=new TextField(60);
        g=new GridLayout(4,4);
        f.setLayout(g);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(beq);
        f.add(bclr);
        f.add(bdot);
        f.setSize(300,300);
        f.setVisible(true);
        f.setBackground(Color.red);
        b1.setBackground(Color.yellow);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
       
    }
    public void actionPerformed(ActionEvent e){
       ArrayList<String> list = new ArrayList<String>();
       list.add(e.getSource().toString());
       for(int i=0;i<list.size();i++){
           if(list.get(i).equals("1")){
               s1=t.getText();
               s2="1";
               s3=s1+s2;
               t.setText(s3);
           }
         }

        // if(e.getSource()==b1){
        //     s1=t.getText();
        //     s2="1";
        //     s3=s1+s2;
        //     t.setText(s3);
        // }
//         if(e.getSource()==b2){
//             s1=t.getText();
//             s2="2";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b3){
//             s1=t.getText();
//             s2="3";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b4){
//             s1=t.getText();
//             s2="4";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b5){
//             s1=t.getText();
//             s2="5";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b6){
//             s1=t.getText();
//             s2="6";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b7){
//             s1=t.getText();
//             s2="7";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b8){
//             s1=t.getText();
//             s2="8";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b9){
//             s1=t.getText();
//             s2="9";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==b0){
//             s1=t.getText();
//             s2="0";
//             s3=s1+s2;
//             t.setText(s3);
//         }
//         if(e.getSource()==badd){
//             s1=t.getText();
//             n=Integer.parseInt(s1);
//             c=1;
//             t.setText("");
//         }
//         if(e.getSource()==bsub){
//             s1=t.getText();
//             n=Integer.parseInt(s1);
//             c=2;
//             t.setText("");
//         }
//         if(e.getSource()==bmul){
//             s1=t.getText();
//             n=Integer.parseInt(s1);
//             c=3;
//             t.setText("");
//         }
//         if(e.getSource()==bdiv){
//             s1=t.getText();
//             n=Integer.parseInt(s1);
//             c=4;
//             t.setText("");
//         }
//         if(e.getSource()==bclr){
//             t.setText(" hello are you ok");
//         }

//         if(e.getSource()==beq){
//             int r=0;
//             s1=t.getText();
//            int  m=Integer.parseInt(s1);
//             if(c==1){
//                 r=n+m;
//             }
//             if(c==2){
//                  r=n-m;
//             }
//             if(c==3){
//                 r=n*m;
//             }
//             if(c==4){
//                 r=n/m;
//             }
//             t.setText(String.valueOf(r));
//         }
//         if(e.getSource()==bdot){
//             s1=t.getText();
//             s2=".";
//             s3=s1+s2;
//             t.setText(s3);
//         }
// }
    }
public static void main(String[] args) {
    calculator c =new calculator();

}
}
