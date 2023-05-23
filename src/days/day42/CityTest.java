package days.day42;

public class CityTest {


    public static void main(String[] args) {

        City city1 = new City("Paris",100100);
//        System.out.println("Welcome to " + city1.name);  // We don't need to type them separately for each object.
//        City.cityCounter++;                              // just put them in const. !! That's enough!!

// print counter ()  -> 1
        City.printCityCounter();

        City city2 = new City("Pforzheim", 101200);
        city2.updateCityPopulation(200000);
        System.out.println("city2.population = " + city2.population);

        City city3 = new City("Newcastle", 500000);
// print counter ()  -> 3
        City.printCityCounter();

        System.out.println("city3.population = " + city3.population);
        city3.updateCityPopulation(600000);
        System.out.println("city3.population = " + city3.population); // 600000


        City city4 = new City("Trabzon", 123456);
 // print counter ()  -> 4
        City.printCityCounter();
    }
}
