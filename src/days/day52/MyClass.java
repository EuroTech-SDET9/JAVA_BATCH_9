package days.day52;

public class MyClass implements Addition, Multiplication {
    String str;
    int number;

    public void print() {
        System.out.println(number);
        String city = "London";
        System.out.println("city = " + city);
    }

    public void multiply(int a, int b) {

    }


    public void add() {
        System.out.println(2 + 2);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }

}


class YourClass implements Addition {


    @Override
    public void add() {
        System.out.println(100 + 100);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}


class Test {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.number = 10;
        myClass.str = "Hello";
        myClass.print();
//        Addition.calculation = "";Cannot assign a value to final variable 'calculation'
        System.out.println("Addition.calculation = " + Addition.calculation);
        myClass.add();
        String city = "London";
        String country = "England";
        System.out.println("MyInterface.city = " + MyInterface.city);
        System.out.println("MyInterface.country = " + MyInterface.country);
        String userName = "Inspector";
        Data.city = "London";


    }

    public static void assignValue(String city) {
        Data.city = city;
    }
}
