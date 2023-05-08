package days.day33;

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        int[] number1= {10,20,30};
        int[] number2= {40,50,60};
        int[] number3= {70,80,90};


        // 10 , 20 , 30
        // 40 , 50 , 60
        // 70 , 80 , 90

        // I need a creation arrays inside array then I can connect them!!

        int[][] matrix = new int[3][3];  // [] first one is for ROW number / inner array number -> this is mandatory!!
                                         // second[] is for columns / each arrays element number !!
        /////////////////

        int[] test0= {10,20,30};
        int[] test1= {40,50,60};
        int[] test2= {70,80,90};
        int[] test3= {91,92,93};


        int[][] allTest = new int[4][3];

//        allTest[0][0]= 10;  // allTest[0][0]  this means: first element of first array of 2d array!!!
//        allTest[0][1]= 20;
//        allTest[0][2]= 30;
//        allTest[1][0]= 40;
//        allTest[1][1]= 50;
//        allTest[1][2]= 60;
//        allTest[2][0]= 70;
//        allTest[2][1]= 80;
//        allTest[2][2]= 90;
//        allTest[3][0]= 91;
//        allTest[3][1]= 92;
//        allTest[3][2]= 93;

        allTest[0]= test0;  // allTest[0] this means: first array of 2d allTest array!!!
        allTest[1]= test1;
        allTest[2]= test2;
        allTest[3]= test3;

        System.out.println("allTest 0: " + Arrays.toString(allTest[0]));
        System.out.println("allTest 1: " + Arrays.toString(allTest[1]));
        System.out.println("allTest 2: " + Arrays.toString(allTest[2]));
        System.out.println("allTest 3: " + Arrays.toString(allTest[3]));

        System.out.println("All test 2d array: "+ Arrays.deepToString(allTest)); // to print all multidimensional arrays!!!

    }
}
