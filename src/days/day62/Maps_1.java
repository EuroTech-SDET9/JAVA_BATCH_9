package days.day62;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_1 {
    public static void main(String[] args) {
        // key value -->map
        // namesurname    city ---->       key-->namesurname-->String      city-->value--->String
        //name         grades     key-->String   value --->Integer
        //country-->key  -->string       cities--->value ---->List
        // Parent Class-Interface        ref var=  Object Type
        //Reference Type
        Map<String, String> nameCity = new HashMap<>();
        nameCity.put("Ali", "Izmir");
        nameCity.put("Cetin", "Rize");
        nameCity.put("Ashwini", "Roma");
        System.out.println("nameCity = " + nameCity);
        System.out.println("nameCity.get(\"Ali\") = " + nameCity.get("Ali"));
        System.out.println("nameCity.keySet() = " + nameCity.keySet());
        System.out.println("nameCity.values() = " + nameCity.values());
        nameCity.put("Ali", "London");//will not allow duplicate key
        System.out.println("nameCity = " + nameCity);
        nameCity.put("Veli", "Roma");
        System.out.println("nameCity = " + nameCity);
        System.out.println("nameCity.containsKey(\"Ali\") = " + nameCity.containsKey("Ali"));
        System.out.println("nameCity.containsValue(\"Leicester\") = " + nameCity.containsValue("Leicester"));
        System.out.println("nameCity.size() = " + nameCity.size());
        for (String key : nameCity.keySet()) {
            System.out.println(key + " = " + nameCity.get(key));
        }
        System.out.println("=======================");
        for (Map.Entry n : nameCity.entrySet()) {
            System.out.println(n.getKey() + " " + n.getValue());
        }
        nameCity.remove("Ali");
        System.out.println("nameCity = " + nameCity);
        nameCity.replace("Veli", "Oslo");
        System.out.println("nameCity = " + nameCity);
        nameCity.put("Veli","Bremen");
        System.out.println("nameCity = " + nameCity);




    }
}
