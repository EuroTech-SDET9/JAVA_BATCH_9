package days.day39;

public class Car {
    private String brand;
    private String color;
    double value;
    private boolean isManual;


    Car(String brand, String color, boolean isManual) {
        this.brand = brand;
        this.color = color;
        this.isManual = isManual;
    }

    Car() {

    }

    public String getBrand() {
        return brand;
    }

    public boolean getIsManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public String getColor() {
        return color;
    }


}
