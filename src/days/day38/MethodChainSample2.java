package days.day38;

public class MethodChainSample2 {

    public static void main(String[] args) {
        test(2);
    }

    public static void test(int age){
        System.out.println("Test 1");
        test(age,"Talha");
        test(age,"Berk",true);
    }

    public static void test(int age, String name){
        System.out.println("Test 2");
        test(age,name,true);
    }

    public static void test(int age, String name, boolean isActive){
        System.out.println("Test 3");
    }

}
