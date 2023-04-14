package days.day19;

public class methods_4 {
    public static void main(String[] args) {

        printNumber(10);
        printName("Messi");
        printNumber(50);
        printName("Ronaldo");
        String player = "Zidane";
//        printName(100); different data types, errorr!!!
        printName(player);

        System.out.println("Messi");//repititive statements
        System.out.println("Ronaldo");
        System.out.println("Zidane");

    }

    public static void printName(String name) {//function of this method printing names
        System.out.println("name = " + name);
    }


    public static void printNumber(int num) {// function of this method printing numbers

        System.out.println(num);
    }
}
