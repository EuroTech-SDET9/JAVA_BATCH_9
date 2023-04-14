package days.day19;

public class Methods_6 {
    public static void main(String[] args) {
        // i want to get sum of the 2 integers
        int a = 50;
        int b = 30;
        System.out.println("a+b = " + a + b);
        int c = 60;
        int d = 100;
        System.out.println("c+d = " + c + d);
        int i = 20;
        int n = 35;
        System.out.println("i+n = " + i + n);

        getSum(10, 20);
        getSum(30, 5);
        getSum(130, 55);
        getSum(300, 50);
        getSum(230, 45);
        getSum(530, 95);
    }

    public static void getSum(int num, int num2) {
        System.out.println(num + num2);// 10+20  first time , second time 30+5
    }
    // create a method calculate whether a number is even or odd  10, 15,21,60
    // create a method calculate the bigger number of two    (10, 20) (30,10)

}
