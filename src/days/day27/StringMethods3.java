package days.day27;

public class StringMethods3 {
    public static void main(String[] args) {
        //TRIM
        String name = "   David    ";
        System.out.println("name = " + name + "Hello");
        System.out.println("name = " + name.trim() + "Hello");
        name = "   David    ..";
        System.out.println("name = " + name + "Hello");
        System.out.println("name = " + name.trim() + "Hello");
        //REPLACE REPLACEFIRST REPLACE ALL

        name = "Hello David";
        System.out.println(name.replace("David", "Michael"));
        System.out.println("name = " + name);
        String afterChanges = name.replace("Hello", "Hi");
        System.out.println(afterChanges);//Hi david

        name = " b Hello David Hello b";
        System.out.println(name.replace("Hello", "Hi"));
        System.out.println("name = " + name);//Hello David Hello
        System.out.println(name.replaceFirst("Hello", "Hi"));
        System.out.println(name.replaceAll("Hello", "Hi"));
        System.out.println(name.replace('b', 'a'));//you can send char as argument for replace method
//        name.replaceAll('b','a') you cant send char as argument for replaceall method

        System.out.println(name.replace("david", "Michael"));//b Hello David Hello b
        System.out.println(name.toLowerCase().replace("david", "Michael"));//b Hello Michael Hello b
        System.out.println(name.toUpperCase().substring(3, 9));
        name = "Hello Ronaldo";
        System.out.println(name.length());
        System.out.println(name.toUpperCase().replace("Hello", "Hi").substring(0, 5));

        name = "Bob";
        System.out.println("Hello ".concat(name));
        System.out.println("Hello ".concat(name) + "!");
        System.out.println("Hello ".concat(name).concat("!"));

        String a = "Hi";
        String b = "Bye";
        //abba
        System.out.println(a.concat(b).concat(b).concat(a));


        String out = "<<>>";
        //          0123
        String word = "WooHoo";
        //<<WooHoo>>
//    << .concat (word) .concat (>>)
        String concat = out.substring(0, 2).concat(word).concat(out.substring(2));
        System.out.println(concat);
        //CONTAINS
        name = "Ronaldo Messi";
        System.out.println(name.contains("Ali"));
        System.out.println(name.contains("Messi"));
        System.out.println(name.contains("Ro"));

        //STARTSWITH
        System.out.println(name.startsWith("do"));
        System.out.println(name.startsWith("Ro"));
        System.out.println(name.startsWith("Ronald"));
        System.out.println(name.startsWith("Ronaldo"));
//        System.out.println(name.startsWith('R'));char is not accepted
        System.out.println(name.startsWith("R"));
        //ENDSWITH
        name = "Ronaldo Messi";
        System.out.println(name.endsWith("Messi"));
//        System.out.println( name.endsWith('i')); char is not accepted
        System.out.println(name.endsWith("i"));
        //ISEMPTY
        System.out.println(name.isEmpty());
        StringFormat format = new StringFormat();
    }
}
