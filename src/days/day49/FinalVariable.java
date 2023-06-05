package days.day49;

public class FinalVariable {

    final int insVariable;   // final int insVariable = 2  -> 1. Way

    //public FinalVariable(int insVariable) {
      //  this.insVariable = insVariable;  // 2. Way
    //}

    {
        insVariable=2;   // 3. Way
    }

//    static {
//        insVariable=2;   // NO. cause comp ERROR!! do not call non static
                          // data fields in static fields...
//    }

    public static void main(String[] args) {

        final int test; // Local Variable
        test=3;
        System.out.println("test = " + test);

        // test =4; throw compilation errors


    }
}
