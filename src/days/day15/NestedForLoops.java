package days.day15;

public class NestedForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {// 0 1---> 2 times

            System.out.println("hello");

        }

        for (int n = 0; n < 3; n++) {// 0 1 2--->3 times

            System.out.println("n = " + n);

        }

        for (int i = 0; i < 2; i++) {// 0 1---> 2 iteration  outer for loop

            System.out.println("hello");// hello
            for (int n = 0; n < 3; n++) {// 0 1 2--->3 times  inner loop

                System.out.println("n = " + n);// 0 1 2

            }

        }
        //i =0
        // hello
        // 0
        //1
        //2
        //i=1
        //hello
        //0
        //1
        //2
        System.out.println("==================");
        for (int n = 0; n < 2; n++) {//outer loop

            System.out.println(" before inner loop ");
            for (int l = 0; l < 2; l++) {//inner loop
                System.out.println(l);
            }
            System.out.println("after inner loop");
        }
        System.out.println("out of the outer loop");
        //  before inner loop
        //  0
        //  1
        //  after inner loop
        //  before inner loop
        //  0
        //  1
        //  after inner loop
        //  out of the outer loop

        for (int n = 0; n < 2; n++) {//outer loop

            for (int l = 0; l < 4; l++) {//inner loop
                System.out.print(n);// 0000
                // 1111
            }
            System.out.println();// enter
        }
        System.out.println("=========================");

        for (int n = 0; n < 4; n++) {//outer loop

            for (int l = 0; l < 4; l++) {//inner loop
                System.out.print(l);
                //0123
                //0123
                //0123
                //0123

            }
            System.out.println();// enter
        }
        for (int n = 0; n < 3; n++) {//outer loop

            for (int l = 0; l < 4; l++) {//inner loop
                System.out.print("*");
            }
            System.out.println();// enter
        }
        int counter = 0;
        for (int n = 0; n < 2; n++) {//outer loop

            System.out.println("good evening!!!");
            counter++;
            for (int l = 0; l < 4; l++) {//inner loop
                System.out.print(0); //0000
                //                     0000

            }
            System.out.println();// enter

        }
        System.out.println("counter = " + counter);

    }
}
