package days.day45.Task1;

public class Vehicle { // PARENT CLASS!!!

   public String name; // default access modifier!!
    double weight;
 private double length;
    int seats;
    boolean lights;


    public Vehicle() {
        System.out.println("!!!!!!VEHICLE Const!!!!!!");
    }

    public void start(){
        System.out.println("START!");
    }

    protected void stop(){
        System.out.println("STOP!");
    }

    public void move(){
        System.out.println("MOVE!");
    }

}
