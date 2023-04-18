package days.day22.Animal;

public class Animal {
    // Instance FIELDS - ATTRIBUTES;
    String kind= "empty";
    String skinColour;
    int legs;
    boolean canFly;
    boolean isPet;

    // Class variable
    static int count = 0;

    // Functions - Behaviours
    public void eat() {
        System.out.println("EAT!!");
    }

    public void noise() {
        System.out.println(" NOISE!!");
    }

    public void bite() {
        System.out.println(" BITE!!");
    }

    public void survival() {
        System.out.println("Survival!!");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", skinColour='" + skinColour + '\'' +
                ", legs=" + legs +
                ", canFly=" + canFly +
                ", isPet=" + isPet +
                '}';
    }


}


