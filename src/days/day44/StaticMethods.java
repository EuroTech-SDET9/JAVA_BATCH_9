package days.day44;

public class StaticMethods {
    static {
        System.out.println("static block executed");
    }
    {
        System.out.println("instance block executed");
    }
    StaticMethods(){
        System.out.println("constructor executed.");
    }

    String name;
    static String city;

    public static void print() {
        System.out.println("Hello!!!!!");
//        printName(); Non-static method 'printName()' cannot be referenced from a static context
//        name = "Ali";Non-static field 'name' cannot be referenced from a static context
    }

    public void printName() {
        System.out.println("Veli");
        print();//in a non static method you can call static method
        System.out.println("city = " + city);
    }


}

class Test {
    //use class name to call static methods
    //you cant call instance methods in a static method
//    in a non static method you can call static method
    public static void main(String[] args) {
       // StaticMethods.print();
        StaticMethods staticMethods=new StaticMethods();
        StaticMethods staticMethods1=new StaticMethods();
        StaticMethods staticMethods2=new StaticMethods();
        //static block executed
        //instance block executed
        //constructor executed.
        //instance block executed
        //constructor executed.
        //instance block executed
        //constructor executed.



    }
}
