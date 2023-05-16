package days.day38;

public class Chain {

    int id;
    String name;
    boolean isActive;
    long serialNumber;


    public Chain(int id) {
        this(); // Chain()
        System.out.println("1 arg Cons!!");
    }

    public Chain(int id, String name) {
        this(id);
        System.out.println("2 arg Cons!!");
    }
    public Chain() {
        // this(3,"test");
        //this(2);
        System.out.println("No arg Cons!!");
    }
}
