package days.day31;

public class ArrayError {

    public static void main(String[] args) {
        int[] numbers = {33,44,55};

        System.out.println(numbers[0]); //33
        System.out.println(numbers[2]); //55
//        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException !!!
    }
}
