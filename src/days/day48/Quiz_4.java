package days.day48;

import java.util.Arrays;

public class Quiz_4 {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello");
        System.out.println("str==str2 = " + str == str2);
        System.out.println("str.equals(str2) = " + str.equals(str2));

        System.out.println("str.toUpperCase() = " + str.toUpperCase());//HELLO
        System.out.println("str = " + str);//Hello

        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.append(" Ali");
        System.out.println("stringBuilder = " + stringBuilder);//mutable
        str.concat(" Ali");
        System.out.println("str = " + str);//Hello
        //Palindrom   madam radar

        String reversed = String.valueOf(stringBuilder.reverse());
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("reversed = " + reversed);

        String reverse = "Leicester";
        StringBuilder stringBuilder1 = new StringBuilder(reverse);
        System.out.println("reverse = " + reverse);
        System.out.println("stringBuilder1 = " + stringBuilder1);
        reversed = String.valueOf(stringBuilder1.reverse());
        System.out.println("reversed = " + reversed);
        System.out.println("reverse = " + reverse);
        if (reverse.equals(reversed)) {
            System.out.println(reverse + " palindrome");
        } else {
            System.out.println(reverse + " not palindrome");
        }

        StringBuilder builder = new StringBuilder("London");
        builder.insert(6, " Capital");
        System.out.println("builder = " + builder);
        builder.delete(0, 6);
        System.out.println("builder = " + builder);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.reverse();
        System.out.println("stringBuffer = " + stringBuffer);
        System.out.println("====================================");
        String word = "A few good men";
        System.out.println("word.length() = " + word.length());
        String statement = "Outfit of the day";
        System.out.println("statement.substring(3,6) = " + statement.substring(3, 6));
        System.out.println("statement.substring(3,6).toUpperCase() = " + statement.substring(3, 6).toUpperCase());
        char f = statement.substring(3, 6).toUpperCase().charAt(0);
        System.out.println("f = " + f);
        System.out.println("statement.substring(3, 6).toUpperCase().charAt(1) = " + statement.substring(3, 6).toUpperCase().charAt(1));

        double[] data = new double[10];
        System.out.println("data.length = " + data.length);
//        data[9]-->last element of the array
        data = new double[20];
        data[15] = 50;
        System.out.println("data.length = " + data.length);

        int[] numbers = {10, 20, 60};
        String months[] = new String[12];

        int[] num2 = {5, 6, 9};
        int[][] twoDimension = new int[3][4];
        twoDimension[0] = num2;
        twoDimension[1][3] = 50;
        System.out.println("twoDimension[0][1] = " + twoDimension[0][1]);
        System.out.println("Arrays.toString(twoDimension[1]) = " + Arrays.toString(twoDimension[1]));// 0 0 0 50

        int[][] arrayList1 = {
                {5, 6, 9, 7},// index 0           1
                {10, 20, 30, 40},//   index 1      2
                {100, 200, 300, 400}   //  index 2    3
        };
        System.out.println("arrayList1.length = " + arrayList1.length);
        System.out.println("arrayList1[1][0] = " + arrayList1[1][0]);//10
        System.out.println("arrayList1[2][1] = " + arrayList1[2][1]);//200

        int[][] numbers5 = new int[5][];
        int[][] arrayOfArrays = {
                {1, 20},
                {50, 60, 80, 90},
                {100}
        };
    }
}
