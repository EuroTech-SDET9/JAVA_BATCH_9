package days.day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        // String names=5 name
        String[] names = new String[5];
        names[0] = "Ali";
        names[1] = "Veli";
        names[2] = "Ayse";
        names[3] = "Michael";
        names[4] = "Messi";
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));
//        names[5] = "Ronaldo";
        int[] numbers2 = new int[3];
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);// index number 0
        numbers.add(15);//   1
        numbers.add(5);//  2
        numbers.add(3);//  3
        numbers.add(25);// 4
        numbers.add(50);//  5
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.size());
        System.out.println("numbers.get(5) = " + numbers.get(5));
        System.out.println("numbers.get(numbers.size()-1) = " + numbers.get(numbers.size() - 1));
        System.out.println(numbers);
        numbers.set(0, 75);
        System.out.println(numbers);
        //numbers.set(9,200); Index 9 out of bounds for length 6
        numbers.add(1, 200);
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);
        Integer integer = Integer.valueOf(200);
        numbers.remove(integer);
        System.out.println(numbers);
        // numbers.clear(); //will remove all the elements
        System.out.println(numbers);
        ArrayList<Integer> clonedNumbers = (ArrayList<Integer>) numbers.clone();
        clonedNumbers = (ArrayList<Integer>) numbers.clone();
        System.out.println(clonedNumbers);
        System.out.println(numbers.contains(25));
        System.out.println(numbers.contains(125));
        System.out.println(numbers.equals(clonedNumbers));
        System.out.println(numbers.indexOf(15));
        System.out.println(numbers.indexOf(50));
        numbers.add(3);
        numbers.add(90);
        System.out.println(numbers);
        System.out.println(numbers.lastIndexOf(3));
        System.out.println(numbers.indexOf(3));
        System.out.println(numbers);
        //for loop
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(4));
        System.out.println(numbers.get(5));
        System.out.println(numbers.get(6));
        System.out.println("=================");
        for (int i = 0; i < 7; i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("==============");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("=========");
        //for each loop

        for (Integer n : numbers) {
            System.out.println(n);
        }

        // print the values , greater then 40
        System.out.println("==================");
        for (Integer n : numbers) {
            if (n > 40) {
                System.out.println(n);
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);


    }
}
