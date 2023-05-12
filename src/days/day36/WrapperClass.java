package days.day36;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        // byte short int long float double boolean char
        // Byte  Short Integer Long Float Double Boolean Character
        int n = 10;
        Integer number = n;//Autoboxing
        int a = number;// Unboxing
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(n);
        String result = "95";
        int i = Integer.parseInt(result);
        System.out.println(i);
        result = " 100 ";
        i = Integer.parseInt(result.trim());
        System.out.println("i = " + i);
        if (i > 90) {
            System.out.println("brilliant!!!!");
        }

        Integer integer = Integer.valueOf(result.trim());
        System.out.println("integer = " + integer);
        result = "99";
        int n5 = Integer.valueOf(result);
        System.out.println("n5 = " + n5);
        result = "94.58";
        double d = Double.parseDouble(result);
        System.out.println("d = " + d);

        ArrayList<String> examResults = new ArrayList<>();
        examResults.add("90");
        examResults.add("100");
        examResults.add("85");
        examResults.add("79");
        examResults.add("80");
        System.out.println(examResults);
        int[] results = new int[examResults.size()];
        results[0] = Integer.parseInt(examResults.get(0));
        results[1] = Integer.parseInt(examResults.get(1));
        results[2] = Integer.parseInt(examResults.get(2));
        results[3] = Integer.parseInt(examResults.get(3));
        results[4] = Integer.parseInt(examResults.get(4));

        System.out.println("results[0] = " + results[0]);
        int[] result5 = new int[examResults.size()];
        for (int x = 0; x < examResults.size(); x++) {
//            System.out.println("x = " + x);
            results[x] = Integer.parseInt(examResults.get(x));
            result5[x] = Integer.valueOf(examResults.get(x));
        }
        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(result5));

        ArrayList<Integer> resultsList = new ArrayList<>();
        for (int x = 0; x < examResults.size(); x++) {
            //            resultsList.add(Integer.parseInt(examResults.get(x)));    1.solution
            // second solution
            String s = examResults.get(x);//get the string value
            int r = Integer.parseInt(s);// parse this string to int
//            int r = Integer.valueOf(s);// parse this string to int
            resultsList.add(r);//add this int to list
        }
        System.out.println("resultsList = " + resultsList);

        ArrayList<String> examsResultListByName = new ArrayList<>();
        examsResultListByName.add("Ali : 90");
        examsResultListByName.add("Veli : 95");
        examsResultListByName.add("Ayse : 100");
        examsResultListByName.add("David : 90");
        examsResultListByName.add("Ronaldo : 85");
        examsResultListByName.add("Messi : 75");
        // create 2 arraylist 1 for names , 1 for grades
        ArrayList<String> names = new ArrayList<>();//names
        ArrayList<Integer> grades = new ArrayList<>();// grades


    }
}
