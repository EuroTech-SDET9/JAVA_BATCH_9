package days.day57;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(11);

        System.out.println("arrayList = " + arrayList);

//        arrayList.clear();
//        System.out.println("arrayList = " + arrayList);

        System.out.println("arrayList.contains(22) = " + arrayList.contains(22));

        System.out.println("arrayList.hashCode() = " + arrayList.hashCode());

        arrayList.add(44);
        arrayList.remove(3);
        Integer intObj = 11;
        arrayList.remove(intObj);  // (Integer)11
        System.out.println("arrayList = " + arrayList);

        System.out.println("arrayList.size() = " + arrayList.size());



    }
}
