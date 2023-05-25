package days.day43;

public class InstanceBlock {
    int number=50; // instance variable

    public InstanceBlock() {
        System.out.println("!!! CONST INSTANCE BLOCK CLASS !!!!");
        System.out.println("number = " + number);
    }

    { // instance block / non-static block!!
        System.out.println("Instance BLOCK FOR InstanceBlock class !!!!");
        number = 10;
    }

    static {
        System.out.println("!!!! STATIC BLOCK FOR InstanceBlock class !!!! ");
    }

    public static void main(String[] args) {
        System.out.println("Start point Main Method!!");
        InstanceBlock obj1 = new InstanceBlock();
        System.out.println("obj1.number = " + obj1.number);
        obj1.number = 100;
        System.out.println("obj1.number = " + obj1.number);
        System.out.println("////////  !!NEW OBJECT!! ///////////");
        InstanceBlock obj2 = new InstanceBlock();
        System.out.println("obj2.number = " + obj2.number);

        System.out.println("End point Main Method!!");
    }
}
