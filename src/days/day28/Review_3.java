package days.day28;

import java.util.Random;

public class Review_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("number = " + number);
  //      System.out.println("number between 50-100  = " + random.nextInt(50, 100));
        number = random.nextInt(40 - 20) + 20;
        System.out.println("number between 20 -40  = " + number);

        int evenNumber = random.nextInt(100 / 2) * 2;
        System.out.println("evenNumber = " + evenNumber);

        int evenNumber100_200 = 100 + random.nextInt((200 - 100) / 2) * 2;
        System.out.println("evenNumber100_200 = " + evenNumber100_200);
        int endOfRange = 600;
        int startOfRange = 500;
        System.out.println(startOfRange+random.nextInt((endOfRange-startOfRange)/2)*2);



    }
}
