package days.day13;

public class Greeting {
    public static void main(String[] args) {

        // hours 0-24 precondition
        // if the hour is between 6-12 ---> good morning
        //         hour is between 12 - 18 ---> good afternoon
        //         hour is between 18 - 24----> good evening
        //                     good night
        // dont print anything
        // inside if-else if block assign value to greeting
        //at the end print greeting
        int hour = 9;
        String greeting = "";
        if (hour >= 0 && hour < 24) {
            if (hour > 18) {
                greeting = "Good evening";
//            } else if (hour > 12 && hour < 18) {// if the first condition is false then hour is already less then 18
            } else if (hour > 12) {
                greeting = "Good afternoon";
//            } else if (hour > 6 && hour < 12) { if the second condition is false then hour is less the 12
            } else if (hour > 6) {
                greeting = "Good morning";
            } else {
                greeting = "Good night!!!";
            }
        } else {
            System.out.println("Check the hour again!!!!!");
        }
        System.out.println("greeting = " + greeting);


    }
}
