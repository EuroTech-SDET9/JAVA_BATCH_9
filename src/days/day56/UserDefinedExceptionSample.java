package days.day56;

public class UserDefinedExceptionSample {

    public static void main(String[] args) {
        try {
            throw new MyLovelyException(); // UserDefinedException are CHECKED TYPE exception!!
        } catch (MyLovelyException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
class MyLovelyException extends Exception {

    @Override
    public String getMessage() {
        return "yeah it is my lovely exception!!! ";
    }
}
