package days.day46.SchoolAdmin;

public class Student extends SchoolAdmin { // SUB CLASS

    int studentID;
    String faculty;

    public Student(String name, int birthYear, char gender, String faculty) {
        super(name, birthYear, gender);
        staffType = "Student";
        this.faculty = faculty;
        signContract(staffType);
    }

    @Override
    public void signContract(String staffType) {
        super.signContract(staffType);
    }
}
