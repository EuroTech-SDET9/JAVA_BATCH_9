package days.day62;

import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {


        {
            String str = new String("test");

        } // GC!!!

        String str = new String("test");
        str = null;
        System.gc();

        Scanner scanner = new Scanner(System.in);

        scanner.close();


    }


}


class Parent {
    Parent() {

    }

   public void test1(){

    }

}


class Child extends Parent {
    Child() {
        super();
    }


}

class Test {
    public static void main(String[] args) {
        Child c1 = new Child();
    }

}
