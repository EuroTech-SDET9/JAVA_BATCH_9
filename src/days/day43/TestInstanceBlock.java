package days.day43;

public class TestInstanceBlock {


    public static void main(String[] args) {
        System.out.println("Start point Main Method!!");

        InstanceBlock object1 = new InstanceBlock();
        System.out.println("\n////////  !!NEW OBJECT!! ///////////\n");
        InstanceBlock object2 = new InstanceBlock();

        System.out.println("End point Main Method!!");
    }
}

// Declare  object1
// Class load first time
// run first static block (if exist)
//then run instance block  (if exist)
//then run const!!! finish initialize of object1

// Declare  object2
// Class load 2. time
// run instance block  (if exist)
//then run const!!! finish initialize of object2