package days.day59;

import java.util.*;


public class Map_5 {
    public static void main(String[] args) {
        // create a map as key type String value type List
        //  Club   Players
        //  String  List

        Map<String, List<String>> clubsAndPlayers = new HashMap<>();
        String club = "Man City";
        List<String> manCityPlayers = new ArrayList<>();
        manCityPlayers.add("Marcus");
        manCityPlayers.add("Jack");
        manCityPlayers.add("Gundogan");
        clubsAndPlayers.put("Man City", manCityPlayers);

        List<String> liverpoolPlayers = new ArrayList<>();
        liverpoolPlayers.add("Salah");
        liverpoolPlayers.add("Firmino");
        liverpoolPlayers.add("Arnold");

        clubsAndPlayers.put("Liverpool", liverpoolPlayers);

        System.out.println("clubsAndPlayers = " + clubsAndPlayers);

        //Marcus Jack Gundogan
        System.out.println("clubsAndPlayers.get(\"Man City\") = " + clubsAndPlayers.get("Man City"));

        System.out.println("clubsAndPlayers.keySet() = " + clubsAndPlayers.keySet());
        System.out.println("clubsAndPlayers.get(\"Liverpool\") = " + clubsAndPlayers.get("Liverpool"));


        List<Integer> numbers = new ArrayList<>();
        List<List<String>> clubPlayers = new ArrayList<>();
        clubPlayers.add(manCityPlayers);
        clubPlayers.add(liverpoolPlayers);
        System.out.println("clubPlayers = " + clubPlayers);

    }
}
