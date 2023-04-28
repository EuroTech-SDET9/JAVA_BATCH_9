package days.day26;

public class String_1 {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String("Hello Java");
        str2 = "Hello Ali";
        String str3 = new String("Hello");
        System.out.println("str = " + str);
        System.out.println("str3 = " + str3);
        System.out.println(str == str3);//false
        String str4 = "Hello";
        System.out.println(str == str4);

        String str10 = new String("Hello");
        System.out.println(str10 == str3);

        String name = "Ali";
        String secondName = "Ali";
        System.out.println(secondName == name);//true point same address
        String surname = new String("Ali");
        System.out.println(name == surname);//false
        String name2=new String("Ali");
        System.out.println(name2 == surname);// false they refer different address in the memory


    }
}
