import java.io.*;
import java.util.*;
public class Convert{
	 public static void main(String[] args) {
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a code of c++ :");
	 	String str=br.readLine();
	StringTokenizer St =new StringTokenzier(str,",");
    for(int i=0;i<str.length();i++){
      System.out.println(St.nextToken());            
    }

	}
}