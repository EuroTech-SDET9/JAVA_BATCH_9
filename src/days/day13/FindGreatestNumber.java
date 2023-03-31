package days.day13;

public class FindGreatestNumber {
    public static void main(String[] args) {
        int a = 100, b = 500, c = 2000;
        // find the greatest one by using if-else if
        if (a > b && a > c) {
            System.out.println("a is the greatest number , value is = " + a);
//        } else if (b > c & b > a) {
        } else if (b > c) {
            System.out.println("b is the greatest number , value = " + b);
        } else {
            System.out.println("c is the greatest number , value =" + c);
        }
        a = 100;
        b = 25;
        c = 15;

        String result = (a > b && a > c) ? "a is the greatest number" :
                (b > c) ? " b is greatest number " :
                        "c is the greatest number";
        String s = (a > b && a > c) ? "a " : ((b > c) ? "b" : "c");
//                   1 condition       true :      3 false
        System.out.println("result = " + result);
        System.out.println("s = " + s);

    }
}
