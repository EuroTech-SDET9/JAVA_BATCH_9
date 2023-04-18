package days.day22.CarSample;

public class CarTEST {


    public static void main(String[] args) {

        System.out.println(" //////// Create 1. object: car1 ");
        Car car1 = new Car(); //car1 is object (reference) name

        System.out.println("car1.machineType = " + car1.machineType);
        System.out.println("car1.serialNumber = " + car1.serialNumber);
        car1.serialNumber = 10001;
        System.out.println("car1.serialNumber = " + car1.serialNumber);
        car1.brand = "BMW";
        car1.model = "M4";
        System.out.println("car1.brand = " + car1.brand);
        System.out.println("car1.model = " + car1.model);

        car1.startEngine();
        car1.shutdownEngine();

        car1.service();
        System.out.println("car1.servicePeriod = " + car1.servicePeriod); // 99

        System.out.println(" \n//////// Create 2. object: car2 /////////////");
        Car car2 = new Car();
        Car.service();
        System.out.println("car2.servicePeriod = " + car2.servicePeriod); //98

        System.out.println("car2.machineType = " + car2.machineType);
        System.out.println("car2.serialNumber = " + car2.serialNumber);
        car2.serialNumber = 10002;
        System.out.println("car2.serialNumber = " + car2.serialNumber);
        car2.brand = "KIA";
        car2.model = "Niro";
        System.out.println("car2.brand = " + car2.brand);
        System.out.println("car2.model = " + car2.model);
        car2.honk();


        System.out.println(" \n//////// Create 3. object: car3 /////////////");

        Car car3;
//        System.out.println("car3.machineType = " + car3.machineType); ERROR not initialized!!!
        car3 = new Car();

        car3.colour = "red";
    }
}
