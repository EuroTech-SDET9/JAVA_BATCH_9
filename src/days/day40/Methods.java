package days.day40;

import java.util.ArrayList;

public class Methods {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int num = 15;
        methods.print(10);
        methods.print(num);
        print("Helloooo!");
        String city = "Istanbul";
        print(city);
        System.out.println("city = " + city);
        print("Oslo");
        //Oslo
        //London
        int[] nums = {10, 20, 30};
        print(nums);
        print(new int[]{60, 80, 90});
        ArrayList<String> namesOfStudents = new ArrayList<>();
        namesOfStudents.add("Seyfettin");
        namesOfStudents.add("Emrah");
        namesOfStudents.add("Monika");
        namesOfStudents.add("Yavuz");
        print(namesOfStudents);
        Student student = new Student("Erkan", "Oslo", 1999);
        print(student);
        Student student1 = new Student("Aziz", "Hamburg", 1997);
        print(student1);
        String s = getNames().get(0);
        System.out.println("s = " + s);
        ArrayList<String> names = getNames();
        System.out.println("names = " + names);

    }

    public void print(int number) {
        System.out.println("number = " + number);
    }
    //Istanbul
    //London
    //Istanbul

    public static void print(String str) {
        System.out.println("str = " + str);
        str = "London";
        System.out.println("str = " + str);
    }

    public static void print(int[] numbers) {
        System.out.println("numbers[0] = " + numbers[0]);
    }

    public static void print(ArrayList<String> names) {
        System.out.println("names.get(0) = " + names.get(0));
    }

    public static void print(Student student) {
        System.out.println(student.name);
        System.out.println("student.birthYear = " + student.birthYear);
    }

    public static ArrayList<String> getNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mihail");
        names.add("Mustafa");
        names.add("Busra");
        names.add("Meral");
        return names;
    }

}
