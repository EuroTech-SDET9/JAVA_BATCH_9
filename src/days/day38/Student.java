package days.day38;

public class Student {

    String name;
    int age;
    long studentID;
    static int studentCount= 0;

    public Student (){  // No-arg constructor!!
        studentCount++;
        System.out.println("Welcome to School");
        System.out.println("Here is your welcome pack info: .....");
    }

    public Student(String name) {
        this();
        System.out.println("!!!Str param Cons!!!!");
        this.name = name;
//        studentCount++;
//        System.out.println("Welcome to School");
//        System.out.println("Here is your welcome pack info: .....");
    }

    public Student(String name, int age, long studentID) {
        this();
        System.out.println("!!! All Param Cons!!!");
        this.name = name;
        this.age = age;
        this.studentID = studentID;
//        studentCount++;
//        System.out.println("Welcome to School");
//        System.out.println("Here is your welcome pack info: .....");
    }
}
