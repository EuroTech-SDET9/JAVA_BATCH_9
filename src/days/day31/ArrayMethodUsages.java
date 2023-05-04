package days.day31;

import java.util.Random;

public class ArrayMethodUsages {

    public static void main(String[] args) {
        printKey("JAVA");  // The given key is JAVA
//        printKey(2);
        printKey("TEST");  // The given key is TEST
        printKey("HEEY");  // The given key is HEEY
        System.out.println("\n/////////////////////////\n");
        int[] values = {22, 33, 44, 66, 66, 77, 999};
        printGivenArray(values);
        System.out.println("\n/////////////////////////\n");

        int[] testData = {-11, 222, 343243, 3322};
        printGivenArray(testData);
        System.out.println("\n/////////////////////////\n");

        int[] rates = {10, 20, 30, 50, 100};
        printGivenArray(rates);
        System.out.println("\n/////////////////////////\n");

        String[] words = {"test", "vv", "src", "main", "config"};
        // printGivenArray(words);


        System.out.println("\n/////////////////////////\n");

        int[] randomArray = generateArrayWithRandomNumbersForGivenSize(5);
        printGivenArray(randomArray);

        printGivenArray( generateArrayWithRandomNumbersForGivenSize(5) ); // method inside method!!

    }

    public static void printKey(String key) {
        System.out.println("The given key is " + key);
    }

    public static void printGivenArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    public static int[] generateArrayWithRandomNumbersForGivenSize(int size) {   // size 3
        Random random = new Random();
        int[] returnArray = new int[size]; // first I created a blank array!!

        for (int i = 0; i < size; i++) { // i = 0   -> 1  -> 2  // in loop I assign each random number 1 by 1
            returnArray[i] = random.nextInt();  //returnArray[0] = 23 -> returnArray[1] = 22223 -> returnArray[2] = 2;
        }

        return returnArray;
    }
}
