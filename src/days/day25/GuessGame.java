package days.day25;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        // TRY TO APPLY hasNextInt and next methods... !! to handle invalid data
        int count = 0;
//        int secretNumber = 17;
        Random random = new Random();
        int secretNumber = random.nextInt(31);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            count++;
            System.out.println("write a number");
            int number = scanner.nextInt();
            if (number <= 30 && number >= 1) {
                if (number == secretNumber) {
                    System.out.println("Bravo you got the numbers in " + count + " times!!");
                     break;
                } else if (number > secretNumber) {
                    System.out.println(number + " is too large, please try again");

                } else{ //else if (number < secret number)
                    System.out.println(number + " is too short, please try again");
                }
            } else {
                System.out.println("unvalid number, please enter a number between 1 and 30");
            }
        }
    }
}
