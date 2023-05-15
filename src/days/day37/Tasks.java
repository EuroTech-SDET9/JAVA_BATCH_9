package days.day37;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Character.*;

public class Tasks {

    public static void main(String[] args) {

        //TASK1
//int []test= {-1,-10};
//maxValue(test);

String str= "ADC431VD341";
        sortString(str);


    }

    //TASK1
    public static void maxValue (int[]n){

        int temp = Integer.MIN_VALUE; // n[0] , 0

        for (int i : n) {
            if(i>temp){
                temp=i;
            }
        }
        System.out.println("The max number is " + temp);
    }

    //TASK2
    public static void minValue (int[]n){
        int temp = Integer.MAX_VALUE; // n[0] , 0

        for (int i : n) {
            if(i<temp){
                temp=i;
            }
        }
        System.out.println("The min number is " + temp);
    }


    //TASK3
    public static void updateToDigits(String str) {
        char[] strtochar = str.toCharArray();
        ArrayList<Character> toDigits = new ArrayList<>();
        for (char c : strtochar) {
            if (Character.isDigit(c)) {
                toDigits.add(c);
            }
        }
        System.out.println(toDigits);
    }


    // TASK4

// str=  AB12      --3CD444F
    public static void sortString(String str){

        System.out.println("INPUT str = " + str);

        String strSplit=""; // expected output AB-123-CD-444-F

        for (int i = 0; i < str.length(); i++) {  //!! border!!
            strSplit += str.charAt(i);
            if(str.length()-1>i) {
                if ((isAlphabetic(str.charAt(i)) && isDigit(str.charAt(i + 1))) || (isDigit(str.charAt(i)) && isAlphabetic(str.charAt(i + 1))) ) {
                    strSplit += "-";
                }
            }
        }

        System.out.println("strSplit = " + strSplit);

        String[] split = strSplit.split("-");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));

        String returnStr="";

        for (String s : split) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);

            for (char c : sArray) {
                returnStr+=c;
            }
        }

        System.out.println("OUTPUT returnStr = " + returnStr);
    }


}
