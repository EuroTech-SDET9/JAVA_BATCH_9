package days.day18;

import java.util.Random;

public class BreakTableSample {


    public static void main(String[] args) {

//        https://demo.aspnetawesome.com/GridDemo

        for (int x = 1; x <= 75; x++) {
            System.out.println(" Click page " + x);

            for (int y = 1; y <= 10; y++) {
                System.out.println(" Check" + x + ". line: ");
                String getName = "RandomName"; // this value should come by selenium method dynamically
                if (getName.equals("Samir")) {// .equals like ==
                    System.out.println("Get the Samir's data and done verification for test!");
                    break;
                }
            }
        }


        System.out.println(" \n////////////////////\n ");


        OUTER_LOOP:
        for (int x = 1; x <= 75; x++) {
            System.out.println(" Click page " + x);

  INNER_LOOP: for (int y = 1; y <= 10; y++) {
                System.out.println(" Check" + x + ". line: ");
                String getName = "RandomName"; // this value should come by selenium method dynamically
                if (getName.equals("Samir")) {// .equals like ==
                    System.out.println("Get the Samir's data and done verification for test!");
                    break OUTER_LOOP;
                }
            }
        }




    }
}
