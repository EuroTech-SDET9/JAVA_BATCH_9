package days.day59;

import java.util.TreeMap;

public class Maps_3 {
    public static void main(String[] args) {
        TreeMap<String, String> nameCity = new TreeMap<>();
        nameCity.put("Marry", "Madrid");
        nameCity.put("Harry", "London");
        nameCity.put("Ali", "Roma");

        System.out.println("nameCity = " + nameCity);//ascending order
        System.out.println("nameCity.get(\"Marry\") = " + nameCity.get("Marry"));
        System.out.println("nameCity.containsKey(\"Ali\") = " + nameCity.containsKey("Ali"));
        System.out.println("nameCity.containsValue() = " + nameCity.containsValue("London"));
    }
}
