package days.day33;

import java.util.Arrays;

public class TwoDarraySample {

    public static void main(String[] args) {

        int[][] matrix = new int[2][3];

        for(int x=0; x<matrix.length; x++){  // outer loop for each ARRAY of matrix arrays
            for(int y=0; y<matrix[x].length;y++){ // inner loop for assign e value for each element of array of arrays..
                matrix[x][y] = x+y;
            }
        }

        System.out.println("Arrays.deepToString(matrix) = " + Arrays.deepToString(matrix));
    }
}
