package days.day47.second;

import days.day47.first.Person;

public class Worker extends Person {
    public void eating() {
        System.out.println("Eating baklava.");
    }


    public void working() {
        System.out.println(super.name + " is working");
        System.out.println(name + " is working");
//        super.age = 25;
        city = "Izmir";
        eating();

    }
}
