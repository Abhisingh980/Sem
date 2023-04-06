import java.io.*;

public class Stringshift {
    public static void rotate(String s,int d){
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i < d) {
                s1 = s1 + s.charAt(s.length() - d + i);
            } else {
                s1 = s1 + s.charAt(i - d);
            }
        }
        System.out.println(s1);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the string: ");
        String s=br.readLine();
        System.out.print("enter the number of shift: ");
        int d=Integer.parseInt(br.readLine());
        rotate(s,d);
        
    }   
}