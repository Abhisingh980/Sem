import java.util.Scanner;
class throw1 {
  public static void Add(int a[],int p, int v) {
    try{
    int [] b = new int[a.length + 1];
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
  }
  catch(Exception e){
    System.out.println("Exception");
  }
  }
  public static void delete(int a[],int m) {
    try{
    int [] b = new int[a.length - 1];
    for (int i = 0; i < m; i++) {
      b[i] = a[i];
    }
    for (int i = m; i < b.length; i++) {
      b[i] = a[i + 1];
    }
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
  catch(Exception e){
    System.out.println("Exception");
  }
  }
  public static void update(int a[],int u, int v) {
    try{
    int [] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    b[u] = v;
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
  catch(Exception e){
    System.out.println("Exception");
  }
  }
  public static void main(String[] args) {
    int m;
    System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int [] a = new int[p];
    System.out.println("Enter the value");
    for (int i = 0; i < p; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("chose the option");
    System.out.println("1. Add");
    System.out.println("2. Delete");
    System.out.println("3. Update");
    System.out.println("4. Exit");
    int n = sc.nextInt();
    switch (n) {
      case 1:
        System.out.println("Enter the position for add");
        int l = sc.nextInt();
        System.out.println("Enter the value for add");
        int v = sc.nextInt();
        Add(a,l,v);
        break;
      case 2:
        System.out.println("Enter the position for deleate");
        m = sc.nextInt();
        delete(a,m);
        break;
      case 3:
        System.out.println("Enter the position for update");
        int u = sc.nextInt();
        System.out.println("Enter the value for update");
        v = sc.nextInt();
        update(a,u,v);
        break;
      case 4:
        System.out.println("Exit");
        break;
      default:
        System.out.println("Invalid");
    }
  }
}
