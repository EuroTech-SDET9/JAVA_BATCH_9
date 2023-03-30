package days.day11;

public class ElseIf2 {
    public static void main(String[] args) {

        int time = 22;
        // 6-12 ----> good morning
        // 12 - 17 --> good afternoon
        // 17 - 22 --> good evening
        // else good night
        String greeting ;
        if (time >= 6 && time <= 12) {
            greeting = "Good morning";
//            System.out.println("Good morning.");
        } else if (time > 12 && time <= 17) {
            greeting = "Good afternoon";
//            System.out.println("Good afternoon");
        } else if (time > 17 && time <= 22) {
            greeting = "Good evening";
         //   System.out.println("Good evening.");
        } else {
            greeting = "Good night";
         //   System.out.println("Good night");
        }
        System.out.println(greeting);

    }
}
