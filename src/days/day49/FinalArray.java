package days.day49;

import java.util.Arrays;

public class FinalArray {

    public static void main(String[] args) {

        int[] array = {5,4,3,2,1};
        int[] array2 = {15,14,13,12,11,10,9};

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        array = array2;

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        System.out.println("\n//////////////////////\n");

        // elements of final array can be changed without any problem !!!:
        final int [] finalArray = {100,90,80,70,60};
        System.out.println("Arrays.toString(finalArray) = " + Arrays.toString(finalArray));

        // try to change 2. element of finalArray, 90 to -> 900
        finalArray[1] = 900 ;
        System.out.println("Arrays.toString(finalArray) = " + Arrays.toString(finalArray));

      //  finalArray = array2; // When we declare an object variable as final it means that the
                               //variable can not be changed to refer to anything else




    }
}
