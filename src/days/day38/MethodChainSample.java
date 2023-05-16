package days.day38;

public class MethodChainSample {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        System.out.println("Test 1");
        test2();
    }

    public static void test2(){
        System.out.println("Test 2");
        test3();
    }

    public static void test3(){
        System.out.println("Test 3");
    }


}
