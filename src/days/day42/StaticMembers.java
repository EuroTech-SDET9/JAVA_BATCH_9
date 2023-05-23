package days.day42;

public class StaticMembers {

    int testVar = 3; // Instance Variable!!
    static int testStatic; // class Variable!!

    public StaticMembers() {
//        static int testStatic;
    }

    {  // instance code block !!
//        static int testStatic;
    }

    public static void main(String[] args) {
        int localVar= 2; // local Variable!!!
        System.out.println("localVar = " + localVar);

        StaticMembers obj1= new StaticMembers();
        System.out.println("obj1.testVar = " + obj1.testVar);
        obj1.testVar = 44;
        System.out.println("obj1.testVar = " + obj1.testVar);

        StaticMembers obj2 = new StaticMembers();
        System.out.println("obj2.testVar = " + obj2.testVar);

       // testVar=33; cannot access non-static fields in static methods
    }

    public void test1(){
       // localVar =2;
        int test1Local = 11;
        testVar=33;
        System.out.println("testVar = " + testVar);

//        static int testStatic;

    }

    public static void test2(){
        int test2Local = 22;
      //  localVar =2;
//        testVar=33;  cannot access non-static fields in static methods
//        System.out.println("testVar = " + testVar);
//        static int testStatic;
    }

    @Override
    public String toString() {
        return "StaticMembers{" +
                "testVar=" + testVar +
                '}';
    }
}
