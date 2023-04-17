package days.day21;

public class Calculation {


    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(20.50, 80);
        add(20, 80.99);
    }

    // add();
    //
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, double d) {
        System.out.println(a + d);
    }

    public static void add(double d, int a) {
        System.out.println(a + d);
    }
}
