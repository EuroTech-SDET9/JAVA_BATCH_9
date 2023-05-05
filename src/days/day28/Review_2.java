package days.day28;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Review_2 {
    public static void main(String[] args) {
        // get the name of the user
        // get birth year ot the user
        // calculate age of the user
        // Messi is 35 years old
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name pls!!!!");
        String name = scanner.next();
//        System.out.println("name = " + name);
        System.out.println("enter your birth year pls!!!");
        int birthYear = scanner.nextInt();
//        System.out.println("birthyear " + birthYear);
        LocalDateTime localDateTime = LocalDateTime.now();
        //        int age=2023-
        int age = localDateTime.getYear() - birthYear;
//        System.out.println("age = " + age);
        //        Messi is 35 years old
        System.out.println(name + " is " + age + " years old.");
        System.out.println(String.format("%s is %d years old.", name, age));
       String result= String.format("%s is %d years old.", name, age);
        System.out.println("result = " + result);

    }
}
