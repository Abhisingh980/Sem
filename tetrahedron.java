import java.util.*;

class Tetrhedron {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y coordinates of side1:");
        int x11 = sc.nextInt();
        int y11 = sc.nextInt();
        int x12 = sc.nextInt();
        int y12 = sc.nextInt();
        int x13 = sc.nextInt();
        int y13 = sc.nextInt();
        System.out.println("Enter the x and y coordinates of side2");
        int x21 = sc.nextInt();
        int y21 = sc.nextInt();
        int x22 = sc.nextInt();
        int y22 = sc.nextInt();
        int x23 = sc.nextInt();
        int y23 = sc.nextInt();
        System.out.println("Enter the x and y coordinates of side3:");
        int x31 = sc.nextInt();
        int y31 = sc.nextInt();
        int x32 = sc.nextInt();
        int y32 = sc.nextInt();
        int x33 = sc.nextInt();
        int y33 = sc.nextInt();
        System.out.println("Enter the x and y coordinates of base:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        Point ps1 = new Point(x11, y11);
        Point ps2 = new Point(x12, y12);
        Point ps3 = new Point(x13, y13);
        Triangle T1 = new Triangle(ps1, ps2, ps3);
        Point ps4 = new Point(x21, y21);
        Point ps5 = new Point(x22, y22);
        Point ps6 = new Point(x23, y23);
        Triangle T2 = new Triangle(ps4, ps5, ps6);
        Point ps7 = new Point(x31, y31);
        Point ps8 = new Point(x32, y32);
        Point ps9 = new Point(x33, y33);
        Triangle T3 = new Triangle(ps7, ps8, ps9);
        Point ps10 = new Point(x1, y1);
        Point ps11 = new Point(x2, y2);
        Point ps12 = new Point(x3, y3);
        Triangle B = new Triangle(ps10, ps11, ps12);
        TriangularPyramid obj = new TriangularPyramid(T1, T2, T3, B);
        System.out.println(obj.isTetrahedron(obj));
        sc.close();
    }
}

enum TypeOfTriangularPyramid {
    NOTTETRAHEDRON, TETRAHEDRON
}

enum TypeOfTriangular {
    EQUILATERAL, NOTEQUILATERAL
}

class Point {
    int x, y;

    Point() {
        this.x = this.y = 0;
    }

    Point(Point p) {
        this(p.x, p.y);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Triangle {
    Point p1, p2, p3;

    Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    Triangle(Triangle T) {
        this(T.p1, T.p2, T.p3);
    }

    Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    int distance(Point p1, Point p2) {
        return (int) Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    TypeOfTriangular istriangleequilateral(Triangle a) {
        if (distance(p1, p2) == distance(p2, p3) && distance(p1, p3) == distance(p2, p3))
            return TypeOfTriangular.EQUILATERAL;
        else
            return TypeOfTriangular.NOTEQUILATERAL;
    }
}

class TriangularPyramid {
    Triangle side1;
    Triangle side2;
    Triangle side3;
    Triangle base;
    TypeOfTriangularPyramid type;
    Point centroid;

    TriangularPyramid(Triangle side1, Triangle side2, Triangle side3, Triangle base) {
        this.side1 = new Triangle(side1);
        this.side2 = new Triangle(side2);
        this.side3 = new Triangle(side3);
        this.base = new Triangle(base);
    }


TypeOfTriangularPyramid isTetrahedron(TriangularPyramid tp) {
if(base.istriangleequilateral(tp.base)==TypeOfTriangular.EQUILATERAL && side1.istriangleequilateral(tp.side1) == TypeOfTriangular.EQUILATERAL && side2.istriangleequilateral(tp.side2) == TypeOfTriangular.EQUILATERAL && side3.istriangleequilateral(tp.side3) == TypeOfTriangular.EQUILATERAL) {tp.type =TypeOfTriangularPyramid. TETRAHEDRON;}
else
{tp.type = TypeOfTriangularPyramid.NOTTETRAHEDRON;} return tp.type;}}
