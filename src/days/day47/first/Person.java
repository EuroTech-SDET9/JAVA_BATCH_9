package days.day47.first;

public class Person {
    // protected , default , private , public
    static String world;
    protected String name;
    int age;
    private double salary;
    public String city;

    public double getSalary() {
        return salary;
    }

    public static void sleeping() {
        System.out.println("world = " + world);
//        System.out.println("city = " + city);
    }

    public void eating() {
        System.out.println(name + " is eating.");
        System.out.println(age);
        System.out.println("salary = " + salary);
        System.out.println("world = " + world);
    }

    void studying() {
        System.out.println("Studying java");
    }

    void running() {
        System.out.println(name + " is running.");
    }

    public static void main(String[] args) {
//        static int n;
        int n;
    }
}

class Student {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Georges";
        person.age = 30;
        person.running();
//        person.salary = 3000;
        person.city = "London";
        person.eating();
    }
}
