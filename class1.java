class car {
    String s = "sgksgs";

    void hasbreak() {
        System.out.println("break");
    }

    void hasaengin(int a) {
        System.out.println("engin");
    }

    void powerStering() {
        System.out.println("powerStering");
    }
}

class car1 extends car {
    String s = "sgksg12345";

    void hasbreak() {
        System.out.println("break1");
        // System.out.println(super.s);
        System.out.println(this.s);
    }

    void hasaengin(int a) {
        System.out.println("engin");
    }
}

class car2 extends car {
    String s = "sgksg1234dgaag5";

    void hasbreak() {
        System.out.println("break2");

        System.out.println(super.s);
        System.out.println(this.s);
    }

    void call() {
        hasbreak();
    }

    void hasaengin(int a) {
        System.out.println("engin");
    }
}

class test {
    public static void main(String[] args) {
        car2 c = new car2();
        c.hasbreak();
        c.call();
        c.powerStering();
    }
}
//binary conversion???????
