package days.day43;

public class Student {
    // I need a unique studentId for each student(object of Student class)
    // And studentId numbers starts 10000  -> 10001  10002  10003....
    String name;
    String className;
    int id; // instance field!!

    static int uniqueIdCounter=10000; //Class field

    public Student() {
        uniqueIdCounter++;
        this.id = uniqueIdCounter;
    }

}

class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1.id = " + s1.id);  // 10001

        Student s2 = new Student();
        System.out.println("s2.id = " + s2.id);  // 10002
        System.out.println("s1.id = " + s1.id);  // 10001
    }

}
