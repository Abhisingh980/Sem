// abstract class loan{
    
//     private void carLoan(){
//         System.out.println("Car Loan");
//     }
//      //not nesesary to write abstract class =0 abstract method
// }
// abstract class XLoan extends loan{
//     void Loan() {
//         //super.carLoan();
//         System.out.println("Car Loan");
//     }
//     // public static void main(String[] args) {
//     //     XLoan x = new XLoan();
//     //     x.carLoan();
//     // }
// }
// class NewLoan extends XLoan{
//     public static void main(String[] args) {
//         // XLoan lx = new XLoan();
//         // loan l;
//         // l = lx;
//         // l.carLoan();
//         loan Lx=new XLoan();
//         Lx.Loan();
//     }
    
// }
// A Simple demonstration of abstract.
abstract class A {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B extends A {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}