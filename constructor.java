class Add{
    int a,b;
    Add(int a,int b){
        this.a=a;
        this.b=b;
    }
}
public class constructor {
    String Name;
    int Age;
    String Address;
    constructor(String name,int age,String address){
        this.Name=name;
        this.Age=age;
        this.Address=address;
    }
    // public static void print_1(){
    //     System.out.println("name: "+name);
    //     System.out.println("age: "+age);
    //     System.out.println("address: "+address);
    // }
    public  void display(){
        System.out.println("name: "+Name);
        System.out.println("age: "+Age);
        System.out.println("address: "+Address);
    }
    public static void main(String[] args) {
        constructor c=new constructor("Rahul",20,"Delhi");
        c.display();
        Add a = new Add(10, 20);
        System.out.println(a.a + a.b);
    } 
}