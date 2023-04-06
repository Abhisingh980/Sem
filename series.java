import java.io.*;
import java.lang.Math;

public class series {
    public static int factoraial(int a) {
        int d = 1;
        if (a == 0) {
            return d;
        }
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                d *= i;
            }
            return d;
        }
     return 0;
    }

    public static void main(String[] args) throws IOException {
        double result=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number x : ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("enter the number of term : ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if(i>0){
            if(i%2!=0){
                result -= (Math.pow(x, 2 * i))/factoraial(2*i);
            }
        }
                if (i % 2 == 0) {
                    result += (Math.pow(x, 2 * i))/factoraial(2*i);
                }
            }
      
        System.out.println(result);
    }

}
