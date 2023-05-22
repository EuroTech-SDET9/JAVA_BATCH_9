package days.day41;

public class JavaStudentTest {
    public static void main(String[] args) {
        JavaStudent javaStudent1 = new JavaStudent("Ali", 25, 'm', 5);
        System.out.println("javaStudent1.getStudentName() = " + javaStudent1.getStudentName());
//        javaStudent1.age = 50;
        System.out.println("javaStudent1.getAge() = " + javaStudent1.getAge());
        System.out.println("javaStudent1.getGender() = " + javaStudent1.getGender());
        javaStudent1.studying(10);
        System.out.println("javaStudent1.javaHours = " + javaStudent1.javaHours);
//        javaStudent1.javaGrades = 90;
//        javaStudent1.seleniumGrades = 100;
        System.out.println("javaStudent1.toString() = " + javaStudent1.toString());
        javaStudent1.getAverageOfGrades();

        javaStudent1.javaGrades = 75;
        javaStudent1.seleniumGrades = 85;
        javaStudent1.getAverageOfGrades();
        javaStudent1.results();

    }
}
