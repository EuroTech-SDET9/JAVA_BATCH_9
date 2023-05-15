package days.day37;

public class School {

    String buildingType ;
    String schoolName;
    int schoolId;
    int studentNumber;

    static int schoolCount;

    boolean isActive;

    // no-arg constructor!!!
    public School(){
        System.out.println("!!! CONSTRUCTOR !!!");
        buildingType="school";
        schoolCount += 1;
    }

    public void registerStudent(int studentID){
        System.out.println("Register was completed, studentID = " + studentID);
    }

    public void deleteStudent(int studentID){
        System.out.println("Record deleted, studentID = " + studentID);
    }

}
