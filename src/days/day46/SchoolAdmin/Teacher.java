package days.day46.SchoolAdmin;

public class Teacher extends SchoolAdmin {

    int teacherID;
    String profession;

    public Teacher(String name, int birthYear, char gender, String profession) {
        super(name, birthYear, gender);
        staffType = "Teacher";
        this.profession = profession;
        signContract(staffType);

    }


    @Override
    public void signContract(String staffType) {
        super.signContract(staffType);
    }
}
