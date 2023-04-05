package days.day16;

public class NestedForLoops {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {

            System.out.println(i);
        }
        System.out.println("=================");
        int number = 0;
        for (int i = 0; i < 5; i++) {// 5 times   outer loop
            System.out.println("Hello!!!!");
            number++;// 1 2 3 4 5
            System.out.println("number is " + number);
            for (int n = 0; n < 2; n++) {// n is 0 n is 1    inner loop
                System.out.println("*");
            }
        }
        System.out.println("number = " + number);
// Hello!!!!
// number is 1
//  *
//  *
//Hello!!!!
// number is 2
// *
// *
        int firstValue = 0;
        int lastValue = 3;
//        for (int i = 0; i < 3; i++) {
        for (int i = firstValue; i < lastValue; i++) {
            System.out.println("Hello again!!!");
        }
        for (int i = 1; i <= 7; i++) {// outer loop specify the row counts
            System.out.print(i + ". row --> ");
            for (int n = 1; n <= 10; n++) {// inner loop specify the column counts
                System.out.print(n + " ");
            }
//            if (row is 4){
            if (i == 4) {
                System.out.print(" there are 10 columns");
            }
            System.out.println();// 1. row
            //  2. row
        }
        // on row 4 after 10 there are 10 column

        // *
        // **
        // ***
        // ****
        // *****
        // ******

        // there are 6 rows
        // there are 6 columns
        for (int i = 0; i < 6; i++) {// rows counts

            for (int n = 0; n <= i; n++) {//columns counts
//            for (int n = 0; 0 <= 1; n++) {//columns counts
                System.out.print("*");
            }
            System.out.println();

        }
        //*****   first iteration of the outer loop ,inner loop iteration is 5
        //****   second iteration of the outer loop , inner loop iteration is 4
        //***   third iteration of the outer loop , inner loop iteration is 3
        //**
       // *

    }
}
