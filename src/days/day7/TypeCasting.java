package days.day7;

public class TypeCasting {

    public static void main(String[] args) {

        System.out.println("\n////////IMPLICIT CASTING/////////\n");
        // IMPLICIT CASTING - Widening - done automatically by compiler
        int number =5;
        double rate = number;
        System.out.println("rate = " + rate);
        System.out.println("number = " + number);


        System.out.println("\n////////EXPLICIT CASTING/////////\n");
        // EXPLICIT CASTING - Narrowing - manually do it!

        double value = 10;
        int index = (int)value; //10.0 --> 10

        System.out.println("index = " + index);

        value = 11.999;
        index = (byte)value; // after exp casting , thanks to imp casting we can assign byte to int!!
        index = (int)value;
//        index = (long)value;
        System.out.println("index = " + index);  // Exp casting / we lost the data!!!

    }
}
