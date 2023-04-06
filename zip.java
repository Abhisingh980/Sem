import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class zip {
    public static void main(String[] args) throws IOException{
        //try{
            FileInputStream fin=new FileInputStream("new.txt");
        //}catch(Exception e){
           // FileNotFoundException e1=new FileNotFoundException("File not found");
            //System.out.println("File not found"+e1);
        //}
        FileOutputStream fout=new FileOutputStream("new1.txt");
        int i;
        DeflaterOutputStream dout=new DeflaterOutputStream(fout);
       while((i=fin.read())!=-1){
           dout.write(i);
       }
        fin.close();
         dout.close();
    }  
}
