package days.day12;

public class SwitchCaseSyntax {


    public void test() {
        System.out.println("HE YOOOOOOOOOOOOOO");
    }

    public static void main(String[] args) {


        // Red - STOP   , Green - Pass , Yellow - Be Ready
        String trafficLights = "Red";
        if (trafficLights == "Red") {
            System.out.println("STOP");
        } else if (trafficLights == "Green") {
            System.out.println("Pass");
        } else if (trafficLights == "Yellow") {
            System.out.println("Be Ready");
        } else {
            System.out.println("INVALID COLOUR!!!!");
        }

        trafficLights = "orange";

//        System.out.println(trafficLights.toLowerCase());
//        System.out.println("trafficLights = " + trafficLights);

        switch (trafficLights)  // trafficLights.toLowerCase() you can use this to handle case sensitivity
        {

            default:
                System.out.println("INVALID INPUT!!!!");
                break;
            case "red":
                System.out.println("STOP");
                break;
            case "green":
                System.out.println("Pass");
                break;
            case "yellow":
                System.out.println("Be Ready");
                break;
//            default:
//                System.out.println("INVALID INPUT!!!!");
////                break;

        }
        System.out.println("OUT OF SWITCH CASE");


        int checkPoint = 400000;

        switch (checkPoint) {
            case -1000:
                System.out.println(1);
            case 20:
                System.out.println(2);
            case 30000:
                System.out.println(3);
            case 40:
                System.out.println(4);
            case 5000:
                System.out.println(5);
            case 60:
                System.out.println(6);
            case 7000:
                System.out.println(7);
        }

        System.out.println("\n////////////////////////////\n");


        char key = 'V';

        switch (checkPoint) {
            case 'A':
                System.out.println(65);
            case 20:
                System.out.println(20);
            case 'B':
                System.out.println(66);
            case 40:
                System.out.println(40);
            case 'C':
                System.out.println(67);
            case 60:
                System.out.println(60);
            case 'V':
                System.out.println(70);
        }

//        double value = 22.4;   use only char byte short int String
//
//        switch (value) {
//            case 1.2:
//                System.out.println(1);
//
//        }


        switch (checkPoint) {
            case 1:
                System.out.println(1);
//            case 1: dont use duplicated value!!!!
//                System.out.println(1);
        }


        int test1 = 10;
        final int b1 = 15;
        int b2 = 16;
        switch (test1) {
            case 10:    // case b1 :  !!! NO only use literal or constant values!!
                System.out.println(1);
            case Integer.MAX_VALUE:
                System.out.println("MAX");
            case b1:
                System.out.println("constant variable");
//            case b2:
//                System.out.println("variable ");
        }


        System.out.println("\n////////////////////////////\n");


        int eligibility = 5;

        switch (eligibility) {

            case 5:
            case 4:
            case 3:
                System.out.println("Eligible ");
                break;
            case 2:
            case 1:
                System.out.println("NOT Eligible!");
                break;
            default:
                System.out.println("INVALID SCORE!");
                break;
        }


    }

}
