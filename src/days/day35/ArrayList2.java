package days.day35;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oslo");
        cities.add("Istanbul");
        cities.add(0, "Izmir");
        cities.set(0,"London");
        cities.remove(1);
        System.out.println(cities);
        System.out.println(cities.get(0));
        System.out.println(cities.size());
    }
}
