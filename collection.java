import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

//hashset
class hashsetdemo {
    public  void hashtest() {
        // Create a hash set.
        HashSet<String> hs = new HashSet<String>();
        // Add elements to the hash set.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);
        System.out.println(hs.contains("Alpha"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.size());
        System.out.println(hs.remove("Alpha"));
        System.out.println(hs);
        for(String s:hs){
            System.out.println(s);
        }
        System.out.println(hs);
    }
}

// Array List
class collection {
    public static void main(String args[]) {

        // Create an array list.
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al: " +
                al.size());
        // Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        //check empty
        System.out.println("emty or not: " +
                al.isEmpty());
        //check size
        System.out.println("Size of al after additions: " +
                al.size());
        //check contains
                System.out.println("contains or not: " +al.contains("A"));
        al.add(1, "A2");
        System.out.println("Size of al after additions: " +
                al.size());
        // Display the array list.
        System.out.println("Contents of al: " + al);
        // Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " +
                al.size());

        System.out.println("Contents of al: " + al);
        //BUlk operation
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(4);
        al2.add(5);
        al2.add(6);
        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);
        al2.add(11);
        ArrayList<Integer> al3=new ArrayList<Integer>();
        al3.add(4);
        al3.add(5);
        al3.add(6);
        al3.add(7);
        al3.add(14);
        System.out.println("Contents of al2"+al2.containsAll(al3));
        System.out.println("Add of al2: " + al2.addAll(al3));
        System.out.println();
        hashsetdemo h=new hashsetdemo();
        h.hashtest();

    }
}
