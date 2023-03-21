package days.day5;

public class ReferenceTypes {
    public static void main(String[] args) {
        System.out.println("Hello World!!!!");
        String city;
        city = "Istanbul";
        System.out.println("city = " + city);
        city = "madrid";
        System.out.println("city = " + city);
        city = "London";
        String capitalCity = city;
        System.out.println("capitalCity = " + capitalCity);
        String capital2 = "Roma";
        System.out.println("capital2 = " + capital2);



    }
}
