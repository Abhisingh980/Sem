
//program to CHECK IF A TRIANGLE IS RIGHT ANGLED.
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first sides of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the second sides of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the third sides of the triangle : ");
        int c = sc.nextInt();
        System.out.println();
        if (a + b > c || b + c > a || c + a > b) {
            if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                System.out.println("Right Angled Triangle");
            } else {
                System.out.println("Not a Right Angled Triangle");
            }
        } else {
            System.out.println("Not a Right Angled Triangle");
        }
    }
}
