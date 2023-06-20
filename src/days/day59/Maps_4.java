package days.day59;

import java.util.*;

public class Maps_4 {
    public static void main(String[] args) {
        //   HashMap<String,Integer>studentNums=new HashMap<>();
        Map<String, Integer> studentNums = new HashMap<>();
        studentNums.put("Ali", 528);
        Map<String, String> playerClubs = new LinkedHashMap<>();
        playerClubs.put("Salah", "Liverpool");
        Map<String, Integer> numbers = new TreeMap<>();

        ArrayList<Map<String, Integer>> listOfMaps = new ArrayList<>();
        listOfMaps.add(studentNums);
        listOfMaps.add(numbers);

    }
}
