package days.day10;

public class If1 {
    public static void main(String[] args) {

        if (10 > 50) {
            System.out.println("10 is greater than 50");
        }

        System.out.println("after if");
        //      boolean
        // if ( condition)
//         if(10=10){ assignment operator not possible to execute , will get error
//          System.out.println("ten equals to 10);
//    }

        int a = 20;
        int b = 30;

        if (a == b) {// false
            System.out.println("a and b aquals eachother");// will not execute this statement
        }
        System.out.println("after second if");
        b = 20;
        if (a == b) {// true
            System.out.println("a and b aquals eachother");
        }
        int time = 10;
        // if time is less then 12 print good morning

        if (time < 12) {
            System.out.println("good morning");
        }
        // time is greater then 12 and less then 18 say good afternoon
        String greeting = "Good afternoon";
        time = 15;
        //   true            true
        if (time > 12 && time < 18) {
            System.out.println(greeting);
        }
        time = 20;
        // if time less or equals 24 print hello
        greeting = "Hello";
        if (time <= 24) {
            System.out.println(greeting);
        }
        // ctrl + alt + l
    }
}
