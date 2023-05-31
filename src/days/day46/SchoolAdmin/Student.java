package days.day46.SchoolAdmin;

public class Student extends SchoolAdmin { // SUB CLASS

    int studentID;
    String faculty;

    public Student(String name, int birthYear, char gender, String faculty) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.faculty = faculty;
        signContract();
    }


}
