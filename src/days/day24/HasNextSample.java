package days.day24;

import java.util.Scanner;

public class HasNextSample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER VALUE: ");

//        System.out.println("scanner.hasNextInt() = " + scanner.hasNextInt());
//CREATE LOOP IN THE BEGINNING !!!
        if(scanner.hasNextInt()) {
            int value = scanner.nextInt();
            System.out.println("value = " + value);
        } else{
            System.out.println(" GET OUT OF MY CODE!! ");
        }

        scanner.close(); // not mandatory, good to use
    }
}
