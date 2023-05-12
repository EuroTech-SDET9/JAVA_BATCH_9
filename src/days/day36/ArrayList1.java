package days.day36;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(10);
        grades.add(20);
        grades.add(5);
        grades.add(100);
        System.out.println("grades = " + grades);
        grades.add(1,50);
        System.out.println("grades = " + grades);
        grades.set(0,200);
        System.out.println("grades = " + grades);
        System.out.println("grades.get(2) = " + grades.get(2));
        int index5 = grades.indexOf(5);
        System.out.println("index5 = " + index5);
        grades.remove(index5);
        System.out.println("grades = " + grades);
        System.out.println("grades.indexOf(100) = " + grades.indexOf(100));
        System.out.println("grades.indexOf(50) = " + grades.indexOf(50));
        grades.add(50);
        System.out.println("grades = " + grades);
        System.out.println("grades.lastIndexOf(50) = " + grades.lastIndexOf(50));
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println("grades.equals(numbers) = " + grades.equals(numbers));
        System.out.println("grades.size() = " + grades.size());
        grades.add(1000);
        System.out.println("grades.size() = " + grades.size());



    }
}
