package days.day54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Printer {

    void print(String str);

}

class HP implements Printer {


    @Override
    public void print(String s) {
        System.out.println(s);
    }
}

class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new HP();
        printer.print("Hello World!!!");
//        Printer printer1 = new Printer();

        Printer printer1 = new Printer() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        printer1.print("NBA Champ Denver Nuggets");
        printer1.print("Man City Champ as well......");
        //short way
        Printer printer2 = (s) -> System.out.println(s);
        printer2.print("Helloo!!!!!");
        printer2.print("Helloo Selenium!!!!");

        int[] numbers = {1, 5, 10, 15, 25};
        Arrays.stream(numbers).forEach(System.out::println);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(5);
        list.add(30);
        list.add(50);
        list.add(1);
        list.forEach(System.out::println);

        Consumer consumer = (a) -> System.out.println(a);
        consumer.accept(20);
        System.out.println("=================");
        list.forEach(consumer);
        System.out.println("=============");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 20) {
                System.out.println(list.get(i));
            }
        }
        System.out.println("==========");
        list.stream().filter(x -> x < 20).forEach(System.out::println);
        System.out.println("even numbers");
        list.stream().filter(element -> element % 2 == 0).forEach(System.out::println);
        List<Integer> oddNums = list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        System.out.println("odd numbers");
        System.out.println("oddNums = " + oddNums);

        // 10 20 30 50 15 5 1
        // 15 25 35 55 20 10 6
        list.stream().map(n -> n + 5).forEach(System.out::println);
        List<Integer> collect = list.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println("collect = " + collect);
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello World");
        words.add("Hello Java");
        words.add("Hello Selenium");
        words.stream().map(x->x.toUpperCase()).forEach(System.out::println);
        //Real Madrid , Borussia Dortmund,  Werder Bremen

    }


}



