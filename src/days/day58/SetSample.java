package days.day58;

import java.util.*;

public class SetSample {

    public static void main(String[] args) {

        Set<Integer> objHashset = new HashSet<>(Arrays.asList( 113,-114, 112, 112,  115, -116, 113, 112));
        System.out.println("objHashset = " + objHashset); // obj = [112, 113, 114, 115, 116]



        Set<Integer> objLinkedHashSet = new LinkedHashSet<>(Arrays.asList( 113,-114, 112, 112,  115, -116, 113, 112));
        System.out.println("objLinkedHashSet = " + objLinkedHashSet); //ordered HashSet - iteration order


        Set<Integer> objTreeSet = new TreeSet<>(Arrays.asList( 113,-114, 112, 112,  115, -116, 113, 112));
        System.out.println("objTreeSet = " + objTreeSet);




    }
}
