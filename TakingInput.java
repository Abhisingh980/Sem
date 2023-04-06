import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            System.out.println("Enter a string");
            String str = sc.nextLine();
            System.out.println("You entered String " + str);
            System.out.println("Enter a Boolean");
            boolean bool = sc.nextBoolean();
            System.out.println("You entered "+num);
           
            System.out.println("You entered Boolean "+bool);

    }
}
