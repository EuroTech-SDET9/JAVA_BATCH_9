package days.day48;

public class Vehicle {
    public void moving() {
        System.out.println(" moving");
    }

    public void brakes() {
        System.out.println("stopping");
    }

}

class Car extends Vehicle {

}

class Honda extends Car {

}

class Plane extends Vehicle {

    public void flying() {
        System.out.println("Plane flying.");
    }

    public void brakes(){
        System.out.println("Plane is landing...");
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.moving();
        Plane plane = new Plane();
        plane.moving();
        Honda honda = new Honda();
        honda.moving();
        plane.flying();
        plane.brakes();
        car.brakes();
    }
}
