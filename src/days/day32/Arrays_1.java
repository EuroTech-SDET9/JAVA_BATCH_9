package days.day32;

import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        // create an array numbers   7 numbers print first element of the array
        int[] numbers1 = {10, 20, 5, 3, 20, 6, 50, 25, 65, 58, 77, 99, 100};
        //                0    1  2  3   4  5  6   7    9   10  11  12  13   ----> length  14
        int[] numbers = new int[]{60, 20, 50, 40, 80, 10, 15};
        int[] nums = new int[10];
        nums[0] = 50;
        nums[5] = 80;
        nums[1] = 60;
        numbers1[0] = 80;
        System.out.println("numbers[6] = " + numbers[6]);
        System.out.println(numbers[numbers.length - 1]);
        System.out.println("numbers.length = " + numbers.length);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("numbers[0] = " + numbers[0]);// smallest element of the array
        System.out.println(numbers[numbers.length - 1]);//greatest value in the array
        // check the values if there is 40 in the array , if there is print the index number
        int indexOf40 = Arrays.binarySearch(numbers, 40);
        System.out.println("indexOf40 = " + indexOf40);
        System.out.println(Arrays.binarySearch(numbers, 200));
//        Arrays.binarySearch() will not work if you dont sort the array
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 40) {
                System.out.println("There is 40");
                break;
            }
            count++;
        }
        System.out.println("count = " + count);

//        int[] copyOfNumbers = Arrays.copyOf(numbers,10);
        int[] copyOfNumbers = Arrays.copyOf(numbers,numbers.length);
        System.out.println(Arrays.toString(copyOfNumbers));

        System.out.println(Arrays.equals(numbers, copyOfNumbers));
        int[] ints = Arrays.copyOfRange(numbers, 0, 5);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));




    }
}
