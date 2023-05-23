package days.day42;

public class Test {

    public static void main(String[] args) {
        StaticMembers.testStatic = 33;

        System.out.println("StaticMembers.testStatic = " + StaticMembers.testStatic);

        StaticMembers object1 = new StaticMembers();
        object1.testVar = 22;
        System.out.println("object1.testVar = " + object1.testVar);

    }
}
