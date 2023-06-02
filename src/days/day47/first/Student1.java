package days.day47.first;

import days.day44.Student;

public class Student1 extends Person {

   public void studying() {
        System.out.println("studying selenium.");
    }

}

class PersonTest {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.studying();
    }
}
