package days.day33;

public class RagedArrays {

    public static void main(String[] args) {

        //0 -- 11 22 33  -> 1. array has 3 element
        //1 -- 44 55     -> 2. array has 2 element
        //2 -- 66        -> 3. array has 1 element

        int[][] numbers = new int[3][]; // this means I declare 2d array which has 3 array, but I didn't initialize these sub arrays!!!
    // because they are not same
        // I have to complete initialization of each array separately

        System.out.println("numbers.length = " + numbers.length);
  //    System.out.println("numbers[0][1] = " + numbers[0][1]); // it will throw NULL pointer exception!!!

        numbers[0] = new int[3];  // I said I have 3 element for the 1. array of arrays!!
        numbers[1] = new int[2];
        numbers[2] = new int[1];

        numbers[0][0] = 11;
        numbers[0][1] = 22;
        numbers[0][2] = 33;
        numbers[1][0] = 44;
        numbers[1][1] = 55;
        numbers[2][0] = 66;
    }
}
