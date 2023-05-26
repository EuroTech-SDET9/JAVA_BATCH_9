package days.day44;

public class Pizza {
    int slices = 10;
    static int familySlices = 10;

    public void printSlicesValue() {
        System.out.println("slices = " + slices);
        System.out.println("familySlices = " + familySlices);
    }

    public void eatingPizza() {
        slices--;
        familySlices--;
    }


}

class PizzaTest {
    public static void main(String[] args) {
//        // David Marry Ali Ketty
//        Pizza marry = new Pizza();
//        Pizza david = new Pizza();
//        marry.slices = 10;
//        david.slices = 15;
//        marry.printSlicesValue();//10
//        david.printSlicesValue();//15
//        marry.eatingPizza();// 9
//        marry.printSlicesValue();// 9
//        david.printSlicesValue();//15
//        marry.eatingPizza();
//        marry.printSlicesValue();// 8
//        david.printSlicesValue();//15
//        Pizza ali = new Pizza();
//        System.out.println("ali.slices = " + ali.slices);
//        Pizza ketty = new Pizza();
//        System.out.println("ketty.slices = " + ketty.slices);
//        david.slices = 10;
//        marry.slices = 10;
//        System.out.println("ali.slices = " + ali.slices);
//        System.out.println("ketty.slices = " + ketty.slices);
//        System.out.println("david.slices = " + david.slices);
//        System.out.println("marry.slices = " + marry.slices);
//        ali.eatingPizza();
//        ali.eatingPizza();
//        ali.eatingPizza();
//        ali.printSlicesValue();
//        david.printSlicesValue();
//        marry.printSlicesValue();
//        ketty.printSlicesValue();
//        marry.eatingPizza();
//        marry.eatingPizza();
//        david.eatingPizza();
//        ali.printSlicesValue();
//        david.printSlicesValue();
//        marry.printSlicesValue();
//        ketty.printSlicesValue();
        Pizza ali = new Pizza();
        Pizza david = new Pizza();
        ali.printSlicesValue();
        ali.printSlicesValue();
        david.printSlicesValue();
        ali.eatingPizza();
        ali.eatingPizza();
        ali.printSlicesValue();
        david.eatingPizza();
        david.printSlicesValue();

    }
}

