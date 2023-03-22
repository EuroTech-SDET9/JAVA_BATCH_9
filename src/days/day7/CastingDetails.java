package days.day7;

public class CastingDetails {


    public static void main(String[] args) {


        char character = 'A';
        character = 65;

        System.out.println("character = " + character);

        character = 'ö';
        System.out.println("character = " + character);
        int decValue = character;
        System.out.println(decValue);

        ///////////////////////////////////////////////

        byte testByte = 127;
        // testByte = 128;
        testByte = (byte) 129;
        System.out.println("testByte = " + testByte); // !!!!

        short testShort = 32767;
        // testShort= 32768;

        int intValue = 1;
        testByte = (byte) intValue;


        ////////////////////////////////////////////

        byte num1 = 1;
        byte num2 = 12;
        byte num3 = 13;
        System.out.println("num3 = " + num3);
//        num3 = num1 + num2;
//        num3 = (byte)num1 + (byte)num2;
        num3 = (byte) (num1 + num2);
        System.out.println("num3 = " + num3);
//Ctrl + alt + L  --reformat the code!!!

        int testInt =2;
        num3 = (byte)(num1 + num2 + testInt);


        ///////////////////////////////////

        long l1 = 11;
        long l2 = 12;
        long l3 = l1 + l2 ;
        int i1= 14;
        l3 = l1 + i1;
        float f1 = 10.5f;

//        l3 = f1 + l1;
        l3 = (long)(f1 + l1);
        l3 = (long)f1 + l1;

        double d1 = 11.22;
        l3 =10;
        double d2 = d1 + l3; // 11.22 + 10.0
        l1 = (long)d1 + l3;
        System.out.println("\n///////////Mix Samples///////////////\n");
        System.out.println(1/2);     // int / int = int !!  0.5 -> 0
        System.out.println(1/2.0);   // int / double = double !!  0.5 -> 0.5
        System.out.println(1.0/2.0); // int / double = double !!  0.5 -> 0.5

        System.out.println(3/2*2.0); // int/int = int (1) * double (2.0)  = double (2.0)

        System.out.println(10 - 5 / 2 + (3/2) * 3);

    }
}
