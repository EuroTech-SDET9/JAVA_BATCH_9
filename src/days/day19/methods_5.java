package days.day19;

public class methods_5 {
    public static void main(String[] args) {
        int number = 10;
//        System.out.println("calculating power of the number");
//        System.out.println(number * number);
        getPower(10);
        number = 50;
//        System.out.println("calculating power of the number");
//        System.out.println(number * number);
        getPower(50);
        number = 5;
//        System.out.println("calculating power of the number");
//        System.out.println(number * number);
        getPower(5);
    }

    public static void getPower(int num) {
        // calculate
        System.out.println("calculating power of the " + num);
        System.out.println(num * num);
    }

}
