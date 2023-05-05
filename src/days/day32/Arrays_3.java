package days.day32;

import java.util.Arrays;

public class Arrays_3 {
    public static void main(String[] args) {
        String str = "Black Eagle";
        //              1     2
        String[] strArray = str.split(" ");
        System.out.println(strArray.length);// 2
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);

        str = "Batch 9 is Java Expert";
        //        1  2  3  4     5
        String[] batch9 = str.split(" ");
        System.out.println("batch9.length = " + batch9.length);
        System.out.println("Arrays.toString(batch9) = " + Arrays.toString(batch9));

        str = "Today is Friday is last day is of Week";
//                1        2         3          4
        String[] is = str.split("is");
        System.out.println("is.length = " + is.length);
        System.out.println(Arrays.toString(is));//

        str = "Have a nice weekend";
        //
        String[] weekend = str.split("a ");
        System.out.println(Arrays.toString(weekend));


    }
}
