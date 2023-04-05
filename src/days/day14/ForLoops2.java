package days.day14;

public class ForLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ) {

            System.out.print(i + " ");// 0 1 2 3 4

            i++;
        }
        System.out.println("=====================");
        System.out.println("=====================");
        for (int i = 0; i < 5; ) {
            i++;//1 2 3 4 5
            System.out.print(i + " ");// 1  2  3 4 5
        }

        System.out.println();
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i++) {
            i++;//1 3 5
            System.out.print(i + " ");// 1  3 5
        }

        System.out.println();
        System.out.println("=====================");
        for (int i = 3; i > 0; i--) {
            System.out.println("i = " + i);// 3 2 1
        }
//   starting point   3     end point  0  decrease the value
        for (int i = 3; i > 0; i--) {
            System.out.println("i = " + i);// 3 2 1
        }
        // 100  to 50 count 3 by 3 --->100 97 94 91 88 85 82 .........55 52

        for (int i = 100; i > 50; i -= 3) {
            System.out.println(i);
        }

        // 2 * 1  2
        // 2 * 2  4
        // 2 * 3  6
        // 2 * 4  8
        // 2 * 5  10
        // 2 * 6  12
        // 2 * 7  14
        // 2 * 8  16
        // 2 * 9  18
        // 2 * 10  20
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
//            System.out.println(2 * 2);
//            System.out.println(2 * 3);
//            System.out.println(2 * 4);
        }


        for (int i = 1; i <= 10; i++) {

            System.out.println("2 * " + i + " = " + (2 * i));
        }
        int l = 0;
        for (; l < 3; l++) {
            int n = 5;
            System.out.println("l = " + l);// 0 1 2
        }


        System.out.println("l = is out of the block " + l);// 3
        for (; l < 5; l++) {
            System.out.println("l = " + l);//3  4
        }

        System.out.println("l = " + l);//5

        for (double d = 0.1; d < 0.6; d += 0.1) {// 0.1 0.2 0.3 0.4 0.5
            System.out.println("double ");// 5 times
            System.out.println("d = " + d);
        }
    }
}
