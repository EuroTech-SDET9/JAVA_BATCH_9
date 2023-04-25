package days.day24;

import java.util.Scanner;

public class StringInputs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter ITEM name: ");

        String item = scanner.next();  // can store only 1 word - till space

        System.out.println("Please enter item QUANTITY: ");
        int quantity = scanner.nextInt();

        System.out.println("You order is :  "+quantity+" pcs X "+ item+" item !! ");

    }
}
