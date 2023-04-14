package days.day19;

public class Methods_3 {
    public static void main(String[] args) {
        int number = 1000;
        System.out.println(number);
        printMyName();
        System.out.println(number);
    }
    //   1000
    //   number 9
    //   Ronaldo!!!!!
    //   1000
    public static void printMyName() {
        int number = 9;//local variable reachable only printMyName method block
        System.out.println("number = " + number);
        System.out.println("Ronaldo!!!");
    }

    public static void printNumber() {

        // System.out.println("number = " + number); not reachable in this method
    }


}
