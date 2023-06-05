package days.day46.SchoolAdmin;

public class Staff extends SchoolAdmin{

    int staffID;
    String department;


    public Staff(String name, int birthYear, char gender, String department) {
        super(name, birthYear, gender);
        staffType = "General Staff";
        this.department = department;
        signContract(staffType);
    }


    @Override
    public void signContract(String staffType) {
        super.signContract(staffType);
    }
}
