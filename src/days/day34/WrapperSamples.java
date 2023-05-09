package days.day34;

public class WrapperSamples {

    public static void main(String[] args) {

        int test=1;


//        specialMethod(test);

//        Integer objInt = new Integer(1);
//        Integer objInt2 = new Integer("1");

//        System.out.println("objInt = " + objInt);
//        System.out.println("objInt2 = " + objInt2);
//
//        System.out.println(objInt + objInt2);

//        Integer objInt3 = new Integer("1.5"); // throw NumberFormatException !!
//        Integer objInt4 = new Integer(1.5);  // throw compilation error


        Integer number1 = 2;  //Integer.valueOf(2)
        Integer number2 = Integer.valueOf("2");

        //

        Short objShort = 100;
        Short objShort2 = Short.valueOf((short)100);
        Short objShort3 = Short.valueOf("100");

        Boolean objBoolean = Boolean.valueOf("true");

        System.out.println("objBoolean = " + objBoolean);

        //
        String result="926";
        int actualData = 926;
//        System.out.println("Check : " + (result == actualData));
        Integer expectedData = Integer.valueOf(result);

        System.out.println("expectedData = " + expectedData);

        System.out.println("Check : " + (expectedData == actualData));

        ///////////////////////////

        Character charObj = Character.valueOf('A');


        ///

        double rate = 1.5;
        Double rateObj = Double.valueOf(rate);

        /////////////

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);


    }


    public static void specialMethod(Integer obj){
        //
    }
}
