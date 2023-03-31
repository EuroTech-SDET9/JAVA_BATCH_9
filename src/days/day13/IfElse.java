package days.day13;

public class IfElse {
    public static void main(String[] args) {

        // precondition 0-100
        // 85 perfect
        // 70-85 very good
        // 55-70 good
        // 55 fail
        int mark = 60;
        char grade = 'A';
        // if mark is between 0-100 then run this if else if statement
        if (mark >= 0 && mark <= 100) {// mark must be between 0-100
//        if (mark > 85 && mark <= 100) {
            if (mark >= 85) {
                grade = 'A';
//                System.out.println("perfect result");
//        } else if (mark < 85 && mark >= 70) {
            } else if (mark >= 70) {
                grade = 'B';
//                System.out.println("very good");
//        } else if (mark >= 55 && mark < 70) {
            } else if (mark >= 55) {
                grade = 'C';
//                System.out.println(" good");
//        } else if (mark < 55) {
            } else {
                grade = 'E';
//                System.out.println("fails");
            }
        } else {
            System.out.println("the mark is wrong!!! please check the mark!!!!!");
            grade = '0';// mark is out the range
        }
        String result = "";

        //switch     check grade if the grade equals A   result="Perfect
        //                       if the grade equals B   result="Very Good"
        //                       if the grade equals C   result =" Good"
        //                       else result "Sorry You failed"

        // print result
        switch (grade) {
            case 'A':
                result = "Perfect";
                break;
            case 'B':
                result = "Very Good";
                break;
            case 'C':
                result = "Good";
                break;
            default:
                result = "Sorry you failed!!! Try again.";
        }

        System.out.println("result = " + result);
    }
}
