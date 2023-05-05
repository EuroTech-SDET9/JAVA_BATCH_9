package days.day27;

import days.day24.ScannerSample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StringFormat {
    public static void main(String[] args) throws IOException {
        String name = "Ali";
        String greetings = "Hello " + name + "!";
        char exc = '!';
        System.out.println(greetings);
//                     Hello Ali!
        System.out.println(String.format("Hello %s %c", name, exc));
        // format specifiers
        //  String---->  %s         %S-->makes all chars capital
        //  int   ---->  %d
        //  char  ---->  %c
        // Ali is 25 years old
        name = "Ali";
        int age = 25;
        System.out.println(String.format("%s is %d years old", name, age));
        System.out.println(String.format("%S is %d years old", name, age));

        System.out.printf("%s is %d years old", name, age);
        System.out.printf("%S is %d years old", name, age);

        String lessonName = "Java";
        int javaGrade = 100;
        String lesson = "Selenium";
        int seleniumGrade = 105;
//        Java : 100
//        Selenium:105

//        Java      : 100
//        Selenium  : 105
        System.out.println();
        System.out.printf("%-8s : %-5d %n", lessonName, javaGrade);
        System.out.printf("%s : %d %n", lesson, seleniumGrade);

        for (int i = 1; i < 10; i++) {
            for (int n = 1; n < 10; n++) {
//                System.out.print(i * n+"  ");
                System.out.printf("%2d ", i * n);
            }
            System.out.println();
        }


    }

    public static void print() {
        System.out.println("Hello from string format class!!!!");
    }
    public static void sayhi() {
        System.out.println("Hi from string format class!!!!");
    }

}
