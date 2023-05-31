package days.day46.SchoolAdmin;

public class Staff extends SchoolAdmin{

    int staffID;
    String department;

    public Staff(String name, int birthYear, char gender, String department) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.department = department;
        signContract();
    }



}
