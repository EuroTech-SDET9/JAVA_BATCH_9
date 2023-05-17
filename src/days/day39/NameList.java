package days.day39;

import java.util.ArrayList;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> examsResultListByName = new ArrayList<>();
        examsResultListByName.add("Ali : 90");
        examsResultListByName.add("Veli : 95");
        examsResultListByName.add("Ayse : 100");
        examsResultListByName.add("David : 90");
        examsResultListByName.add("Ronaldo : 85");
        examsResultListByName.add("Messi : 75");
        examsResultListByName.add("Cetin : 98");
        examsResultListByName.add("Aziz : 97");
        // create 2 arraylist 1 for names , 1 for grades
        ArrayList<String> names = new ArrayList<>();//names
        ArrayList<Integer> grades = new ArrayList<>();// grades
        System.out.println("examsResultListByName = " + examsResultListByName);
        System.out.println("examsResultListByName.get(0) = " + examsResultListByName.get(0));
        //1st element
        String[] split = examsResultListByName.get(0).split(" : ");
        System.out.println("[0] = " + examsResultListByName.get(0).split(" : ")[0]);
        System.out.println("split[0] = " + split[0]);
        System.out.println("split[1] = " + split[1]);
        //second element
        split = examsResultListByName.get(1).split(" : ");
        System.out.println("[1] = " + examsResultListByName.get(1).split(" : ")[0]);
        System.out.println("split[0] = " + split[0]);
        System.out.println("split[1] = " + split[1]);

        for (int i = 0; i < examsResultListByName.size(); i++) {
//            System.out.println("examsResultListByName.get(i) = " + examsResultListByName.get(i));
            split = examsResultListByName.get(i).split(" : ");
            names.add(split[0]);
            grades.add(Integer.parseInt(split[1]));
        }
        System.out.println("names = " + names);
        System.out.println("grades = " + grades);

    }
}
