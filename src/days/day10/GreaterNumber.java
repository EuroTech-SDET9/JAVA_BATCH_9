package days.day10;

public class GreaterNumber {
    public static void main(String[] args) {
        // create 2 variables
        //find the greatest one
        int a = 20, b = 10;
        if (a > b) {
            // 10 is greater then 5
            System.out.println(a + " is greater then " + b);
            System.out.println("a is greater then b");
        } else {// b is greater then a
            System.out.println(b + " is greater then " + a);
            System.out.println("b is greater then a");
        }
        a = 20;
        b = 10;
        int c = 30;
        // which number is the greatest number
        // use only if statement
        int greatestNumber = 0;
        if (a > b & a > c) {
            System.out.println(a + " is the greatest number.");
            greatestNumber = a;
        }
        if (b > a & b > c) {
            System.out.println(b + " is the greatest number.");
            greatestNumber = b;
        }
        if (c > a & c > b) {
            //true& true
            System.out.println(c + " is the greatest number.");
            greatestNumber = c;
            // greatestNumber=30
        }
        System.out.println("greatestNumber = " + greatestNumber);

        int number = 10;
        if (number > 0) {//true
            ++number;//increase value of the number
//            ++number;
//            ++number;
//            ++number;
        } else {
            number--;
        }
        System.out.println("number = " + number);//11

    }
}
