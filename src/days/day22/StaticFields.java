package days.day22;

public class StaticFields {

    int instanceNum = 100;

    static int staticNum = 100;


    public static void main(String[] args) {

        StaticFields obj1 = new StaticFields();

        System.out.println("obj1.instanceNum = " + obj1.instanceNum);

        System.out.println("obj1.staticNum = " + obj1.staticNum); // dont call with obj, it is belongs to do CLASS

        System.out.println("StaticFields.staticNum = " + StaticFields.staticNum);

        System.out.println("\n///////////////// obj 2 ///////////");

        StaticFields obj2 = new StaticFields();
        obj2.instanceNum = 11;
        StaticFields.staticNum= 15; //   obj2.staticNum = 15;


        System.out.println("obj1.instanceNum = " + obj1.instanceNum);
        System.out.println("obj2.instanceNum = " + obj2.instanceNum);
        System.out.println("obj1.staticNum = " + obj1.staticNum);
        System.out.println("obj1.staticNum = " + obj2.staticNum);
        System.out.println("obj1.staticNum = " + StaticFields.staticNum);


    }
}
