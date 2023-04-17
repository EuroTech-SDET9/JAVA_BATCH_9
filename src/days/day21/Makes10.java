package days.day21;

public class Makes10 {
    //    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//    makes10(9, 10) → true
//    makes10(9, 9) → false
//    makes10(1, 9) → true
    public static void main(String[] args) {

        boolean result1 = makes10(1, 9);// 1-9 arguments
        System.out.println("result1 = " + result1);
        boolean result2 = makes10(9, 9);
        System.out.println("result9-9 = " + result2);
        System.out.println(makes10(9, 10));
    }

    public static boolean makes10(int a, int b) {// a-b parameters   makes10(int a, int b) -->signature of the method
        boolean result = true;
        if (a == 10 || b == 10 || a + b == 10) {
//            result = true;
            return true;
        } else {
//            result = false;
            return false;
           // System.out.println("hello"); unreacheable
        }

      //  return result;
    }
}
