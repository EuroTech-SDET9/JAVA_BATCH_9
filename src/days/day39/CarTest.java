package days.day39;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Black", false);
//        car.color = "Red";
//        car.color = "Black";
//        car.brand = "BMW";
//        car.brand = "Honda";
        System.out.println(car.getColor());
        String brand = car.getBrand();
        System.out.println("brand = " + brand);
        System.out.println(car.getIsManual());

        //modify method
        // isClean  field
        //method clean the car isClean =true
        // hasAccident field drop value
        //milage --> milage over 100000 drop value else increase value


    }
}
