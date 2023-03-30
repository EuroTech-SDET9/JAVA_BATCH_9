package days.day10;

public class FindModules {
    public static void main(String[] args) {
        int number = 21;
        // if the number is even or not   %
        // 20/2   remaining is 0 --> even   remaining is 1---> odd number

        if (number % 2 == 0) {//  20/2=10  remaining is 0
            System.out.println("number is even.");
            System.out.println(number + "  is even.");
            //                  20  is even number.
        }
        if (number % 2 == 1) {//remaining is equals to 0
            System.out.println(number + " is odd number.");
        }
        if (number % 2 != 0) {// if the remaining is not 1
            System.out.println(number + " is odd number.");
        }
        if (number % 3 == 0) {
            //                 number is dividable by 3 without remaining
            System.out.println(number + " is dividable by 3 without remaining.");
        }
        number = 12;
        //  number is dividable by 2 and 3
        if (number % 2 == 0 && number % 3 == 0) {
            //   true      &&     true
            System.out.println(number + " is dividable by 2 and 3.");
        }

    }

}
