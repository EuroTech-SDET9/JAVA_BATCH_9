package days.day46.SchoolAdmin;

public class Teacher extends SchoolAdmin {

    int teacherID;
    String profession;

    public Teacher(String name, int birthYear, char gender, String profession) {
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.profession = profession;
        signContract();
    }


}
