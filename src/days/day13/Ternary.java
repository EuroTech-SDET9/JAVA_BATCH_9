package days.day13;

public class Ternary {
    public static void main(String[] args) {
        int number = 9;
        // if the number is less then 10 print "number is less then 10"
        // else "number is greater then 10"
        if (number < 10) {
            System.out.println("number is less then 10");
        } else {
            System.out.println("number is greater then 10");
        }
        number = 15;
        //           1                    2-true                       3-false
        String result = (number < 10) ? "number is less then 10" : "number is greater then 10";
        System.out.println("result = " + result);

        number = -10;
        // if-else whether this number is positive or negative
        // ternary operator

        if (number < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is negative");
        }
//                                   true        false
        result = (number >= 0) ? "positive" : "negative";

        System.out.println("result = " + result);

        number = 35;
        // check this number is even or odd assign result and print the result

        result = number % 2 == 0 ? "even" : "odd";
        System.out.println("number is " + result);

        int age = 10;
        int studentClass = 0;
        // if age is 10 studentclass=4    otherwise studentclass=1

        studentClass = (age == 10) ? 4 : 1;
        System.out.println("studentClass  = " + studentClass);
        number = 11;
        boolean isNumberEven = number % 2 == 0 ? true : false;
        System.out.println("isNumberEven = " + isNumberEven);

//        number % 2 == 0 ? System.out.println("number is even") : System.out.println("number is odd");   ERROR!!!!!!!!

        int time = 15;
        // if time is less then 18 "Good Day" else "Good evening"
        String greeting = (time < 18) ? "Good day" : "Good evening";
        //                      1            2              3
        //                   condition      true            false
        System.out.println("greeting = " + greeting);


    }
}
