package days.day11;

public class Grade {
    public static void main(String[] args) {
        int mark = 50;
        // 50----> fails
        // 50-70 --> good
        // 70-85 --> very good
        // 85-100---> perfect
        if (mark <= 100 && mark > 85) {
            System.out.println("perfect result");
        } else if (mark <= 85 && mark > 70) {
            System.out.println("very good result");
        } else if (mark <= 70 && mark >= 50) {
            System.out.println("good result");
        } else if (mark < 50) {
            System.out.println("you failed");
        } else {
            System.out.println("enter a valid mark!!");
        }


    }
}
