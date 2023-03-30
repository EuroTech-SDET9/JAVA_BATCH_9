package days.day11;

public class Nested2 {
    public static void main(String[] args) {

        //  number is greater then 0
        // number is greater then 100
        int number = -1000;
        if (number > 0) {

            if (number < 100) {

                System.out.println("number is a positive number and less then 100");

            } else {

                System.out.println(" number is greater then 100");
                System.out.println("number is positive ");

            }

        } else {
            System.out.println("number is a negative value");
        }


    }
}
