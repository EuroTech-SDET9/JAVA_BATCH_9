package days.day39;

public class Test {
    public static void main(String[] args) {
        Calculation calculate = new Calculation();
        calculate.add(10, 20);
        calculate.add(5, 10);
        Calculation calculate2 = new Calculation();
        calculate2.add(50, 60);
        calculate.multiply(20, 50);
        calculate.operate("ply", 5, 7);// multi  ply
        calculate.operate("dd", 35, 100);
        calculate.subtract(20, 10);
        calculate.subtract(20, 100);
        calculate.operate("tract", 500, 800);
        int sum3 = calculate.add(10, 20, 50);
        System.out.println("sum3 = " + sum3);
        if (sum3 > 0) {
            System.out.println(sum3 + " is a positive number.");
        } else {
            System.out.println(sum3 + " is a negative number.");
        }
        int resultOfAddition = calculate.add(99, 2, 5, 9, 10, 12, 15, 19, 18);
        System.out.println("resultOfAddition = " + resultOfAddition);

    }
}
