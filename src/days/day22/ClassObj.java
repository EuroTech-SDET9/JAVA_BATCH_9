package days.day22;

public class ClassObj {

    int num2 = 11;  // INSTANCE VARIABLES (NON STATIC FIELDS)
    int invNumber; // Instance variable

    static int count; // Global Class variable!!! STATIC!!

    public void test() {
        int number = 10;  // LOCAL VARIABLES
        number = num2;
        num2= 2;
    }

    public void test2() {
        int number2;  // LOCAL VARIABLES
        System.out.println(num2);
      //  System.out.println(number2);
    }

    public  void createInvoice(){
     invNumber= 12300;  //12300 is auto generated number which is coming from UI
     int invNumber= 12300; // --> LOCAL VARIABLE!!!
        //
    }

    public  void verifyInvoiceProcess(){
        // need to use inv number that I created !!
        System.out.println("invNumber = " + invNumber);
    }

//    public static void main(String[] args) {
//        createInvoice();
//        verifyInvoiceProcess();
//    }
}
