package days.day8;

public class OptPractice {


    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 11;

        System.out.println((num2 < num1) && (num2 == ++num1) || ((--num1 != num2) | (++num1 > num2)));

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

/////////////////////////////

        int n = 10;
        System.out.println((n < 10) && (++n == 11)); // false
        System.out.println("n = " + n);  // 10
        System.out.println((n < 10) & (++n == 11)); // false
        System.out.println("n = " + n);  // 11
    }


}
