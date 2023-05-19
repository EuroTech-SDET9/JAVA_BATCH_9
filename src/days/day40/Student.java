package days.day40;

public class Student {

    String name;
    String city;
    int birthYear;

    Student(String name, String city, int birthYear) {
        this.name = name;
        this.city = city;
        this.birthYear = birthYear;
    }

    Student() {
        System.out.println("Student class object created , without parameter.");
    }

    Student(String name) {
        this.name = name;
        System.out.println("constructor with parameter");
//       this.studying();
    }

    public void studying() {
        System.out.println(name + " is studying.");
    }


    public void studentInfo() {
        System.out.println(  name + " is living in " + city + " .");
    }
}
