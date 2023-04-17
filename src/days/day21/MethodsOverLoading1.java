package days.day21;

public class MethodsOverLoading1 {
    public static void main(String[] args) {
        print("Ali");
        print("Messi");
        print("Curry");
        print("Jordan");
        print("Ayse");
        print(10);
        print(25.64);
        print("Ronaldo", 50);
        print(60, "Stephen Curry");
    }

    // print("Ali") print your names and call this method in the main method

    //3 ways for overloading methods
    //1- parameter types should be different
// 2- number of parameters must be different
    //3- order of the parameters should be different

    // it is not possible to overload the methods by changing return types

    public static void print(double d) {
        System.out.println("d = " + d);
    }

//    public static double print(double d) {
//        System.out.println("d = " + d);
//        return 30.90;
//    }

    public static void print(String name) {
        System.out.println("name = " + name);
    }

    public static void print(int number) {// 1- parameter types should be different
        System.out.println("number = " + number);
    }

    public static void print(String name, int age) {// 2- number of parameters must be different
        System.out.println(name);
        System.out.println(age);
    }
//    public static void print(String n, int a) {//  changing name of the parameters(identifiers) will not effect overloading
//        System.out.println(n);
//        System.out.println(a);
//    }

    public static void print(int age, String name) {//3- order of the parameters should be different
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
