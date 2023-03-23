package days.day8;

public class RelationalOpt {

    public static void main(String[] args) {

        int actualValue = 10;
        int expectedValue = 10;
        boolean isEqualTo = actualValue == expectedValue;
        System.out.println("isEqualTo = " + isEqualTo);

        System.out.println(11==11);

        boolean isNotEqualTo = actualValue != expectedValue;
        System.out.println("isNotEqualTo = " + isNotEqualTo); //false
        actualValue = 11;
        System.out.println("isNotEqualTo = " + isNotEqualTo); //false

        isNotEqualTo = actualValue != expectedValue;
        System.out.println("isNotEqualTo = " + isNotEqualTo); //true

        System.out.println("//////////////////////////\n");

        boolean greaterThan = actualValue > expectedValue;   //  11 > 10
        System.out.println("greaterThan = " + greaterThan); //true

        System.out.println("//////////////////////////\n");

        boolean lessThan = actualValue < expectedValue;   //  11 < 10
        System.out.println("lessThan = " + lessThan);  //false

        System.out.println("//////////////////////////\n");

        boolean greaterEqual = actualValue <= expectedValue;
        System.out.println("greaterEqual = " + greaterEqual); // true
    }
}
