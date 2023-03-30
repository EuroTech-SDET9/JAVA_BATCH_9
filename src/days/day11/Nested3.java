package days.day11;

public class Nested3 {
    public static void main(String[] args) {

        if (true) {// first condition
            if (true) {// second condition
                //statement will be executed
            }
        }
        int number = 30;
        // even-odd
        // number is divided by 2 without remaining
        // same number is divided by 3 without remaining

        if (number % 2 == 0) {
            if (number % 3 == 0) {
                System.out.println("number is dividable by 2 &3");
                System.out.println("number is dividable by 6");
            }
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }


    }
}
