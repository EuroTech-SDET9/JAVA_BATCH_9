package days.day41;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbers {
    //prime numbers 50-100
    public static void main(String[] args) {
//        2 3 4 5 6 7 8 9 10     11
//        2 3 4 5 6 7 8 9                      49%7==0
        int number = 54;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
//        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime.");
        }

        isPrimeOrNot(51);
        isPrimeOrNot(52);
        isPrimeOrNot(53);
        isPrimeOrNot(54);
        isPrimeOrNot(55);
        isPrimeOrNot(56);
        isPrimeOrNot(57);
        int beginning = 100;
        int ending = 150;
        for (int i = beginning; i < ending; i++) {
            isPrimeOrNot(i);
        }
        System.out.println("===========");
        primeNUmbers(200, 250);
        primeNUmbers(300, 350);
        System.out.println("================");
        ArrayList<Integer> primes10_50 = primeNumbers(10, 50);
        System.out.println("primes10_50 = " + primes10_50);
        System.out.println("=================");
        System.out.println(randomPrimeNumber(20, 50));
        System.out.println( randomPrimeNumber(23,30));

    }

    public static int randomPrimeNumber(int a, int b) {
        //                                 100 1000
        ArrayList<Integer> integers = primeNumbers(a, b);
        System.out.println("integers = " + integers);
        Random random = new Random();
        int index = random.nextInt(integers.size());
        return integers.get(index);
    }

    public static ArrayList<Integer> primeNumbers(int beginning, int ending) {
        ArrayList<Integer> primenumbers = new ArrayList<>();
        for (int i = beginning; i < ending; i++) {
            if (isPrimeOrNot(i)) {
                primenumbers.add(i);
            }
        }
        return primenumbers;
    }

    public static void primeNUmbers(int beginning, int ending) {
        //            100            200
        for (int i = beginning; i < ending; i++) {
            //          100   101 102 ......198 199
            isPrimeOrNot(i);
        }

    }


    public static boolean isPrimeOrNot(int number) {
        boolean isPrime = true;
//        for (int i = 2; i < number; i++) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            //Math.sqrt(25)    25% 2  25%3 25%4  25%5==0
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        }

//        else {
//            System.out.println(number + " is not prime.");
//        }
        return isPrime;
    }


}
