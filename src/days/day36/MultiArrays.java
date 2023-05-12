package days.day36;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int myGrade = 70;// only 1
        int[] firstGroupGrades = {95, 85, 99, 100, 80, myGrade};
        int[] secondGroupGrades = {100, 75, 80, 89, 92, 98};
        int[] thirdGbroupGrades = {75, 80, 99, 91, 100, 95};

//        firstGroupGrades        95  85  99  100  80  70      index  0
//        secondGgroupGrades     100  75  80   89  92  98      index  1
//        thirdGroupGrades        75  80  99   91 100  95      index  2
        int row = 3;
        int column = 6;
        int[][] classGrades = new int[row][column];

        classGrades[0][0] = 95;
        classGrades[0][1] = 85;
        classGrades[0][2] = 99;
        classGrades[0][3] = 100;
        classGrades[0][4] = 80;
        classGrades[0][5] = 70;
        System.out.println(Arrays.toString(classGrades[0]));//will print first array, first row
        classGrades[1][0] = 100;//second array-row first element
        classGrades[1][1] = 75;
        classGrades[1][2] = 80;
        classGrades[1][3] = 89;
        classGrades[1][4] = 92;
        classGrades[1][5] = 98;
        System.out.println(Arrays.toString(classGrades[1]));
        classGrades[2][0] = 75;
        classGrades[2][1] = 80;
        classGrades[2][2] = 99;
        classGrades[2][3] = 91;
        classGrades[2][4] = 100;
        classGrades[2][5] = 95;
        System.out.println(Arrays.toString(classGrades[2]));
        System.out.println(Arrays.deepToString(classGrades));
        System.out.println(classGrades[2][3]);//row 3 4.th element
        System.out.println(classGrades[1][0]);
//        int[] firstGroupGrades = {95, 85, 99, 100, 80, myGrade};
        int[][] classResults = {
                {100, 95, 85, 75},//index 0
                {85, 80, 99, 100, 89, 75},// index 1
                {100, 90, 85}// index 2
        };
        System.out.println(classResults[0].length);//first row length
        System.out.println("classResults[1].length = " + classResults[1].length);
        System.out.println("classResults[2].length = " + classResults[2].length);
        System.out.println("classResults[1][5] = " + classResults[1][5]);
        System.out.println("classResults[0][3] = " + classResults[0][3]);
        System.out.println(classResults[0][classResults[0].length - 1]);
        System.out.println(classResults[0][classResults.length - 1]);
        System.out.println( classResults.length - 1);

    }
}
