package days.day16;

public class DoWhile {
    public static void main(String[] args) {
// do while
        int n = 0;

        do {
            System.out.println("Hello!!!!");
            n++;// increment
        } while (n < 3);// condition

        System.out.println("ouf of the do-while loops");
        for (int i = 0; i < 3; i++) {
            System.out.println("for loop");
        }

        int number = 3;
        do {

            System.out.println("Hi!!");

            ++number;
            number++;
        } while (number < 0);//even if the first condition is false at lest block will be executed once
        System.out.println("number = " + number);//5
// find even numbers 0-10 do-while loop
        number = 0;
        do {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            }

            number++;
        } while (number < 10);
        System.out.println("=================");
        number = 0;
        do {
            number++;
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            }

        } while (number < 10);
        // 0 1 2 3
        // 3 2 1 0   decrease value

        for (int l = 3; l >= 0; l--) {
            System.out.println(l);//3 2 1 0
        }
        System.out.println("==============");
        //do-while
        number = 3;
        do {

            System.out.println("number = " + number);

            --number;
        } while (number >= 0);//

        // find the sum of the numbers between 30-60 - do-while
        number = number + 30;
        int box = 0;
        // box=30+31+32+33+34........59+60
        // box=30
        //     30+31---> 61
        //     61+32
        //     93+33
        int num = 30;
        do {
//            System.out.println(num);
            //   box = box + num;
            box += num;
            num++;
        } while (num <= 60);
        System.out.println("box = " + box);
        // odd numbers between 0-10
        num = 0;
        int counter = 0;
        do {

            if (num % 2 == 1) {
                System.out.println(num + " is odd number");
                counter++;
            }
            num++;
        } while (num < 10);

        System.out.println("counter = " + counter);

    }
}
