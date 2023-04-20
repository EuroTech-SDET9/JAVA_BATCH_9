package days.day23;

public class Phone {

    int serialNumber=10000;  // instance variable
    boolean hasCord;  // instance variable  -> belongs to the obj / instance!!!

    static int count; // class variable  -> belongs to the CLASS
    public static int count2; // global variable


    public void call() {
        System.out.println("CALLING.....");
    }

    public void ring() {
        System.out.println(" RING!!!!!");
    }
}

class PhoneTest {

    public static void main(String[] args) {
        Phone mobilePhone = new Phone();

        mobilePhone.serialNumber = 10001;
        System.out.println("mobilePhone.serialNumber = " + mobilePhone.serialNumber);

        mobilePhone.hasCord= false;
        System.out.println("mobilePhone.hasCord = " + mobilePhone.hasCord);
        mobilePhone.count++;  // which count!?  Phone.count=1!!
        System.out.println("mobilePhone.count = " + mobilePhone.count);  // it will bring Phone.count value!!
        ///////////

        Phone cordPhone = new Phone();
        cordPhone.serialNumber = 10002;
        System.out.println("cordPhone.serialNumber = " + cordPhone.serialNumber);
//        System.out.println("Phone.serialNumber = " + Phone.serialNumber);
        cordPhone.hasCord = true;
        System.out.println("cordPhone.hasCord = " + cordPhone.hasCord);

        cordPhone.count++;
        System.out.println("Phone.count = " + Phone.count); // this is the correct way to call static class variable !!!


    }
}
