package days.day29;

public class Memory {

    int insVariable = 10;

    public static void test(){
//        localVariable  // NO ACCESS!!! LOCAL!!!
    }

    public static void main(String[] args) {
        int localVariable = 3;
        System.out.println("localVariable = " + localVariable);

        String str = "Java";

        str= "Java Test";
    }
}

class Test{
    public static void main(String[] args) {
        Memory memoryObj = new Memory();
        memoryObj.insVariable=100;
        System.out.println("memoryObj = " + memoryObj);

        Memory obj2 = memoryObj;  // new Memory()//
        System.out.println("obj2 = " + obj2);  // SAME ADDRESS !!!
        System.out.println("obj2.insVariable = " + obj2.insVariable); //100


        String value = "Java";

        String test = "Java";

        value = "New Java";

        String tax= "New Java";

        String str = new String("Java");

        String yavuz = new String("Java");

        yavuz = new String("Test");


        Memory obj3 ;

//        System.out.println("obj3.insVariable = " + obj3.insVariable);

        System.gc();


    }

}
