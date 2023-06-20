package days.day59;

import days.day53.player.BasketBallPlayer;
import days.day53.player.FootBallPlayer;
import days.day53.player.Player;

import java.util.ArrayList;
import java.util.LinkedList;

public class Generics<Anything> {

    public void print(Anything anything) {
        System.out.println("anything = " + anything);
    }

}

class GenericTest {
    public static void main(String[] args) {
        Generics<Integer> generics = new Generics<>();
        generics.print(100);
        Generics<String> generics1 = new Generics<>();
        generics1.print("Bye Bye Java Lessons!!!!.....");
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        ArrayList<String> listOfNames = new ArrayList<>();
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Ten");
        list.add(10.50);
        list.add(100);
        list.add("Hello");
        int number1 = (int) list.get(0);
//        if (list.get(0) < 20) {
//
//        }
        print(10);
        print("Hello");

        Player player = new BasketBallPlayer();
        Player player1 = new FootBallPlayer();
        ArrayList<Player> playerList = new ArrayList<>();

    }

    public static <Type> void print(Type t) {
        System.out.println("t = " + t);
    }

}
