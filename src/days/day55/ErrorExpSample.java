package days.day55;

public class ErrorExpSample {


//         OutOfMemoryError
//    ArrayIndexOutOfBoundsException

    public static void main(String[] args) {
        System.out.println(" BEGINNING OF THE MAIN METHOD");
        //      System.out.println(1/0);  // this is runtime-errors
//        System.out.println() //  this is compile time errors  //syntax issue

//        int test = test();

        int num1 = 1;

        int num2 = getDBvalue();
        System.out.println("Test mid value is " + (num1 / num2));


        System.out.println(" END OF THE MAIN METHOD");
    }

    public static int getDBvalue() {
        return 0;
    }

    public static int test() {
        return test2();
    }

    public static int test2() {
        return test3();
    }

    public static int test3() {
        return test4();
    }

    public static int test4() {
        return test5();
    }

    public static int test5() {
        int[] test = {1, 2, 3};
        return test[10];
//        ArrayList<Objects> list =
//        String value = list.get(3)
    }


}
