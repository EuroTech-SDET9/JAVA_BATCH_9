package days.day28;

public class StringsMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        //            01234567890
        //print first half of the string
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));
        System.out.println("str.length() = " + str.length());
        int i = str.length() / 2;
        System.out.println("i = " + i);
        System.out.println("str.substring(0,i) = " + str.substring(0, i));

        // first letter is A or not
        System.out.println(str.charAt(0) == 'A');
        System.out.println(str.startsWith("A"));
        // last letter equals 'd' or not
        System.out.println(str.endsWith("d"));
        char c = 'd';
        System.out.println(str.endsWith("" + c));
        System.out.println(str.charAt(str.length() - 1) == c);
        str = "hello manchester city hello";
        //     012345678901234567890123456
        // whether there is "city" in this string
        System.out.println(str.contains("city"));
        // if there is city in the string find the index number
        if (str.contains("city")) {
            System.out.println(str.indexOf("city"));
        } else {
            System.out.println("city is not in the string");
        }
        // print last 5 letters
        System.out.println("str.length() = " + str.length());
        System.out.println(str.substring(str.length() - 5));
        System.out.println(str.substring(22));
        // check first 5 letters is same with last 5 letters
        System.out.println(str.substring(0, 5).equals(str.substring(str.length() - 5)));
        //  System.out.println(str.substring(0, 5) == (str.substring(str.length() - 5))); dont use == sign to compare strings
        str = "Bye Bye City Bye";
        // print 3 times the first 3 letters
        System.out.println(str.substring(0, 3).repeat(3));
        str = "yB yB city B B by By";
        //
        // how many times we used "by" in this string
        // how many times we used "B" in this string
        String search = "B";
        int count = 0;
        for (int n = 0; n < str.length(); n++) {
            System.out.println(str.charAt(n));
            if (str.charAt(n) == 'B') {
                count++;
            }
        }
        System.out.println("count = " + count);

        str = "hiBy By cByy By wByriteBy";
//        str="Hello city Hello city city"
        count = 0;
        for (int n = 0; n < str.length()-1; n++) {
            System.out.println(str.charAt(n));
            if (str.substring(n, n + 2).equals("By")) {
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
