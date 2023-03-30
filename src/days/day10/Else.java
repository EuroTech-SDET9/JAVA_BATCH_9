package days.day10;

public class Else {
    public static void main(String[] args) {
        int number;
        // whether this number is positive or not
        // print this number is positive
//        System.out.println(number);
        // in the methods if you want to use any variable before you use them you have to initialize them
        number = 10;
        System.out.println(number);
        if (number >= 0)// if the re is only 1 statement in the if block if you remove {} code will work
            System.out.println(number + " is positive number.");
        number = -15;
        // else
        // if number is not positive then it is a negative number
        if (number >= 0) {// if condition is true
            System.out.println(number + " is positive number.");
        } else {// if condition is false
            System.out.println(number + " is negative number.");
        }
        System.out.println("out of else block");

        int age = 10;
        // if the age is over then 18 is elligible for voting
        // else not elligible for voting
        if (age > 18) {
            System.out.println(age + "is elligible for voting.");
        } else {
            System.out.println(age + " is not elligible for voting.");
        }
        number = 41;
        // if and else block to find number is even or odd
//        fn + insert
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }


    }
}
