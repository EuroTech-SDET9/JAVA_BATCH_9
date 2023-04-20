package days.day23;

public class ReviewWeek5_6 {


    public static void main(int asdasdsa) {

    }



    public static void main(String[] args) {
        label1:
        for (int i = 0; i < 5; i++) {   // itar
            System.out.print("*");

            label2:
            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    break label1;
                }
                System.out.print(" _ ");

                label3:
                for (int k = 0; k < 3; k++) {
                    System.out.print("|");

                }
            }
            System.out.println("*");
        }

        System.out.println("\n\n///////////// METHODS ////////////////\n");

        testMethod();

        System.out.println("After METHOD!!!!");

        pauseCode(3);

        System.out.println("!!!!!! WAITED 3 SEC!!!!");

        test1(1);

    }

    public static void testMethod(){
        System.out.println("!!!!!!TEST!!!!!!!");
    }

    public static void pauseCode(int seconds){
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int test1(int value){
        System.out.println("int return type");
        return -1;
    }

    public static double test1(double value){
        System.out.println("int return type");
        return -1;
    }


}

class Batch9{

    public static void main(String[] args) {

    }

    public void test(){

    }

}
