import java.io.*;
public class matrices {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the matrix");
        int n=Integer.parseInt(br.readLine());
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=a[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]){
                    System.out.println("The matrix is not symmetric");
                }
                else{
                    System.out.println("The matrix is symmetric");
                }
            }
        }
    }
}

// Write a
// java method
// which takes
// two dimensional
// integer array
// as input
// and prints
// whetherthe inputted
// matrix is symmetric.Assume 2-
// D array
// is of
// size NxN, where
// N is known
// constant.A matrix
// is said
// to be symmetric if
// it equals
// to its transpose
// .
