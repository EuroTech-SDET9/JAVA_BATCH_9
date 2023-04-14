package days.day19;

public class Methods_2 {
    public static void printMyName() {
        System.out.println("Hello!!from Faruk!!!");
    }

    public static void main(String[] args) {
        System.out.println("Main method, before printHello method-----     1   ");
        printHello();
        System.out.println("still in the main method!!!!    3   ");
        System.out.println("hello from main method  4  ");
        printHello();
        printHello();
        System.out.println("end of the main method!!!!");
//        System.out.println("Hello from Faruk!!!!");
        printMyName();
        printMyName();
    }

    //Main method, before printHello method
    //Hello!!! from print method
    //still in the main method!!!!

    public static void printHello() {
        System.out.println("Hello!!! from print method      ");
    }
}