package days.day37;

public class ConstructorSample {

    public static void main(String[] args) {

        School abcPrimarySchool= new School() ;

        System.out.println("abcPrimarySchool.schoolId = " + abcPrimarySchool.schoolId);
        System.out.println("abcPrimarySchool.schoolName = " + abcPrimarySchool.schoolName);
        System.out.println("abcPrimarySchool.isActive = " + abcPrimarySchool.isActive);
        System.out.println("abcPrimarySchool.buildingType = " + abcPrimarySchool.buildingType);

        System.out.println("School.schoolCount = " + School.schoolCount);

        School techHighSchool = new School();
        System.out.println("School.schoolCount = " + School.schoolCount);

        School euroHighSchool = new School();
        System.out.println("School.schoolCount = " + School.schoolCount);
        euroHighSchool.schoolId= 10003;
        euroHighSchool.schoolName= "Euro Community High School";
        euroHighSchool.isActive= true;
        euroHighSchool.studentNumber = 500;

        School lightPreSchool = new School();










    }
}
