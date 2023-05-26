package days.day44;

public class Student {
    String name;
    static int numberOfStudents;
    int number;
    double mathGrade;
    double scienceGrade;
    double literatureGrade;
    //create a list for each student and put these grades into the list
    // create a class list for all the grades belong to students

    Student() {
        numberOfStudents++;
        number = numberOfStudents;
        System.out.println("Student.numberOfStudents = " + Student.numberOfStudents);
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student ali = new Student();
//        System.out.println("Student.numberOfStudents = " + Student.numberOfStudents);
        Student ashwini = new Student();
//        System.out.println("Student.numberOfStudents = " + Student.numberOfStudents);
        Student erkan = new Student();
//        System.out.println("Student.numberOfStudents = " + Student.numberOfStudents);
        Student busra = new Student();
//        System.out.println("Student.numberOfStudents = " + Student.numberOfStudents);
        Student mustafa = new Student();
//        System.out.println("Student.numberOfStudents = " + Student.numberOfStudents);
        System.out.println("ali.number = " + ali.number);
        System.out.println("ashwini.number = " + ashwini.number);

    }
}
