package days.day31;

import java.util.Arrays;

public class ArrayUsefulMethods {

    public static void main(String[] args) {
        int[] test = new int[3];

        test[0]= 1;
        System.out.println(test[1]); // 0 default value !!!


        System.out.println("\n/////////////////////////\n");

        String sentence = "I am a JAVA lover";  // 5 words!!!   "I" , "am" ,  "a" , "JAVA" , "lover"

        String message = "The packet is on the way which contains bomb"; // is there "bomb" key?

        String[] splitWords = message.split(" "); // alt enter!! to create local var quickly

        System.out.println(Arrays.toString(splitWords));  // Ready method to print ARRAYS!!


        System.out.println("\n/////////////////////////\n");

        int[] nums= {33,22,1,-223,23,0};
        System.out.println("BEFORE SORT : " + Arrays.toString(nums)); // insertion order
//        Arrays  is predefined library class !!! and contains some ready method to help us!!
        Arrays.sort(nums); // do not reassign it is automatically update the array!!
        System.out.println("AFTER SORT : " +Arrays.toString(nums));  // ascending order !!


        System.out.println("\n/////////////////////////\n");
        int[] nums1= {22,1,-223,23,0,33};
        int[] nums2= {33,22,1,-223,23,0};
        System.out.println(Arrays.equals(nums1, nums2));

        System.out.println("\n/////////////////////////\n");
        int[] newArray= Arrays.copyOf(nums1,10);
        System.out.println(Arrays.toString(newArray));
    }
}
