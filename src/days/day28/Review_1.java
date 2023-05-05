package days.day28;


import days.day27.StringFormat;

//import static days.day27.StringFormat.print;
//import static days.day27.StringFormat.sayhi;
import java.util.Scanner;

import static days.day27.StringFormat.*;

public class Review_1 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(-2.1));
        System.out.println(Math.floor(-2.1));
        StringFormat.print();
        print();
        sayhi();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number pls!!!");
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("you have not entered a number");
        }
        System.out.println("number = " + number);
        System.out.println("now enter a your name pls");
        String name = scanner.next();
        System.out.println("name = " + name);

        // get a number from the user check this number is even or odd
        System.out.println("enter a number pls");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("even number ");
        } else {
            System.out.println("number is odd");
        }
        // get the name of the user and print Hello + username
        System.out.println("Could you enter your name pls!!!!");
        name = scanner.next();
        System.out.println("Hello ".concat(name));
        System.out.printf("Hello  %s", name);


    }
}
