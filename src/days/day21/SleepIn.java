package days.day21;

public class SleepIn {

//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//
//    sleepIn(false, false) → true
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true

    public static boolean sleepIn(boolean weekday, boolean vacation) {// monday tuesday to friday
        // they are sleeping weekend and vacation time
        //return true if they re sleeping
//        if(weekday!=true||vacation==true)
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));// ---> weekday is false
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true

    }


}
