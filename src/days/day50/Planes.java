package days.day50;

public abstract class Planes extends Vehicle {

    int wings;

    public abstract void landing();

    @Override
    public String toString() {
        return "Planes{" +
                "wings=" + wings +
                ", color='" + color + '\'' +
                ", value=" + value +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class Jet extends Planes {

    public Jet(String brand, String color, int wings, double value) {
        super();
        super.brand = brand;
        super.color = color;
        super.wings = wings;
        super.value = value;
    }

    @Override
    public void moving() {
        System.out.println("Jet takes off.....");
        speed = 900;
    }

    @Override
    public void stopping() {
        System.out.println("Jet is stopping.");
    }

    @Override
    public void landing() {
        System.out.println("Jet is landing.");
    }
}
