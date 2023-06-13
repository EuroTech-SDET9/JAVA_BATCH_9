package days.day54;

import java.util.ArrayList;
import java.util.Random;

public class Names {

    //create a method returns Arraylist  String , names
    public String randomName() {
        Random random = new Random();
        int index = random.nextInt(namesList().size());
        return namesList().get(index);
    }

    public void printRandomName() {
        System.out.println(randomName());
    }

    public ArrayList<String> namesList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kursat");
        names.add("Mustafa");
        names.add("Georges");
        names.add("Busra");
        names.add("Erkan");
        names.add("Mihail");
        names.add("Meral");
        names.add("Emrah");
        names.add("Seyfettin");
        names.add("Yavuz");
        names.add("Faruk");
        return names;
    }

    public void printNamesList() {
        System.out.println("namesList() = " + namesList());
    }

    public boolean checkList(String name) {
        boolean contains = namesList().contains(name);
        System.out.println("contains = " + contains);
        return namesList().contains(name);
    }

}
