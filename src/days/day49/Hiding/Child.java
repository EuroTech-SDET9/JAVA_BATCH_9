package days.day49.Hiding;

public class Child extends Parent {

    int balance = 200;


    public void test(){
        super.test();
        System.out.println("CHILD TEST");
    }

    public static void staticTest(){
        System.out.println("Child Static Method");
    }

    public int getParentBalance(){
        return super.balance;
    }
}

class Test{
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.test();
        System.out.println("child1.balance = " + child1.balance);
        child1.staticTest();

        // how to access Parent class balance?
        Parent parent1 = new Parent();
        System.out.println("parent1.balance = " + parent1.balance);

        // how to access Parent class balance with child1 object ?
        System.out.println("child1.getParentBalance() = " + child1.getParentBalance());

    }

}
