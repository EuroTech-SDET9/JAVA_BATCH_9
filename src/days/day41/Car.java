package days.day41;

public class Car {
    private String brand;
    private double value;
    private String color;
    private int doors;
    private int year;
    String city = "London";

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2023 || year < 2020) {

        } else {
            this.year = year;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < 0) {

        } else {
            this.value = value;
        }
    }

    Car(String brand, double value, String color, int door, int year) {
        this.brand = brand;
        this.value = value;
        this.color = color;
        doors = door;
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("Honda", 10000, "Black", 4, 2023);
//        car1.brand = "Honda";
//        car1.brand = "BMW";
//        car1.brand = "Toyota";
        car1.setColor("Blue");
        System.out.println("car1.getColor() = " + car1.getColor());
        System.out.println("car1.getValue() = " + car1.getValue());
        car1.setValue(-9999999);
        System.out.println("car1.getValue() = " + car1.getValue());
        car1.setYear(9999);
        System.out.println(car1.getYear());

        Car car2 = new Car("Ferrari", 50000, "Red", 2, 2022);
        System.out.println("car2.city = " + car2.city);
        System.out.println("car1.city = " + car1.city);
        car2.city="Roma";
        System.out.println("car2.city = " + car2.city);//Roma
        System.out.println("car1.city = " + car1.city);//london

    }
}

