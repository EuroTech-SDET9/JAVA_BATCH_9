package days.day56;

public class ExceptionTypes {

    public static void main(String[] args) {

        //      System.out.println(1 / 0);  // Unchecked type exception

        pause(2);  // check type exception

    }


    public static void pause(int second)  {  // throws InterruptedException

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
