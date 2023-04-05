package days.day16;

public class NestedDoWhile {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        do {//outer loop

            do {// inner loop
                System.out.println("hello");
                n++;
            } while (n < 3);
            System.out.println("after inner loop");
            i++;//1
        } while (i < 2);

        //hello
        //hello
        //  hello
        // after inner loop
        //hello
        // after inner loop
        System.out.println("===================");
        i = 0;
        n = 0;
        do {//outer loop

            do {// inner loop
                System.out.println("hello");
                n++;
            } while (n < 3);
            System.out.println("after inner loop");
            i++;//1
            System.out.println("n = " + n);
            n = 0;
        } while (i < 2);


        // 2 * 1      3*1     4*1
        // 2 * 2      3*2     4*2
        // 2 * 3      3*3     4*3

        for (int l = 2; l < 10; l++) {//outer loop

            for (i = 1; i < 10; i++) {
//                                 2  *  1   =
                System.out.println(l+"*"+i+" ="+l * i);
                //  System.out.println(2 * 1);
            }
        }
    }
}
