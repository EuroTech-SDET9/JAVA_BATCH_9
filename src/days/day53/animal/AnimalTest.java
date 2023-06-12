package days.day53.animal;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Cat cat = new Cat();
        cat.eat();
        animal.makeNoise();
        cat.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        System.out.println(new String("Hello").toUpperCase());
//        Cat cat1 = new Animal(); error
        new Cat().eat();
        ArrayList<Animal> animalList = new ArrayList();
        animalList.add(animal);
        animalList.add(cat);
        animalList.add(dog);
        animalList.get(0).makeNoise();// animal making noise
        animalList.get(1).makeNoise();// cat is making noise
        animalList.get(2).makeNoise();// dogs barking
        Animal cat5 = new Cat();
        makeSomeNoise(animal);
        makeSomeNoise(cat);
        makeSomeNoise(dog);
        makeSomeNoise(cat5);

    }

    public static void makeSomeNoise(Dog dog) {
        dog.makeNoise();
    }

    public static void makeSomeNoise(Cat cat) {
        cat.makeNoise();
    }

    public static void makeSomeNoise(Animal animal) {
        animal.makeNoise();
    }


}
