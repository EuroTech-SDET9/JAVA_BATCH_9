package days.day15;

public class Mark {
    public static void main(String[] args) {
//Write a program that checks if a student passed the exam or not by using ternary operator:
        //Sample1: Your mark is 80 and you passed
        //Sample2: Your mark is 45 and you failed. You needed 5 more points to pass the exam
        int mark = 75;
        String result = "";
        if (mark > 50) {
            result = "Congratulations, success!!!!";
        } else {
            //      you need 15 more points for success!!!
            result = "you need " + (50 - mark) + " more points for success!!!";
        }
        System.out.println("result = " + result);
        mark = 20;
        result = (mark > 50) ? "Congratulations, success!!!!" : "you need " + (50 - mark) + " more points";
        System.out.println("result  2 = " + result);
        // a b c   (a+b)>c

    }
}
