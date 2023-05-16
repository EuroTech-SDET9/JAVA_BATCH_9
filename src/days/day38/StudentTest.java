package days.day38;

public class StudentTest {

    public static void main(String[] args) {

        Student s1 = new Student();  // 1
        System.out.println("s1.age = " + s1.age); // 0
        System.out.println("s1.name = " + s1.name); //null
        s1.name= "Ali";
        s1.age=10;
        s1.studentID= 1000001;
        System.out.println("Student.studentCount = " + Student.studentCount);


        System.out.println("\n//////////////////////////\n");

        Student s2 = new Student("John");  // 2
        System.out.println("s2.age = " + s2.age); // 0
        System.out.println("s2.name = " + s2.name); //John
        System.out.println("Student.studentCount = " + Student.studentCount);

        System.out.println("\n//////////////////////////\n");

        Student s3 = new Student("Meral", 18, 1000003);  // 3
        System.out.println("s3.age = " + s3.age); // 18
        System.out.println("s3.name = " + s3.name); //Meral
        System.out.println("Student.studentCount = " + Student.studentCount);


    }
}
