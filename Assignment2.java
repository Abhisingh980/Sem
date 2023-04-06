import java.util.Scanner;

//program to  TO CHECK IF A TRIANGLE IS EQUILATERAL.
public class Assignment2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first sides of the triangle : ");
        int a=sc.nextInt();
        System.out.print("Enter the second sides of the triangle : ");
        int b=sc.nextInt();
        System.out.print("Enter the third sides of the triangle : "); 
        int c=sc.nextInt();
        System.out.println();
        if(a+b>c || b+c>a || c+a>b){
            if(a==b && b==c || b==c && c==a || c==a && a==b){
                System.out.println("Equilateral Triangle");
            }
            else{
                System.out.println("Not a Equilateral Triangle");
            }
        }
        else{
            System.out.println("Not -- a Equilateral Triangle");
        }
    }

}
