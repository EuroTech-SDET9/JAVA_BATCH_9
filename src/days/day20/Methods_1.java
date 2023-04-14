package days.day20;

public class Methods_1 {
    public static void main(String[] args) {
        System.out.println("Hello!!");
        printNumbers();
        System.out.println("after calling method!!!");
        printNumbers();
        printNumber(10);// 10 is argument
        printNumber(20);
        int num = 30;
        printNumber(num);
        isNumberEvenOrOdd(num);
        isNumberEvenOrOdd(29);

    }

    public static void isNumberEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
//            System.out.println("number is odd");
            System.out.println(number + " is odd number.");
        }
    }

    public static void printNumber(int number) {// number is parameter
        System.out.println("number = " + number);
    }

    public static void printNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();
    }


}
