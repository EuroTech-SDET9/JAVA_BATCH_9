package days.day21;

public class Calculation2 {


    // add(int a,int b)
    // subtract(int a,int b)
    // divide(int a,int b)
    // multiply(int a,int b)
    public static void main(String[] args) {

//        calculate("Multiply", 10, 5);
//        calculate("multiply", 10, 5);
        calculate("Divide", 100, 5);
        calculate("Add", 100, 5);
        calculate("Subtract", 100, 5);
    }
    //overload calculate method
    //create a new calculate3 class
    // try to make int all of the methods return value types and only print in the main method
    public static void calculate(String operation, int num, int num2) {
        // add    subtract divide multiply
        switch (operation) {
            case "Multiply":
                System.out.print("Multiplication ");
                multiply(num, num2);
                break;
            case "Divide":
                System.out.print("Division ");
                divide(num, num2);
                break;
            case "Add":
                System.out.print("Addition ");
                add(num, num2);
                break;
            case "Subtract":
                System.out.print("Subtraction  ");
                subtract(num, num2);
                break;
            default:
                System.out.println("couldnt find operation that you've searched.");
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }


}
