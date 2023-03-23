package days.day8;

public class LogicalOpt {

    public static void main(String[] args) {

        System.out.println("/////////////    && Logical And  /////////////\n");

        int num1 = 15;
        int num2 = 13;
        int num3 = 10;
        int num4 = 33;

        boolean exp1= (num1 != num2);
        boolean exp2= (num3 >= num4);

        boolean logicalAnd = (exp1 && exp2);
        logicalAnd = (num1 != num2) & (num3 >= num4);  // true && false
        logicalAnd = (num1 != num2) && (num3 >= num4);  // true && false
        System.out.println("logicalAnd = " + logicalAnd); //false


        System.out.println("/////////////    // Logical OR   /////////////\n");

        boolean AdamFKey = true;
        boolean AdamRKey = false;
        boolean JennyFKey = false;
        boolean JennyRKey = false;
        
        // Let's create an exp that they will enter the home
        // If there is 2 separate door !!
        // happyLife = FrontDoorAccess  || RearDoorAccess 
        
        boolean happyLife = (AdamFKey || JennyFKey) || (AdamRKey || JennyRKey) ;
        System.out.println("happyLife = " + happyLife);


        // If there is 2 connected door
       // happyLife = FrontDoorAccess && RearDoorAccess
       // happyLife = RearDoorAccess && FrontDoorAccess X not meaningful

        happyLife = (AdamFKey || JennyFKey) && (JennyRKey || AdamRKey);



        System.out.println("/////////////    // Logical NOT   /////////////\n");


        boolean logicalNot = !(AdamFKey || AdamRKey);
        System.out.println("logicalNot = " + logicalNot);

        boolean logicalNot2 = !(3>5 || 4>=2);
        System.out.println("logicalNot2 = " + logicalNot2);





    }
}
