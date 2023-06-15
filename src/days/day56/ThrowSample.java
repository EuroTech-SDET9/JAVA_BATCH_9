package days.day56;

public class ThrowSample {

    public static void main(String[] args) {

        System.out.println("MAIN METHOD  ");
        OutOfMemoryError errorObject = new OutOfMemoryError();
//        throw errorObject ;

        throw  new ArrayIndexOutOfBoundsException();

//        System.out.println("END of MAIN METHOD  ");
    }
}
