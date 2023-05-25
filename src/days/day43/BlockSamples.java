package days.day43;

public class BlockSamples {
 static  int number ;

    public BlockSamples() {
        System.out.println("!!!!CONST! BLOCK SAMPLE CLASS !!!");
    }

    public static void main(String[] args) {
        System.out.println("Start point Main Method!!");
        System.out.println("End point Main Method!!");
    }

    public void test(){
        System.out.println("TEST instance method!!");
    }

    public static void test2(){
        System.out.println("TEST static method!!");
    }

    static { // static block!!  will run only 1 time when we first load the class!!
        System.out.println("Static Block");
    }


    {  // instance block!!  will run only after each object creation!! if you create 3 object , after each of them it will run before object const!!
    }
}
