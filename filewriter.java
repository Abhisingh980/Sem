import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException{
        String str="Hello World";
        FileWriter fw=new FileWriter("new.txt",true);
        fw.write(str);
        for(int i=0;i<str.length();i++)
            fw.write(str.charAt(i));
        fw.close();
    }
}
