package days.day61;

import java.util.*;

public class Homework2 {


    public static void main(String[] args) {

    }


    public static int findMaxPatient(String[] input) {

        Set<String> setInput = new TreeSet<>(List.of(input));

        if (input.length == 1 || setInput.size() == input.length) {
            return 1;
        } else if (setInput.size() == 1) { // if all item in input are same!!
            return input.length;
        }


        Map<String, Integer> inputMap = new HashMap<>();

        for (String d : input) {
            if (inputMap.containsKey(d)) {   // d is already exist in my inputmap
                inputMap.put(d, inputMap.get(d) + 1); // update d value , get exist value and add 1
            } else {  // d is not exist in container, it is first time we are adding it
                inputMap.put(d, 1);
            }
        }

        int max = Collections.max(inputMap.values());

        for (Map.Entry<String, Integer> entry:inputMap.entrySet()){
            if(entry.getValue().equals(max)){
                System.out.println(entry.getKey()); // to get max number department name!!
            }
        }

        return max;
    }
}
