package days.day40;

public class Car {
    private String brand;
    private double value;
    int speed;

    Car(String brand, double val) {
        this.brand = brand;
        value = val;
    }

    public double getValue() {
        return value;
    }

    public void moving() {
        speed = 50;
    }

    public void breaks(int number) {
        speed = speed - number;
    }

    public String getBrand() {
        return brand;
    }

    public void hasAccident() {
        this.value = value - 2000;
    }


}

class Cartest {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", 5000);
        //System.out.println("car1.brand = " + car1.brand);
      //  System.out.println("car1.value = " + car1.value);
        //car1.brand = "Toyota";
        // System.out.println("car1.brand = " + car1.brand);
        System.out.println("car1.getBrand() = " + car1.getBrand());
        Car car2 = new Car("Mercedes", 7000);
        System.out.println("car2.getBrand() = " + car2.getBrand());
        car1.moving();
        System.out.println("car1.speed = " + car1.speed);
        System.out.println("car2.speed = " + car2.speed);
        car1.breaks(10);
        System.out.println("car1.speed = " + car1.speed);
        car1.hasAccident();
      //  System.out.println("car1.value = " + car1.value);
       // System.out.println("car2.value = " + car2.value);
        System.out.println("car2.getValue() = " + car2.getValue());
        System.out.println("After accident");
        car2.hasAccident();
     //   System.out.println("car2.value = " + car2.value);
        System.out.println("car1.getValue() = " + car1.getValue());
        System.out.println("car2.getValue() = " + car2.getValue());

    }

}
