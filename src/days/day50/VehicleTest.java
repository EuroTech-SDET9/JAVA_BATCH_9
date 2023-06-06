package days.day50;

public class VehicleTest {
    public static void main(String[] args) {
//        new Vehicle();'Vehicle' is abstract; cannot be instantiated
        Toyota toyota = new Toyota("Corolla", "Blue", 5000, 4);
        Toyota toyota1 = new Toyota("Rav4", "Black", 9000, 5);
//        toyota.brand = "Toyota";
//        toyota.model = "Corolla";
//        toyota.color = "Blue";
//        toyota.value = 5000;

        System.out.println("toyota.toString() = " + toyota.toString());
        System.out.println("toyota1.toString() = " + toyota1.toString());

        Jet jet1 = new Jet("Boeing", "Red", 2, 1000.0);
//        jet1.brand = "Boing";
//        jet1.color = "Red";
//        jet1.wings = 2;

        jet1.moving();
        System.out.println("jet1.toString() = " + jet1.toString());
        jet1.landing();


    }
}
