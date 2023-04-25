package days.day25;

import java.util.Random;

public class RandomSample {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("random.nextInt() = " + random.nextInt()); // generate number between integer range

        // nextInt(max) --> 0-(max-1)
        System.out.println("random.nextInt(10) = " + random.nextInt(10));

        System.out.println("random.nextDouble() = " + random.nextDouble()); // 0.0(inc) - 1.0(ex)

//        0.0(inc) - 100.0(exc) as double

        System.out.println("0.0(inc) - 100.0(exc) as double = " + (random.nextInt(100) + random.nextDouble()));

        System.out.println("random.nextBoolean() = " + random.nextBoolean());

    }
}
