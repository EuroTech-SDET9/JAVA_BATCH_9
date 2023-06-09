package days.day52.car;

public class ElectricCar extends Car implements ElectricVehicle {

//    public ElectricCar(String b, String c, int year) {
    public ElectricCar(CarBrands b, String c, int year) {
        super();
        brand = b;
        color = c;
        super.year = year;
    }

    public ElectricCar() {
        super();
    }

    public void charging() {
        System.out.println(brand + " is being charged at home.");// tesla is being charged at home.
    }


}
