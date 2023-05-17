package days.day39;

public class Calculation {


    //add 2 parameters add 2 int values and print

    public void add(int a, int b) {
        System.out.println("result of addition = " + (a + b));
    }

    public int add(int a, int b, int c) {
        System.out.println("result of addition = " + (a + b + c));
        return a + b + c;
    }

    public int add(int... numbers) {
        System.out.println(numbers[0]);
        int sum = 0;
        for (int a : numbers) {
            sum = sum + a;
        }
        System.out.println("sum = " + sum);
        return sum;
    }
    //multiply 2 paramters

    public void multiply(int a, int b) {
        System.out.println("Multiplication result = " + a * b);
    }

    //subtract   2 parameter
    public void subtract(int a, int b) {
        System.out.println("result of the subtraction =" + Math.abs(a - b));
    }

    public void operate(String operation, int a, int b) {
        switch (operation) {
            case "ply":
                multiply(a, b);
                break;
            case "dd":
                add(a, b);
                break;
            case "tract":
                subtract(a, b);

        }
    }


}
