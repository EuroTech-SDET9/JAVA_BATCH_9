package days.day26;

public class StringMethods_2 {
    public static void main(String[] args) {
        String str = "Hello World!";
        //            012345678901
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));
        String nameSurname = "Ali Veli";
        //                  01234567
        System.out.println(nameSurname.substring(0, 3));// 0 1 2   until index 3, will not include index 3
        System.out.println(nameSurname.substring(4));
        str = "Hello world, life is beautiful";// print last 9 character use substring method

//        str = "Hello World!!!!";
//        //     012345678901234
        System.out.println(str.length());//15
        System.out.println(str.substring(14));
        System.out.println(str.substring(str.length() - 9));
        System.out.println(str.substring(0, 5));//0 1 2 3 4  the first 5 letter


        //CONCAT
        str = "Hello";
        nameSurname = "Ali";
        System.out.println(str + nameSurname);
        System.out.println(str.concat(nameSurname));//HelloAli
        System.out.println(str);//Hello
        System.out.println(nameSurname.concat(str));//AliHello
        String name2 = "Veli Messi";
        //              01234
        System.out.println(str.concat(nameSurname).concat(name2));//HelloAliVeli
        System.out.println(str.concat(nameSurname).concat(name2.substring(0, 4)));//HelloALiVeli
        //INDEX OF
        str = "Hello Ali Hello";
        //     01234567890
        System.out.println(str.indexOf("Ali"));
        System.out.println(str.indexOf("Veli"));
        System.out.println(str.indexOf("Hello"));//0
        System.out.println(str.indexOf("Hello", 5));// 10
        System.out.println(str.indexOf(65));//6
        System.out.println(str.indexOf('A'));//6


        for (char c = 'A'; c <= 'Z'; c++) {// print capital letters in the alphabet
            System.out.println(c);
        }
        char c = 'A';
        for (int i = 'A'; i <= 'z'; i++) {
            System.out.print(c);
            System.out.println(" = " + i);
            c++;
        }
//A = 65 B = 66

        //LASTINDEXOF

        str = "Hello Ali Hello Veli Hello Messi";
        //     0123456789012345678901
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.lastIndexOf("Hello"));
        int firstHello = str.indexOf("Hello");
        System.out.println(str.indexOf("Hello", firstHello+1));


    }
}
