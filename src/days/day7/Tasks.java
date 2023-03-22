package days.day7;

public class Tasks {


    public static void main(String[] args) {
        //TASK-2


        int n = 3;
        int y = ++n - (--n * 2);   // 4   -  (3 * 2)  = -2 ;


                                  // ++n  -  (2 * 2)
                                  // 3     -    4    = -1 ;

                System.out.println(y);


                //TASK -3
        double perimeter, area , radius= 5.5;

        System.out.println("Math.PI = " + Math.PI);
        area= Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


        byte hour;

        ////////


        System.out.println("(1.0 == 1 ) = " + (1.0 == 1));
    }
}
