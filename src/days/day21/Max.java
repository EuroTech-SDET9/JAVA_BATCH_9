package days.day21;

public class Max {


    // max()-->2 parameters find the max value
    // max()-->3 parameters
    public static void main(String[] args) {
        max(20, 30);
        max(10, 30, (int)50.60);// narrowing explicitly you have to cast
        max(20.80,60);// widening implictly casting
        // byte short int  long float double
    }

    public static void max() {

    }

    public static void max(double a, double b) {
        if (a > b) {
            System.out.println(a + " is bigger.");
        } else {
            System.out.println(b + " is bigger.");
        }
    }

    public static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is breatest number.");
        } else if (b > c) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println(c + " is the greatest number.");
        }
    }

    public static void max(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger.");
        } else {
            System.out.println(b + " is bigger.");
        }
    }

}
