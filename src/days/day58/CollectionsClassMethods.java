package days.day58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethods {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,2,-2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0,0,0,0));

        Collections.copy(list2,list1);
        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1);

        List<Integer> list3 = Collections.emptyList();
        System.out.println("list3 = " + list3);


        Collections.fill(list1,0);
        System.out.println("list1 = " + list1);

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,3,3,3,3,3,4));

        System.out.println("list4 = " + list4);

        System.out.println("Collections.frequency(list4,3) = " + Collections.frequency(list4, 3));
        System.out.println("Collections.frequency(list4,3) = " + Collections.frequency(list4, 11));


        System.out.println("Collections.max(list4) = " + Collections.max(list4));
        System.out.println("Collections.min(list4) = " + Collections.min(list4));


        Collections.reverse(list4);
        System.out.println("list4 = " + list4);

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("orange");
        colours.add("white");
        colours.add("black");

        Collections.shuffle(colours);

        System.out.println("colours = " + colours);



    }
}
