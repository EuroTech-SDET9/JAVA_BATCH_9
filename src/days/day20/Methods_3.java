package days.day20;

public class Methods_3 {
    public static void main(String[] args) {

        System.out.println(getSum(20, 30));// 50

        int result = getSum(5, 8);//13
        System.out.println("result = " + result);//13

        System.out.println(getSum(50, 30));
        System.out.println(80);
        int result2 = 80;
        int result3 = getSum(50, 30);

        boolean b = isPositive(30);// true
        System.out.println("b = " + b);
        System.out.println(isPositive(-10));// false

    }

    public static boolean isPositive(int number) {
        boolean result = true;
        if (number >= 0) {
//            System.out.println("number is positive");
            System.out.println(number + " is positive");
            result = true;
        } else {
//            System.out.println("number is negative");
            System.out.println(number + " is negative");
            result = false;
        }
        return result;
    }

    public static int getSum(int num, int num2) {
        // return value type is int
        int sum = num + num2;//20+30   5 + 8
        return sum;// 50  13
    }

    // 1 parameter int positive or negative

}
