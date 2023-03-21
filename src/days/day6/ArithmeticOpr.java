package days.day6;

public class ArithmeticOpr {


    public static void main(String[] args) {

        int number1 = 4 + 5 + 2 - 1;
        System.out.println("number1 = " + number1);

        int number2 = 4 * 2 / 8 ;
        System.out.println("number2 = " + number2);

        int number3= 4 + 2 / 2 - 1 * 4;
                 //= 4 +   1   - 1 * 4
                 //= 4 +   1   -   4
                 //= 5 - 4 = 1
        System.out.println("number3 = " + number3);

        int opt1=17, opt2=4, modules;

        modules = opt1 % opt2;

        System.out.println("modules = " + modules);


        System.out.println("\n////////////////////// Parenthesis /////////////////////////////");


        int v1= 3 * 7 + (4+2) - (3*2) / 3 ;
        //    = 3 * 7 + 6 - 6 / 3
        //    = 21 + 6 - 2
        //    = 27 - 2 = 25
        System.out.println("v1 = " + v1);

        System.out.println("Test value is " + 4 + 5); //Test value is 45
        System.out.println("Test value is " + (4 + 5)); //Test value is 9


        int v2 = 4 / 2 - (4 / (4 - 2)) + (4 - 1) / 3;
             //= 4 / 2 - (4 / 2 ) + (4 - 1) / 3;
             //= 4 / 2 - 2 + (4 - 1) / 3;
             //= 4 / 2 - 2 + 3 / 3;
             //= 2 - 2 + 3 / 3;
             //= 2 - 2 + 1;
             //= 0 + 1 = 1
        System.out.println("v2 = " + v2);


        System.out.println("\n////////////////////// Concatenation /////////////////////////////");
        String result;

        result = "Test " + true;
        System.out.println(result); // Concatenation -> Test true

        result = 1 + "Test ";
        System.out.println(result); // Concatenation -> Test 1

        result = "Test " + "User";
        System.out.println(result); // Concatenation -> Test User

//        System.out.println(true + 1);



    }
}
