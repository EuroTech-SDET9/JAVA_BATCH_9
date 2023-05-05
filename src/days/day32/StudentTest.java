package days.day32;

public class StudentTest {

    public void finalize() {
        System.out.println("Garbage collector is cleaning!!!!!");
    }

    public static void main(String[] args) {
        int number = 10;
        Student student1 = new Student();
        String str = new String();
        str.length();
        student1.name = "Ali";
        Student student2 = new Student();
        student2.name = "Ayse";
        System.out.println(student1.name);
        System.out.println(student2.name);
        int num = 0;
        System.out.println(num);
        student2.number = 200;
        student1.number = 100;
        System.out.println(student2.number);
        System.out.println(student1.number);

        StudentTest test = new StudentTest();

        test = null;
        StudentTest test1 = new StudentTest();
        StudentTest test2 = new StudentTest();
        test1 = test2;
        System.gc();
        int[] numbers = {10, 20, 30};
        int[] ages = numbers;
        System.out.println("first age " + ages[0]);
        System.out.println("numbers[0] = " + numbers[0]);
        ages[0] = 90;
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("ages[0] = " + ages[0]);

        String name = "Ronaldo";
        String firstName = name;
        System.out.println("firstName = " + firstName);
        name = "Ali";
        System.out.println(firstName);// strings are immutable unchangeable


        number = 50;
        int age = number;
        number = 100;
        System.out.println("age = " + age);
        System.out.println("number = " + number);
    }
}
