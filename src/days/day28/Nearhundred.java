package days.day28;

public class Nearhundred {

    //    Given an int n, return true if it is within 10 of 100 .
//    Note: Math.abs(num) computes the absolute value of a number.

    //            nearHundred(93) → true
//    nearHundred(90) → true
//    nearHundred(89) → false
    public static void main(String[] args) {
        int n = 111;
        if (Math.abs(100 - n) <= 10) {
//        if (100 - 111 <= 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        nearHundred(120);
        nearHundred(105);
        System.out.println(Math.max(10, 20));
        System.out.println(Math.max(50.90, 88.66));
        System.out.println(Math.min(5, 9));
        System.out.println(Math.pow(2, 3));// 2 * 2 * 2
        System.out.println(Math.sqrt(9));// 3
        System.out.println(Math.random() * 100);
        System.out.println((int) (Math.random() * 10));
        System.out.println(50 + (int) (Math.random() * 100));
        for (int i = 0; i < 10; i++) {
            System.out.println((50 + (Math.random() * 100)));
        }
    }


    public static boolean nearHundred(int n) {
        boolean result = true;
        if (Math.abs(100 - n) <= 10) {
//        if (100 - 111 <= 10) {
            System.out.println(true);
            result = true;
        } else {
            result = false;
            System.out.println(false);
        }

        return result;
    }

}
