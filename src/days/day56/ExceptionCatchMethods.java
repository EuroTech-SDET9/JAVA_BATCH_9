package days.day56;

public class ExceptionCatchMethods {

    public static void main(String[] args) {

        System.out.println("test1");
        try {
            System.out.println(1/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("ERROR EXIST!!!!!!!  e.getMessage() = " + e.getMessage());
            System.out.println("e.getLocalizedMessage() = " + e.getLocalizedMessage());
        }

        System.out.println("test2");
        System.out.println("END OF THE MAIN METHOD");

    }
}
