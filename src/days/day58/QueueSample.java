package days.day58;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {


    public static void main(String[] args) {

        Queue<Integer> obj = new PriorityQueue<>();

        obj.add(11);
        obj.add(-11);
        obj.add(0);
        obj.add(22);
        obj.add(-33);


        System.out.println("obj = " + obj);

        System.out.println("obj.peek() = " + obj.peek());

        System.out.println("obj = " + obj);

        System.out.println("obj.poll() = " + obj.poll());

        System.out.println("obj = " + obj);

        System.out.println("obj.peek() = " + obj.peek());


        ///////////////////////////


        Deque<Integer> obj2 = new ArrayDeque<>();

        ///////////////////////////
        //         Start point : 1   51, 60 ,       18,20                       End point : 10

        // age >50 priority

        obj2.addFirst(51);
        obj2.addLast(18);
        obj2.addLast(20);
        obj2.addFirst(60);
        obj2.addFirst(70);
        obj2.addFirst(50);

        System.out.println("obj2 = " + obj2);

        System.out.println("obj2.peek() = " + obj2.peek());

        obj2.removeFirst();

        System.out.println("obj2 = " + obj2);
        obj2.removeLast();

        System.out.println("obj2 = " + obj2);
    }
}
