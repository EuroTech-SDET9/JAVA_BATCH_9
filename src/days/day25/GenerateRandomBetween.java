package days.day25;

import java.util.Random;

public class GenerateRandomBetween {


    public static void main(String[] args) {

        Random random = new Random();

        int low= 1; // inc
        int high= 4; // exs

        int randomValue=random.nextInt(high-low) + low;

        System.out.println("randomValue = " + randomValue);
    }
}
