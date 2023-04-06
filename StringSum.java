import java.io.*;
public class StringSum {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the STRING WITH SUM NUMRIC character on : ");
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
                if(Character.isDigit(s.charAt(i))){
                sum += s.charAt(i) - '0';
                }
        }
        System.out.println(sum);
    }
}
