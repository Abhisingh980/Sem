public class Tyoecasting {
    public static void main(String args[]){
        //winding type casting
                int myInt = 9;
                double myDouble = myInt; 

                System.out.println(myInt); // Outputs 9
                System.out.println(myDouble); // Outputs 9.0
        //narrowing type casting
                double myDouble1 = 9.78;
                int myInt1 = (int) myDouble1; // Manual casting: double to int

                System.out.println(myDouble1); // Outputs 9.78
                System.out.println(myInt1); // Outputs 9
            }
        }
