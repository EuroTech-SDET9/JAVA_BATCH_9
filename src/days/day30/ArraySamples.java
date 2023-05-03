package days.day30;

import java.util.Arrays;
import java.util.Random;

public class ArraySamples {


    public static void main(String[] args) {

        int serialNum1 = 10;
        int serialNum2 = 11;
        int serialNum3 = 12;

        //    int[] serialNums; //int serialNums[] also valid syntax!!
        //     serialNums = new int[3];

        //  int[] serialNums = new int[3];

        //1.way to initialize-Add values

        int[] serialNums = {10, 11, 12}; //  [ X | X  | X ]

        System.out.println("serialNums[0] = " + serialNums[0]); // get me a 0 index value =10
        System.out.println("serialNums[1] = " + serialNums[1]); // get me a 1 index value =11
        System.out.println("serialNums[2] = " + serialNums[2]); // get me a 2 index value =12

//        System.out.println("serialNums[3] = " + serialNums[3]); // get me a 3 index value = ArrayIndexOutOfBoundsException!!!

        System.out.println(" \n/////////////////////////////////////////////\n ");
        // 2. Way to initialize-Add values

        String[] daysOfTheWeek = new String[7];

        daysOfTheWeek[0] = "Monday";
        daysOfTheWeek[1] = "Tuesday";
        daysOfTheWeek[2] = "Wednesday";
        daysOfTheWeek[3] = "Thursday";
        daysOfTheWeek[4] = "Friday";
        daysOfTheWeek[5] = "Saturday";
        //     daysOfTheWeek[6]="Sunday";

        System.out.println("daysOfTheWeek = " + daysOfTheWeek); // u can see some hashcode!!

        System.out.println("daysOfTheWeek[6] = " + daysOfTheWeek[6]); // default value of string: null
        System.out.println("daysOfTheWeek[0] = " + daysOfTheWeek[0]); // monday!!

        System.out.println(" \n/////////////////////////////////////////////\n ");

        int[] test = new int[3]; // this 3 means size of array, there are 3 values/slot in this container!!

        System.out.println("test[0] = " + test[0]); // this will return default value of int -> 0
//        System.out.println("test[10] = " + test[10]); // this will throw ArrayIndexOutOfBoundsException!!!
//        System.out.println("test[3] = " + test[3]); // this will throw ArrayIndexOutOfBoundsException!!!


        System.out.println(" \n/////////////////////////////////////////////\n ");

        String[] cars = {"Honda", "BMW", "KIA"}; // element number = size = length of the array = 3
        // index    0  , 1 ,  2


        System.out.println("cars[2] = " + cars[2]); // KIA

        cars[2] = "Toyota"; // I changed 2.index element value!
        cars[2] = "Mercedes"; // I changed 2.index element value!
        cars[2] = "OPEL"; // I changed 2.index element value!

        System.out.println("cars[2] = " + cars[2]); // OPEL!!!


        System.out.println(" \n/////////////////////////////////////////////\n ");

        int[] sizeTest = {1, 2, 3, 7, 8, 6, 5, 4, 3, 4, 4, 3, 2, 1, 4, 5, 6, 7, 8, 6, 3, 4, 4, 4, 5, 6, 7, 8, 9, 0, 5, 5, 5, 53, 2, 1};
        System.out.println("sizeTest.length = " + sizeTest.length); // 36 element there // 35 is max index!!

        String[] values = {"sss", "", "", "", "ssss", "dddd", "gggg", "dsdsds", "dadsa"};
        System.out.println("values.length = " + values.length); // size of this array is 9

        System.out.println(" \n/////////////////////////////////////////////\n ");

//        System.out.println("sizeTest[0] = " + sizeTest[0]);
//        System.out.println("sizeTest[1] = " + sizeTest[1]);
//        System.out.println("sizeTest[2] = " + sizeTest[2]);
//        System.out.println("sizeTest[3] = " + sizeTest[3]);
//        System.out.println("sizeTest[4] = " + sizeTest[4]);
//        ...........

//        itar
        for (int i = 0; i < sizeTest.length; i++) { // 36 loop   - 0 ,...35..
            System.out.println("sizeTest[" + i + "] = " + sizeTest[i]);
        }

        System.out.println(" \n/////////////////////////////////////////////\n ");
        // create an array to keep 10 element of integer.
        // Declare array and assign them random numbers between 0 and 30!! (inc) try to use loop for initialize the values!!

        int[] randomNums = new int[10];
        Random random = new Random();

        // long way!!
//        randomNums[0] = random.nextInt(31);
//        randomNums[1] = random.nextInt(31);
//        randomNums[2] = random.nextInt(31);
//        randomNums[3] = random.nextInt(31);
//        randomNums[4] = random.nextInt(31);
//        randomNums[5] = random.nextInt(31);
//        randomNums[6] = random.nextInt(31);
//        randomNums[7] = random.nextInt(31);
//        randomNums[8] = random.nextInt(31);
//        randomNums[9] = random.nextInt(31);

        // short way
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = random.nextInt(31);
            System.out.println("randomNums[" + i + "] = " + randomNums[i]);
        }

        System.out.println(" \n/////////////////////////////////////////////\n ");

        int[] printTest = {33, 22, 44, 7, 66, 55, 44, 4, 3, 4, 4, 3, 2, 1, 4, 5, 6, 7, 8, 6, 3, 4, 4, 4, 5, 6, 7, 8, 9, 0, 5, 5, 5, 53, 2, 1};

        for (int i = 0; i < printTest.length; i++) {
            System.out.println("printTest["+i+"] = " + printTest[i]);
        }

        // to see output like that :{33, 22, 44, 7, 66, 55, 44, 4, 3, 4, 4, 3, 2, 1, 4, 5, 6, 7, 8, 6, 3, 4, 4, 4, 5, 6, 7, 8, 9, 0, 5, 5, 5, 53, 2, 1}//
                                    //33, 22, 44, 7, 66, 55, 44, 4, 3, 4, 4, 3, 2, 1, 4, 5, 6, 7, 8, 6, 3, 4, 4, 4, 5, 6, 7, 8, 9, 0, 5, 5, 5, 53, 2, 1,
        System.out.print("{");
        for (int i = 0; i < printTest.length; i++) {
            if(i==printTest.length-1){
                System.out.print(printTest[i]);
            } else{
                System.out.print(printTest[i] + ", ");
            }
        }
        System.out.print("}");


        System.out.println(" \n/////////////////////////////////////////////\n ");

        // TODO TASK FOR THURSDAY
        String[] actualResults= {"Test", "Java", "java", "String", "int", "break", "default", "Key", "Array"};
        String[] expectedResults= {"Test", "java", "Java", "String", "Int", "break", "default", "KeYs", "ArraY"};


        // your task is:
        // compare these 2 array element by element according to their insertion order
        // you should ignore case sensitivity!!
        // for each element do assertion , verify that they are equal or not!!

//        sample1[] {A,b,C}
//        sample2[] {A,B,d}
//        SAMPLE OUTPUTS:
//          sample1 "A"value is equal to sample2 "A"
//          sample1 "b"value is equal to sample2 "B"
//          sample1 "C"value is NOT equal to sample2 "d" ........
//      HINT!!
//        String t1= "Test";
//        String t2 = "test";
//        System.out.println("t1.equals(t2) = " + t1.equals(t2));  // false !! case sensitivity!!


    }


}
