package days.day58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homeworks {

    public static void main(String[] args) {

        System.out.println("**************** HOMEWORK 4 **************** ");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        List<String> result = colors.subList(0, 3);

        System.out.println(colors.subList(0, 3));

        /////////////////////////////////////////////////////////////////////////////////

        System.out.println("**************** HOMEWORK 5 **************** ");

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "White", "Pink"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("Red", "Green", "Black", "Pink"));

        ArrayList<String> matchingColors = new ArrayList<>(list3);
        matchingColors.retainAll(list4);
        System.out.println("Matching Colors: " + matchingColors);

    }
}
