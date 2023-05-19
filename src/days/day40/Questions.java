package days.day40;

public class Questions {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap the values
        int c = 0;
        //write your code
        // first solution
        c = a;//10
        a = b;//20
        b = c;//10

        System.out.println("a = " + a);//20
        System.out.println("b = " + b);//10
//        second solution

        a = 20;
        b = 10;

        a = b + a;//30
        //  10  20
        b = a - b;// 30-10  b=20
        a = a - b;//30-20  a=10

        System.out.println("a = " + a);//10
        System.out.println("b = " + b);//20


        a = 5;
        b = 45;

        a = b + a;
        //  45  5    50
        b = a - b;//
        //  50-45   b -> 5
        a = a - b;//  50 - 5

        System.out.println("a = " + a);//45
        System.out.println("b = " + b);//5

        a = 987654321;
        // 123456789

        a = 123;
        //    321
        int reversed = a % 10;
        a = a / 10;// 12
        reversed = reversed * 10 + a % 10;//  32
        System.out.println(reversed);
        a = a / 10;
        System.out.println("a = " + a);
        reversed = reversed * 10 + a % 10;//  321
        System.out.println("reversed = " + reversed);
        System.out.println("a/10 = " + a / 10);//0
        a = 1234561;
        reversed = 0;
//  1*10 + 9
        while (a != 0) {
            reversed = reversed * 10 + a % 10;
            a = a / 10;
        }
        System.out.println("reversed = " + reversed);


        int reverse1234 = reverseNumber(1234);
        reverseNumber(654);
        reverseNumber(876);
        reverseNumber(1981);
        reverseNumber(190702);

    }

    public static int reverseNumber(int number) {
        int reversed = 0;
//  1*10 + 9
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("reversed = " + reversed);
        return reversed;
    }


}
