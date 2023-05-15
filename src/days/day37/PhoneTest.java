package days.day37;

public class PhoneTest {


    public static void main(String[] args) {

        Phone phone1 = new Phone("SamsungM3");

        System.out.println("phone1.phoneName = " + phone1.phoneName);
//        phone1.phoneName= "fsds";
//        phone1.phoneId= 123;
//        phone1.isActive=true;
//        phone1.macIP= 11234;
//        phone1.modelNumber= "MC111";
//        phone1.ownerCode= "Admin";
//        phone1.warranty = 2;


        Phone phone2 = new Phone("Iphone 7pro max");
        System.out.println("phone2.phoneName = " + phone2.phoneName);
        System.out.println("phone2.phoneId = " + phone2.phoneId);

        System.out.println("\n/////////////////\n");

        Phone phone3 = new Phone("Honor T20",10002,true,"T20_tr",2,101010,1721114,"tlh43");

        System.out.println("phone3.phoneName = " + phone3.phoneName);
        System.out.println("phone3.phoneId = " + phone3.phoneId);

        System.out.println(phone3);
    }
}
