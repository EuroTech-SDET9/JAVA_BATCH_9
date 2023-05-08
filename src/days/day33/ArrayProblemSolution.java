package days.day33;

import java.util.Arrays;

public class ArrayProblemSolution {

    public static void main(String[] args) {

        // TASK FOR MONDAY!!!

        // I gave an array which in the range 1 to n  (in sample 1 to 8 and missing number is 6 , duplicated one is 2)
        // There are some duplicate number and missing number!!#
        //  Create a method and find/print me duplicated and missing numbers!!

        // sample input: int[] testValues=  {7,4,5,3,1,2,2,8};
        // sample output: Missing number= 6, Duplicated number = 2

        // sample input: int[] testValues=  {4,4,3,1,2,6};
        // sample output: Missing number= 5, Duplicated number = 4

        // as u see that size of array will equal to max number!! if not, missing one is max+1

//        int[]sample= {1,2,3,5,6,6,7};
//        int[]sample= {1,2,3,5,6,6,6,6,7};
//        int[]sample= {2,3,5,4,6,6,6,7};
//        int[]sample= {1,2,3,5,4,6,6,6};
//        int[]sample= {1,1,1,1,2,3,5,4,6,6,6};
        int[]sample= {1,2,3,3,4,5,6,8};


        checkArrayMissingAndDuplicateElement(sample,8);
    }

    public static void checkArrayMissingAndDuplicateElement(int[] input, int n) {

        Arrays.sort(input);
        int range = input.length> n? input.length-1 : n-1;
        for (int i = 0; i < range; i++) { // -1 because we will check 2 number in each loop. and the last one will not check a lone !!
            if (input[i] == input[i + 1]) {
                System.out.println("Duplicated number is " + input[i]);
//                break;
            }
        }
        ////////////////////
        for (int i = 1; i <= n; i++) { // TODO for duplicated one we need to handle them !!!!
//            System.out.println("i = " + i); // my expected array values!!!
            if (i != input[i - 1]) {
                System.out.println("Missing number is " + i);
                break;
            }
        }
    }



}
