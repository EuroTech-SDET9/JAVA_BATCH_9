package days.day24;

import java.util.Scanner;  // if it's colour gray-> it's mean that we didn't call it!!

import days.day23.Phone;

public class ScannerSample {
    Phone mobile = new Phone();

    // Phonee test = new Phonee(); can't import, not exist in my project!!

    // 3 ways to import
//    1- Hover over class name and click import
//    2- right click -> show content action -> import
//    3- click on your class -> alt+enter -> import!!


    public static void main(String[] args) {
        System.out.println("HELLO BATCH 9");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int test = scanner.nextInt(); //jvm will pause in line 24!!

        System.out.println("test = " + test);

        System.out.println("Please enter tax rate: ");
        double rate= scanner.nextDouble();
        System.out.println("rate = " + rate);

    }
}
