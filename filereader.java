import java.io.FileReader;
import java.io.IOException;
public class filereader {
    public static void main(String[] args) throws IOException{
        int ch;
       FileReader fr=null;
        try{
            fr=new FileReader("new.txt");
        }
        catch(Exception e){
            System.out.println("File not found");
        }
        do{
                ch=fr.read();
                System.out.print((char)ch);
        }while(ch!=-1);
    }
    
}
