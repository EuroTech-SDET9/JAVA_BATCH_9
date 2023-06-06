package days.day50;

public abstract class Vehicle {
    //base class
    // i dont want to create object from Vehicle class

    // i want to create concret class like Honda Toyota planes buses

    String color;
    double value;
    String brand;

    int speed;


    //move
    public abstract void moving();

    public abstract void stopping();

    public void cleaning() {
        System.out.println("Vehicle is being cleaned.");
    }

    public void vehicleInfo() {
        System.out.println(color + brand);
        System.out.println("value = " + value);
    }


}


class Toyota extends Vehicle {
    int doors;
    String model;

    public Toyota(String model, String color, int value, int doors) {
        super();
        super.color = color;
        super.brand = "Toyota";
        super.value = value;
        this.doors = doors;
        this.model = model;
    }

    @Override
    public void moving() {
        System.out.println("Toyota is moving");
    }

    @Override
    public void stopping() {
        System.out.println("Toyota is stopping");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "doors=" + doors +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}