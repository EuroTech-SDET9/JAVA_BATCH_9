package days.day48;

public class Person {
    Person(int year) {
        birthYear = year;
    }

    Person() {

    }

    String name;
    int birthYear;

    public void eating() {
        System.out.println(name + " is eating");
    }

    public void sleeping() {
        System.out.println(name + " is sleeping .");
    }

}

class Employee extends Person {

    Employee() {

    }

    public void working() {
        System.out.println("Employee is working.");
    }

}

class Student5 extends Person {

    Student5(int birthYear) {
        super(birthYear);
    }

    public void sleeping() {
        System.out.println("Student is studying and sleeping only 6 hours in a day.");
    }


}

class UniStudent extends Student5 {
    UniStudent() {
        super(1999);
    }

}

class Test {
    public static void main(String[] args) {
        Person person = new Person(2000);
        person.name = "Ali";
        person.eating();
        Employee employee = new Employee();
        employee.name = "Jordan";
        employee.eating();
        employee.sleeping();
        employee.working();
        Student5 student5 = new Student5(2005);
        student5.name = "Ronaldo";
        student5.eating();
        student5.sleeping();
        System.out.println("student5.birthYear = " + student5.birthYear);
        UniStudent uniStudent = new UniStudent();
        uniStudent.name = "Mihail";
        uniStudent.eating();
        uniStudent.sleeping();
    }

}
