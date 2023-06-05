package days.day49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.add(1);
        System.out.println("list = " + list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11,22,33,44,55));

        list = list2;
        System.out.println("list = " + list);

        System.out.println("\n///////////////////////\n");

        final ArrayList<Integer> finalList = new ArrayList<>(Arrays.asList(10,11,12,13,14));

        System.out.println("finalList = " + finalList);

        finalList.remove(0);

        System.out.println("finalList = " + finalList);

        finalList.add(0,111);

        System.out.println("finalList = " + finalList);

//        finalList = list2; // ArrayList can not be re-assigned to another object using new keyword

//        finalList = new ArrayList<>();// NO NO NO NO!!


    }
}
