package days.day62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(100);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(70);
        numbers.add(45);
        //numbers greater then 40
        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        ArrayList<Integer> over40 = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 40) {
                // System.out.println(numbers.get(i));
                over40.add(numbers.get(i));
            }
        }
        System.out.println("over40 = " + over40);
        System.out.println("==========");
        //  ()->
        numbers.stream().filter(n -> n > 40).forEach(System.out::println);
        List<Integer> collect = numbers.stream().filter(n -> n > 40).collect(Collectors.toList());
        System.out.println("collect.equals(over40) = " + collect.equals(over40));
        System.out.println("=======================");
        numbers.stream().map(x -> x / 10).forEach(System.out::println);

        List<String> clubs = Arrays.asList("Real Madrid", "Werder Bremen", "Inter Milano", "Borussia Dortmund");
        List<String> cities = new ArrayList<>();
        //elements length is over then 15
        for (int i = 0; i < clubs.size(); i++) {
            if (clubs.get(i).length() > 15) {
                System.out.println("clubs.get(i) = " + clubs.get(i));
            }
            cities.add(clubs.get(i).split(" ")[1]);
        }
        clubs.stream().filter(n -> n.length() > 15).forEach(System.out::println);
        System.out.println("cities = " + cities);

        clubs.stream().map(str -> str.split(" ")[1]).forEach(System.out::println);
        List<String> collectCities = clubs.stream().map(str -> str.split(" ")[1]).collect(Collectors.toList());
        System.out.println("collectCities.equals(cities) = " + collectCities.equals(cities));
        List<List<String>> allTheList = new ArrayList<>();
        allTheList.add(clubs);
        allTheList.add(cities);
        allTheList.add(collectCities);
        System.out.println("allTheList = " + allTheList);



    }
}
