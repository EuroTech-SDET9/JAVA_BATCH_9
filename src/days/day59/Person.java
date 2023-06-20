package days.day59;

import java.util.HashMap;
import java.util.Map;

public class Person {
    public static void main(String[] args) {
        //to store and manipulate  key-value pairs
        // names and ages   key--->names value--->ages   String Integer
        //       Key     Value
        HashMap<String, Integer> namesAndAges = new HashMap<>();
        namesAndAges.put("Ali", 25);
        namesAndAges.put("Veli", 40);
        namesAndAges.put("Ayse", 20);
        namesAndAges.put("Fatma", 18);
        System.out.println("Veli = " + namesAndAges.get("Veli"));
        System.out.println("Ayse = " + namesAndAges.get("ayse"));
        System.out.println("Ayse = " + namesAndAges.get("Ayse"));
        String name1 = "Ronaldo";
        int age1 = 38;
        namesAndAges.put(name1, age1);
        namesAndAges.put("Ali", 15);
        System.out.println("namesAndAges = " + namesAndAges);
        namesAndAges.put("David", 40);
        System.out.println("namesAndAges = " + namesAndAges);
        //will not keep insertion order
        namesAndAges.remove("Fatma");
        System.out.println("namesAndAges = " + namesAndAges);
//        namesAndAges.clear(); will remove all the key and values
        System.out.println("namesAndAges = " + namesAndAges);
        System.out.println("namesAndAges.containsKey(\"Fatma\") = " + namesAndAges.containsKey("Fatma"));
        System.out.println("namesAndAges.containsKey(\"David\") = " + namesAndAges.containsKey("David"));
        System.out.println("namesAndAges.containsValue(40) = " + namesAndAges.containsValue(40));
        System.out.println("namesAndAges.containsValue(10) = " + namesAndAges.containsValue(10));
        namesAndAges.putIfAbsent("Messi", 35);
        System.out.println("namesAndAges = " + namesAndAges);
        namesAndAges.putIfAbsent("Veli", 30);
        System.out.println(namesAndAges);
        namesAndAges.put("Veli", 30);
        System.out.println(namesAndAges);
        System.out.println("namesAndAges.keySet() = " + namesAndAges.keySet());
        for (String key : namesAndAges.keySet()) {
            System.out.println("key = " + key);
            System.out.println("namesAndAges.get(key) = " + namesAndAges.get(key));
        }
        System.out.println("namesAndAges.values() = " + namesAndAges.values());

        for (Map.Entry<String, Integer> s : namesAndAges.entrySet()) {
//            System.out.println("Key = " + s.getKey());
//            System.out.println("value = " + s.getValue());
            System.out.println(s.getKey() + " = " + s.getValue());
        }


//               Key     Value
        HashMap<String, String> namesSurnames = new HashMap<>();


    }
}
