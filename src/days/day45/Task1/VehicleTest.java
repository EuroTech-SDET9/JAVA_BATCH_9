package days.day45.Task1;

public class VehicleTest  {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Volvo";
        car1.name = "C30";
//        car1.length= 2; private date not inherited!!!

//        car1.propellerSize=2;

        Plane plane1= new Plane();
        plane1.name = "B350";
        plane1.propellerSize = 35;
        plane1.start();

//        plane1.honk();
    }
}
