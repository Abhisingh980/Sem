//import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) throws IOException{
        //DataInputStream in = new DataInputStream(System.in);
        //FileOutputStream fout=new FileOutputStream("newfile.txt",true);
        //System.out.println("Enter the text (@ at the end of the file will not be written)");
        FileInputStream fin=new FileInputStream("newfile.txt");
        char ch;
        do{
            ch=(char)fin.read();
           System.out.print((char)ch);
        }while(ch!='@');
        fin.close();
    }
}
