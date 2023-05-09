package days.day34;

import java.util.Arrays;

public class WrapperUsefulMethods {


    public static void main(String[] args) {

        String test ="Test123$£";
        //String to char array
        // create a loop get each char then check it


        char[] testChars = test.toCharArray();

        System.out.println("Arrays.toString(testChars) = " + Arrays.toString(testChars));

        for (char testChar : testChars) {
            if(Character.isDigit(testChar)){
                System.out.println(testChar + " is DIGIT");
            } else if(Character.isLetter(testChar)){
                System.out.println(testChar + " is LETTER");
            } else{
                System.out.println(testChar + " is special character");
            }
        }

        System.out.println("Character.isLowerCase('l') = " + Character.isLowerCase('l'));

        ////////

        Integer obj = Integer.valueOf("3");

        System.out.println("obj instanceof Integer = " + (obj instanceof Integer));


        int objPrimitive = obj.intValue(); // convert object to variable!!!

        ///////
        int t1 = 4;
        Integer obj2 = t1;  // convert variable to obj ->process name auto boxing !!!

        int t2 = obj2.intValue();
        t2 = obj2;  // convert obj to variable -> process name unboxing !!!


        ////////////////

        // Convert string to int!!!

        String actualValue= "1001.01";

        double actualDouble = Double.parseDouble(actualValue); // it is convert string to double!!!
//        int  actualInt = Integer.parseInt(actualValue);  // it throws NumberFormatException !! it is not int !!! it is double

        System.out.println("actualDouble = " + actualDouble);
    }
}
