package days.day56;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Test START");
        int test1= 10;
        Integer test2= null;    // it will return a db result number  -- positive scenario
                            // or it will be zero if db values delete
                           //  or it will be null if db connection is broke or etc -- bug scenario!!

       // System.out.println(1/0);
//        try {
//            System.out.println("CONNECT to DB");
//            System.out.println("Test 1");
//            System.out.println("Test result is " + test1/test2);
//            System.out.println("Test 2");
//        } catch (ArithmeticException e){
//            System.out.println("DB values are deleted !! Run db data script!!");
//        } catch (NullPointerException e){
//            System.out.println(" TEST FAILED!!");
//            System.out.println(" DB/App Connection lost !!");
//        } finally {
//            System.out.println("Close DB Connection!!");
//        }


        try {
            System.out.println("CONNECT to DB");
            System.out.println("Test 1");
            System.out.println("Test result is " + test1/test2);
            System.out.println("Test 2");
        } catch (ArithmeticException e){
            System.out.println("DB values are deleted !! Run db data script!!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" TEST FAILED!!");
            System.out.println(" DB/App Connection lost !!");
        } finally {
            System.out.println("Close DB Connection!!");
        }

        System.out.println("End of the main method");


    }
}
