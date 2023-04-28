package days.day26;

public class Print {

    //printName(String name)  1 parameter String name
    public static void main(String[] args) {
        Print print = new Print();
        print.printName("");
//        sayHello("Emrah");
    }

    public void printNameAge(String name, int age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public void printName(String name) {
        System.out.println("name = " + name);
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
