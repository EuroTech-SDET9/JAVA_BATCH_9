package days.day55;

public class HandleExceptionSample {

    public static void main(String[] args) {

        System.out.println("Test START");
        try {
            System.out.println("CONNECT to DB");
            System.out.println("Test 1");
            System.out.println("Test 2");
            String test=null;
            System.out.println("test.length() = " + test.length());
            System.out.println(1 / 0); // Arithmetic Exception
            System.out.println("Test 3");
        } catch (ArithmeticException e ){  // must be same or parent of exception!!
            // != ArrayIndexOutOfBoundsException | NullPointerException
            // = Exception | RuntimeException | ArithmeticException
            System.out.println(" EXCEPTION WAS HANDLED!!");
            System.out.println(" NO WORRY BE HAPPY GO ON TEST!!");
        } catch (NullPointerException e){
            System.out.println(" THERE IS BUGGGG!!!!! DB CONNECTION BROKEN!!!");
        } finally{
            System.out.println("CLOSE DB CONNECTION");
        }

        System.out.println("Test 4");
  //      System.out.println(1 / 0);
        System.out.println("Test END");

    }
}
