package days.day56;

public class HandleMultipleExp {

    public static void main(String[] args) {


        System.out.println("Test start");
        int test1= 10;
        Integer test2= null;

        try {
            System.out.println("Test 1");
            System.out.println("Test result is " + test1 / test2);
            System.out.println("Test 2");
//        } catch (ArithmeticException e){
//            System.out.println("No worries, go on and finish tests!!!");
//        } catch (NullPointerException e){
//            System.out.println("No worries, go on and finish tests!!!");
        }catch (ArithmeticException | NullPointerException e ) {
            System.out.println("No worries, go on and finish tests!!!");
        }


        System.out.println("FINISH TESTS!!");


//        int x =20;
//        if(x>10){
//            System.out.println("X is bigger then 1");
//        } else if(x>5){
//            System.out.println("X is bigger then 1");
//        }
//
//        if(x>10 || x>5){
//            System.out.println("X is bigger then 1");
//        }



    }
}
