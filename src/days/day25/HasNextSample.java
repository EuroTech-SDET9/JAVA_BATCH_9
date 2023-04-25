package days.day25;

import java.util.Scanner;

public class HasNextSample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER NUMBER: ");
//        System.out.println("scanner.hasNextInt() = " + scanner.hasNextInt());

        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println("number = " + number);
        } else{
            scanner.next();
            System.out.println(" IT IS NOT INTEGER!!!!! ");
        }

        System.out.println("ENTER pin: ");

        int pin = scanner.nextInt();
        System.out.println("pin = " + pin);

    }
}
