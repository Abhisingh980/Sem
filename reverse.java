
import java.io.*;

public class reverse {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the String : ");
        String str=br.readLine();
        for(int i=(str.length()-1);i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
