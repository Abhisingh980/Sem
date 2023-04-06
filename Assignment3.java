
//program TO CHECK IF A TRIANGLE IS ISOSCELES.
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First sides of the triangle : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second sides of the triangle : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third sides of the triangle : ");
        int c = sc.nextInt();
        System.out.println();
        if (a + b > c || b + c > a || c + a > b) {
            if (a == b || b==c || c==a ) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Not an Isosceles Triangle");
            }
        } else {
            System.out.println("Not an Isosceles Triangle");
        }
    }
}
