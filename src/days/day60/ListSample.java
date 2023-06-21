package days.day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSample {


    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11,22,33));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(111,222,333));


        List<ArrayList> allLists = new ArrayList<>();

        allLists.add(list1);
        allLists.add(list2);
        allLists.add(list3);

        System.out.println("allLists = " + allLists);


    }
}
