package days.day53;

import java.util.ArrayList;

public class Calculator {
    // add --->  create 4 methods with that name
    int sum;
    String str;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(10, 20);
        System.out.println(calculator.add(10, 20));
//           System.out.println(calculator.add(20.5, 30.5));
        calculator.add(50.60, 80.40);
        calculator.add(20);
        calculator.add(100, 60, 30, 50, 60, 80);
        calculator.add(10, 20, 30, 50, 60, 80);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(5);
        nums.add(15);
        nums.add(100);
        nums.add(200);
        add(nums);
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(110);
        nums2.add(120);
        nums2.add(15);
        nums2.add(215);
        nums2.add(3100);
        nums2.add(200);
        add(nums2);


    }

//    public void add(int[] a) {duplicate
//
//    }

    public int add(int... args) {
        int sum = 0;
        for (int a : args) {
            sum += a;
        }
        System.out.println("sum = " + sum);
        return sum;
//        System.out.println("str = " + str); Unreachable statement
    }

    public int add(int a) {
        System.out.println("single arg");
        System.out.println(10 + a);
        System.out.println("sum = " + sum);
        System.out.println("str = " + str);
        return 10 + a;
    }

//    private void add(int a) {  will give error
//        System.out.println("single arg");
//        System.out.println(10 + a);
//    }

    public int add(int a, int b) {
        System.out.println("int");
        System.out.println(a + b);
        return a + b;
    }

    public void add(double a, double b) {
        System.out.println("double");
        System.out.println(a + b);
    }

//    public static void add(double a, double b) { get error
//        System.out.println("double");
//        System.out.println(a + b);
//    }

    //      10,20,5,4,6
    public static void add(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
//            sum = sum + nums.get(i);
            sum += nums.get(i);
        }
        System.out.println("sum = " + sum);
    }


}
