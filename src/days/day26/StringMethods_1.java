package days.day26;

public class StringMethods_1 {
    public static void main(String[] args) {
        String name = "Ronaldo";
        //             0123456

        System.out.println(name.length());//7
        int lengthOfName = name.length();
        System.out.println("lengthOfName = " + lengthOfName);//7
        name = " Ali  Veli";
        //    0123456789
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(19));String index out of range: 19
        name = "Hello World!!";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println(name.charAt(0));//first character of the string
        name = "Veli";
        //      0123
        //print last character of the string
        System.out.println(name.length());
        System.out.println(name.charAt(name.length() - 1));
        int lastIndex = name.length() - 1;
        System.out.println("name.charAt(lastIndex) = " + name.charAt(lastIndex));
        System.out.println(lastChar("Seyfettin"));
        System.out.println(lastChar("Mihail"));
        System.out.println(lastChar("Aziz"));
    }

    public static char lastChar(String surname) {
        char lastCharacter = surname.charAt(surname.length() - 1);

        return lastCharacter;
//        return surname.charAt(surname.length() - 1);
    }
    //create a method and return last character of the string
    // lastChar(String name) signature of the method
}
