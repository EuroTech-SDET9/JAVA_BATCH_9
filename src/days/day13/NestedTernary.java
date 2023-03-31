package days.day13;

public class NestedTernary {
    public static void main(String[] args) {
        int number = 9;
        if (number < 10) {
            if (number > 5) {
                System.out.println("number is between 5 & 10");
            } else {
                System.out.println("is between 0-5");
            }
        } else {
            System.out.println("number is greater then 10");
        }
//                                       true
        String result = (number < 10) ? "true" : "false";
        number = 7;
        result = (number < 10) ?
                (number > 5 ? "number is between 5 & 10" : "is between 0-5") :
                "number is greater then 10";
        System.out.println("result = " + result);

    }
}
