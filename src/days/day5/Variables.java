package days.day5;

public class Variables {
    public static void main(String[] args) {
        // primitive data types                                              non primitive data types
        // numeric                                   nonnumeric
        // Integers       Floating                boolean     char
        // byte  1       float 4   double 8
        // short 2
        // int   4
        // long  8

        // data type
        int number;  // declaration
//        System.out.println(number);// if we dont assign any value to primitive variables(local) we cant use it
        //  System.out.println(number); we have to initialize
        number = 100;
        // data type name   =   value
        short s1 = 200;
        System.out.println("s1 = " + s1);

        byte b1 = -128;
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        b1 = 127;
        System.out.println("b1 = " + b1);//127
        b1 = 100;
        System.out.println("b1 = " + b1);//100
        short s2 = 500;
        System.out.println("s2 = " + s2);
        // all the primitive data type's first letter is with lowercase
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        int num = 35000;
        num = 123;
        System.out.println("num = " + num);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        num = 2147483647;
        num = -2147483648;
        System.out.println("num = " + num);
        long longNum = 123456789123l;
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        // float   double
        float f5 = 10.123f;
        System.out.println("f5 = " + f5);
        double d5 = 123.56789;
        System.out.println("d5 = " + d5);
        f5 = 15.1234567890f;
        System.out.println("f5 = " + f5);
        d5 = 15.1234567890123456789;
        System.out.println("d5 = " + d5);



    }


}
