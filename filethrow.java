import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class filethrow {
    public static void main(String[] args) throws IOException{
       DataInputStream din=new DataInputStream(System.in);
         System.out.println("Enter the file name");
         FileOutputStream fout=new FileOutputStream("new.txt",true);
         BufferedOutputStream bout=new BufferedOutputStream(fout);
         int ch;
           do{
                ch=din.read();
                bout.write(ch);
           }while(ch!='.');
            bout.close();
    }
}
