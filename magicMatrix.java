import java.util.Scanner;
import java.util.ArrayList;
public class magicMatrix {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Enter the element at position " + i + " " + j + " : "); 
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The  matrix is");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        magicMatrix m = new magicMatrix();
        if (m.chechMagic(a)) {
            System.out.println("The matrix is magic matrix");
        } else {
            System.out.println("The matrix is not magic matrix");
        }
    }
    public boolean chechMagic(int[][] a) {
        int i, j, rsum = 0,csum = 0, dsum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                rsum = rsum + a[i][j];
            }
            list.add(rsum);
            rsum=0;
        }
        //sum column wise
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                csum = csum + a[j][i];
            }
            list.add(csum);
            csum=0;
        }
        //sum diagonal wise
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    dsum = dsum + a[i][j];
                }
            }
        }
        list.add(dsum);
        for (i = 1; i < list.size(); i++) {
            if (list.get(i-1) != list.get(i)) {
                return false;
            }
        }
        return true;
    }
    
}
