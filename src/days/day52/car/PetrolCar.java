package days.day52.car;

public class PetrolCar extends Car implements PetrolVehicle {
    int fuelTankCap;

    @Override
    public String toString() {
        return "PetrolCar{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void refuel(int liter) {
        fuelTankCap = fuelTankCap + liter;
    }
}
