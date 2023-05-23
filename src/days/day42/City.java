package days.day42;

public class City {

    String name;    // instance variable
    int population; // instance variable

    static int cityCounter; //class variable

    public City(String name, int population) {
        cityCounter++;
        this.name = name;
        this.population = population;
        System.out.println("\n\tWelcome to " + name);
    }


    public void updateCityPopulation(int newPopulation ){
        this.population = newPopulation;
    }


    public static void printCityCounter(){
        System.out.println("Total city count is " + cityCounter);
    }
}
