package days.day24;


import java.util.Scanner;

public class NextIntSample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter ID number :");
        int idNumber= scanner.nextInt();

        System.out.println("Please enter Lucky number :");
        int luckyNumber= scanner.nextInt();

        System.out.println("Please enter birth year :");
        int birthYear = scanner.nextInt();


        System.out.println("YOUR JAVA LUCK NUMBER IS " + (idNumber*luckyNumber+birthYear));



    }
}
