package days.day15;

public class For1 {
    public static void main(String[] args) {
        int n = 90;
        for (int i = 0; i < 3; i++) {//
            System.out.println("Hello");
        }

        for (int i = 0; i < 3; i++) {

        }

        {
            int number = 10;
            System.out.println("number = " + number);

        }

        {//outer block
            int num = 40;
            {
                //inner block
                System.out.println("num = " + num);
                int a = 30;
            }
            System.out.println("num = " + num);
        }
//        num unreacheable

        // between 10 30, print numbers divisible by 2, numbers divisible by 3

        for (int i = 10; i < 30; i++) {
//            System.out.println("i = " + i);
            if (i % 2 == 0 && i % 3 == 0) {// 10 false
                System.out.println(i + " is divisible by 2 and 3 without remaining");
            } else if (i % 2 == 0) {//
                // 10 is divisible by 2 without remaining
                System.out.println(i + " is divisible by 2 without remaining");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3 without remaining");
            }
        }
        //10 is divisible by 2 without remaining
        // 12 is divisible by 2 and 3 without remaining
        //14 is divisible by 2 without remaining


        // find the sum of the numbers between 10-50
        int sum = 0;
//        sum=10+11+12+13+14..........+49
        //sum = 21 + 12
        for (int l = 10; l < 50; l++) {
            // System.out.println("l = " + l);
            // sum = 0   + 10  1. iteration
            //       10  + 11
            //       21  + 12
            //       33  + 13
            //       46  +
            sum = sum + l;
        }
        System.out.println("sum = " + sum);
        int number = 40;
        number = number + 30;
        //        =  40     +  30
        System.out.println("number = " + number);


        //  even numbers between 20 - 35
        // how many even numbers are there between 20-35

        for (int i = 20; i < 35; i++) {
//            System.out.println("i = " + i);
            if (i % 2 == 0) {
                System.out.println(i + " is even number.");
            }
        }

        int evenCounter = 0;
        for (int i = 20; i < 35; i++) {
//            System.out.println("i = " + i);
            if (i % 2 == 0) {// 20 22
                evenCounter++;// 1 2
            }
//            System.out.println("counter = " + counter);//1 1 2
        }
        System.out.println("counter after for loop  = " + evenCounter);
// number of odd numbers between 20-35

        evenCounter = 0;
        int oddCounter = 0;
        int counter = 0;
        for (int i = 20; i < 35; i++) {
            counter++;
            if (i % 2 == 0) {// 20 22
                evenCounter++;// 1 2
            } else {
                oddCounter++;
            }

        }
        System.out.println("counter after for loop  = " + evenCounter);
        System.out.println("oddCounter = " + oddCounter);
        System.out.println(evenCounter + oddCounter);
        System.out.println(counter == (evenCounter + oddCounter));
    }
}
