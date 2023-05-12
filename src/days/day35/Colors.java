package days.day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Colors {
    public static void main(String[] args) {
        //  String colors 5
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        String color = "Green";
        colors.add(color);
        colors.add("Yellow");
        System.out.println(colors);
        colors.add(0, "Black");
        System.out.println(colors);
        colors.set(2, "Claret");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
        System.out.println(colors.contains("Black"));
        colors.add("Dark Grey");
        System.out.println(colors);
        System.out.println(colors.contains("Grey"));// Arraylist of the any elements is equal to "Grey it will return true else false
        System.out.println(colors.contains("Dark Grey"));

        // any element of the arraylist contains grey ???????????
        System.out.println(colors.get(0).contains("Dark"));
        System.out.println(colors.get(3).contains("Dark"));//checking the fourth element contains Dark or not
        System.out.println(colors.contains("Dark"));//Arraylist method

        //convert Arrays to ArrayList
        Integer[] numbers = {1, 5, 6, 9, 8, 5};
        ArrayList<Integer> numbers5 = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numbers5);
//        List<int[]> ints = Arrays.asList(new int[]{1, 2, 3});



    }
}
