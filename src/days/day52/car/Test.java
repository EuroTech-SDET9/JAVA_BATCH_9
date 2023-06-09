package days.day52.car;

public class Test {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
//        electricCar.brand = "Tesla";
        electricCar.brand = CarBrands.TESLA;
        electricCar.color = "White";
        electricCar.year = 2020;
        electricCar.charging();
//        ElectricCar electricCar1 = new ElectricCar("BMW", "Black", 2021);
        ElectricCar electricCar1 = new ElectricCar(CarBrands.BMW, "Black", 2021);
        electricCar1.charging();
        System.out.println("electricCar1.color = " + electricCar1.color);
        System.out.println("electricCar1.year = " + electricCar1.year);
        PetrolCar petrolCar = new PetrolCar();
//        petrolCar.brand = "Toyota";
        petrolCar.brand = CarBrands.TOYOTA;
        petrolCar.year = 2022;
        petrolCar.color = "Blue";
        petrolCar.refuel(30);
        System.out.println("petrolCar.toString() = " + petrolCar.toString());
        petrolCar.refuel(10);
        System.out.println("petrolCar.fuelTankCap = " + petrolCar.fuelTankCap);
        //Tesla, Toyota, BMW

        System.out.println(CarBrands.BMW);
        System.out.println("CarBrands.HONDA = " + CarBrands.HONDA);

        for (CarBrands brnds : CarBrands.values()) {
            System.out.println("brnds = " + brnds);
        }
        System.out.println("Days.MONDAY = " + Days.MONDAY);
        CarBrands brand = CarBrands.FERRARI;

        switch (brand) {
            case BMW:
                System.out.println("Perfect German car.");
                System.out.println("Value of the BMW = " + CarBrands.BMW.price);
                break;
            case FERRARI:
                System.out.println("Flying like bee.Ferrari");
                System.out.println("Value of the Ferrari = " + CarBrands.FERRARI.price);
        }
        System.out.println("brand.price = " + brand.price);

        System.out.println("Days.MONDAY = " + Days.MONDAY);

        String str = Days.MONDAY.toString();
        Days days = Days.SATURDAY;

        String[] brandsArr = {"Lambo", "Renault", "Fiat"};
        System.out.println("Days.FRIDAY.ordinal() = " + Days.FRIDAY.ordinal());//index number
        System.out.println("Days.MONDAY.ordinal() = " + Days.MONDAY.ordinal());


    }
}
