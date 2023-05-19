package days.day40;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("first object");
        Student student1 = new Student();
        System.out.println("second object:");
        Student student2 = new Student();
        System.out.println("third object");
        Student student3 = new Student();
        new Student();
        Student student4 = new Student("Ali");
        student1.name = "Messi";
        student2.name = "Veli";
        student1.studying();
        student2.studying();
        System.out.println("student4.name = " + student4.name);
        student4.name = "David";
        System.out.println("student4.name = " + student4.name);
        String city = new String();
        String country = new String("Germany");
        char[] letters = {'a', 'b', 'c'};
        String charsString = new String(letters);
        System.out.println("charsString = " + charsString);
        Student student5 = new Student("Michael", "London", 2000);
        System.out.println("student5.name = " + student5.name);
        System.out.println("student5.city = " + student5.city);
        System.out.println("student5.birthYear = " + student5.birthYear);
        Student student6 = new Student("Meral", "London", 1998);
        Student student7 = new Student("Busra", "Manchester", 1995);
        student6.studentInfo();
        student7.studentInfo();

    }
}
