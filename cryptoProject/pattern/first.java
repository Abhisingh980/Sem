
//       1
//      232
//     34543
//    4567654 
//   567898765
import java.util.Scanner;
import java.util.*;

class first {
    public static void Add(int a[], int p, int v) {
        try {
            int[] b = new int[a.length + 1];
            for (int i = 0; i < p; i++) {
                b[i] = a[i];
            }
            b[p] = v;
            for (int i = p + 1; i < b.length; i++) {
                b[i] = a[i - 1];
            }
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void delete(int a[], int m) {
        try {
            int[] b = new int[a.length - 1];
            for (int i = 0; i < m; i++) {
                b[i] = a[i];
            }
            for (int i = m; i < b.length; i++) {
                b[i] = a[i + 1];
            }
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void update(int a[], int u, int v) {
        try {
            int[] b = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            b[u] = v;
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        int m;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int[] a = new int[10];
        System.out.println("Enter the value");
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the position");
        int u = sc.nextInt();
        System.out.println("Enter the value");
        int v = sc.nextInt();
        Add(a, u, v);
        System.out.println("Enter the position");
        m = sc.nextInt();
        delete(a, m);
        System.out.println("Enter the position");
        u = sc.nextInt();
        System.out.println("Enter the value");
        v = sc.nextInt();
        update(a, u, v);
    }
}
