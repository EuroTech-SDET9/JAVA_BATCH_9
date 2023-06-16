package days.day57;

import java.util.ArrayList;

public class Practice {


    public static void main(String[] args) {

        System.out.println(" \n Q-1 ///////////////////");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("orange");
        colors.add("white");
        colors.add("black");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Insert the element at the first position
        colors.add(0, "blue");

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + colors);


        System.out.println(" \n Q-2 ///////////////////");
        ArrayList<String> color_list = new ArrayList<>();
        color_list.add("red");
        color_list.add("blue");
        color_list.add("green");
        color_list.add("black");

        System.out.println("color_list = " + color_list);
        color_list.set(2,"yellow");
        System.out.println("color_list = " + color_list);


        System.out.println(" \n Q-3 ///////////////////");

        String key = "Red";
        if(color_list.contains(key)){
            System.out.println("RED FOUND!!!");
        } else {
            System.out.println("NOT FOUND!!!");
        }


        System.out.println(" \n Q-4 ///////////////////");

    }
}
