package days.day45.Task1;

import days.day44.Pizza;

public class Car extends Vehicle {

    double tiresSize;
    String brand;
    int doorNumber;

    public Car() {
        System.out.println("!!!!!!Car Const!!!!!!");
    }

    public void honk(){
        System.out.println("HONK");

        stop();
        start();
        name= "as";
    }

    public void handBreak(){
        System.out.println("Hand Break");
    }

    public void openTrunk(){
        System.out.println("Open Trunk");
    }


}
