package days.day27;

public class StringMethods_1 {
    public static void main(String[] args) {
        String str = "Hello";
        //            01234  index number
        String name = new String("Ali");
        System.out.println("Ali".length());
        System.out.println(new String("Veli").length());
        System.out.println(str.length());//5
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(str.length())); error .StringIndexOutOfBoundsException
        System.out.println(str.charAt(4));//
        str = "Hello World";
        //     01234567890
        System.out.println(str.substring(6, 9));
        System.out.println(str.substring(6));
        System.out.println(str.indexOf("ali"));
        System.out.println(str.indexOf("World"));

        str = "Hello";//reverse the string olleH
        //     01234
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {

            reversed = str.charAt(i) + reversed;// olleH

        }
        System.out.println("reversed = " + reversed);//olleH
        str = reversed;
        for (int i = 4; i >= 0; i--) {
            System.out.println(str.charAt(i));
            reversed = reversed + str.charAt(i);

        }
        System.out.println(reversed);//Hello
    }
}
