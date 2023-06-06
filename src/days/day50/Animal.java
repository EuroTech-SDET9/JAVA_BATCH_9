package days.day50;

public abstract class Animal {

    Animal(String name) {
        this.name = name;
    }

    String name;
    // Cat

    public void sleeping() {
        System.out.println(name + " is sleeping.");
    }

    public abstract void moving();
}

class Kangaroo extends Animal {
    Kangaroo(String name) {
        super(name);
    }

    public void moving() {
        System.out.println("Kangaroos are jumping...");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    public void moving() {
        System.out.println("Walking cats....");
    }
}

class AnimalTest {
    public static void main(String[] args) {
//        Animal animal = new Animal(); can not cteate object
        Cat cat = new Cat("Black");
        cat.moving();
        Kangaroo kangaroo = new Kangaroo("Jumper");
        kangaroo.moving();
        cat.sleeping();
        kangaroo.sleeping();


    }
}
