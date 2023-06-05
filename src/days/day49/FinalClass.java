package days.day49;

final public class FinalClass {

    double balance = 1_000_000;

}

class ChildFinal { //extends FinalClass  -> parent is FINAL CLASS!!!!

    public static void main(String[] args) {
        ChildFinal obj1 = new ChildFinal();
//        System.out.println("obj1.balance = " + obj1.balance); there is no inherit connection!
    }
}
