package days.day32;

import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {
        String city4 = "Rize";
        //cities String  5
        String[] cities = {"Oslo", "London", "Istanbul", "Roma", "batangas", city4};
        //                   0        1          2          3        4         5   index numbers
        String city2 = "Mardin";
        System.out.println(cities[0]);
        cities[5] = city2;
        String s = Arrays.toString(cities);
        System.out.println("s = " + s);

        for (String city : cities) {
            System.out.println("city = " + city);
        }
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
//1
        String capital = "Madrid";
        System.out.println(Arrays.binarySearch(cities, capital));
        capital = "Izmir";
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.binarySearch(cities, capital));
//2
        System.out.println(Arrays.toString(cities).contains(capital));
        //3
        capital = "Izmir";
        int index = 0;
        for (String city : cities) {
            if (city.equals(capital)) {
                System.out.println(capital + " is in the array.");
                break;
            }
            index++;
        }
        System.out.println("index = " + index);
        if (index == cities.length) {
            System.out.println(capital + " is not in the array.");
        } else {
            System.out.println("index of the " + capital + " is " + index + " . ");
        }
    }
}
