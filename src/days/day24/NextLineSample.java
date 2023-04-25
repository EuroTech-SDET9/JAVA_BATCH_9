package days.day24;

import java.util.Scanner;

public class NextLineSample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter ITEM 1 name: ");

        String item1 = scanner.next();  // can store multiple word - till ENTER

        System.out.println("item 1 = " + item1);

        System.out.println("Please enter 2. ITEM name: ");
        scanner.nextLine();
        String item2 = scanner.nextLine();  // can store multiple word - till ENTER

        System.out.println("item 2 = " + item2);

        System.out.println("Please enter item QUANTITY: ");
        int quantity = scanner.nextInt();

        System.out.println("You order is :  "+quantity+" pcs X "+ item1+" item 1 !! ");
    }
}
