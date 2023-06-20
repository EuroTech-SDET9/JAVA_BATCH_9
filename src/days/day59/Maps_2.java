package days.day59;

import java.util.LinkedHashMap;

public class Maps_2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> playerAndClubs = new LinkedHashMap<>();
        playerAndClubs.put("Benzema", "Real Madrid");
        playerAndClubs.put("Kevin", "Man City");
        playerAndClubs.put("Marcus", "Man United");
        playerAndClubs.put("Lewando", "Barcelona");
        System.out.println("playerAndClubs = " + playerAndClubs);
        //keeps insertion order
        playerAndClubs.put("Benzema", "Lyon");
        System.out.println("playerAndClubs = " + playerAndClubs);
        //not accepting  duplicate key
        System.out.println("playerAndClubs.get(\"Marcus\") = " + playerAndClubs.get("Marcus"));
        playerAndClubs.remove("Benzema");
        System.out.println("playerAndClubs = " + playerAndClubs);
        System.out.println("playerAndClubs.keySet() = " + playerAndClubs.keySet());
        System.out.println("playerAndClubs.values() = " + playerAndClubs.values());

        for (String name : playerAndClubs.keySet()) {
//            System.out.println("name = " + name);//key
//            System.out.println("playerAndClubs.get(name) = " + playerAndClubs.get(name));
            System.out.println(name + " = " + playerAndClubs.get(name));
        }




    }
}
