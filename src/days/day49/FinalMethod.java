package days.day49;

public class FinalMethod { // Parent Class

   final public void test(){
        System.out.println("PARENT TEST");
    }
}

class FinalMethodTest extends FinalMethod{  // Child Class

//    @Override   //overridden method is final!!!
//    public void test() {
//        System.out.println("CHILD TEST");
//    }

    public static void main(String[] args) {
        FinalMethodTest obj1 = new FinalMethodTest();
        obj1.test();
    }

}
