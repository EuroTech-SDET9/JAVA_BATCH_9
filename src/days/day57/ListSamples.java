package days.day57;

import java.util.*;

public class ListSamples {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(22);

        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(11);

        System.out.println("list2 = " + list2);

        System.out.println("list1.equals(list2) = " + list1.equals(list2));

        /////////////////
        System.out.println("\n//////// LinkedList ////////\n");

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);

        System.out.println("linkedList = " + linkedList);

        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());




        System.out.println("\n//////// Vector ////////\n");


        Vector<Integer> vector = new Vector<>();

        vector.add(111);
        vector.add(3);
        vector.add(44);

        System.out.println("vector = " + vector);

        vector.addElement(55);

        System.out.println("vector = " + vector);


        System.out.println("\n//////// Stack ////////\n");

        Stack<Character> stack = new Stack<>();

        stack.push('R');
        stack.push('A');
        stack.push('B');
        stack.push('B');
        stack.push('I');
        stack.push('T'); // last in - first out   LIFO!!!
        System.out.println("stack = " + stack);

        System.out.println("stack.pop() = " + stack.pop());  // pop return last element then remove it from list

        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek()); // return the last element, and it will not remove it !!

        System.out.println("stack = " + stack);

    }
}
