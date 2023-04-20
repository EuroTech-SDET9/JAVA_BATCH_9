package days.day22.Animal;

public class AnimalTEST {

    public static void main(String[] args) {

        // cat
        // dog
        // bird
        // snake
        System.out.println(" //////// Create 1. object: CAT ");

        Animal cat = new Animal();
        Animal.count++;
        cat.kind = "Land animals";
        cat.skinColour = "White";
        cat.legs= 4;
        cat.canFly = false;
        cat.isPet = true;
        cat.eat();

        System.out.println("cat.kind = " + cat.kind);
        System.out.println("cat.skinColour = " + cat.skinColour);
        System.out.println("cat.legs = " + cat.legs);
        System.out.println("cat.canFly = " + cat.canFly);
        System.out.println("cat.isPet = " + cat.isPet);


        System.out.println(" //////// Create 2. object: dog ");

        Animal dog = new Animal();
        Animal.count++;
        System.out.println("dog.kind = " + dog.kind);
        dog.kind = "Land animals";
        dog.skinColour = "Black";
        dog.legs= 4;
        dog.canFly = false;
        dog.isPet = true;
        System.out.println("Dog Fields : " + dog.toString());

        //......Static........


        System.out.println("Animal.count = " + Animal.count);  // access static fields with CLASS name !!
//        System.out.println("Animal.skinColour = " + Animal.skinColour); //!!! NO skinColour is instance variable

        System.out.println(" \n//////// Create 3. object: bird ");
        Animal bird = new Animal();
        Animal.count++;
        System.out.println("bird.count = " + bird.count);
    //    bird.count=100;

        Animal snake = new Animal();
        Animal.count++;
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("snake.count = " + snake.count);

    }
}
