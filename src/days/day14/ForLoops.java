package days.day14;

public class ForLoops {

    public static void main(String[] args) {
        //        1     2 cond  3 increment-decrement
        for (int i = 0; i < 3; i++) {
            System.out.println(i);// body   4
            //  part 1  i=0  --->    0<3  ----> true----> part 4   print value of the i (0)-----> increment part 3 after increment value of the i is now 1
            //          i=1   -----> 1<3 -----> true ---->part 4-----> print value of the i (1)--> increment part value of the i is 1, after increment value is 2
            //              i=2    ----> 2<3 ------> true ----> part 4 -->print 2---> increment part value of the i is 2 increase value and i is now 3
        }
        System.out.println("ouf of the for block");
        //0
        //1
        //2

        for (int n = 0; n <= 3; n++) {//   if n is 0--> n=1-->n=2-->n=3-->true n=4--->false
            System.out.println("n = " + n);
        }
        // 0
        //1
        //2
        //3
        System.out.println("----------------");
        for (int i = 5; i < 8; i++) {
            System.out.println("i = " + i);
        }
        //5
        //6
        //7
        System.out.println("--------------------");
        // print your names 5 times
        for (int i = 1; i <= 5; i++) {
            //   1 2 3 4 5
            System.out.println("Hello");
            System.out.println(i);
        }
        //Hello
        //1
        //Hello
        //2
        //Hello
        //3
        //Hello
        //4
        //Hello
        //5
        for (int i = 0; i < 3; i++) {
            //  0 1 2
            System.out.println("Hello");
            System.out.println(i);
        }
        // Hello
        // 0
        //Hello
        // 1
        // Hello
        // 2
        System.out.println("========================");
        //        1      2      3
        for (int n = 1; n < 4; n++) {
            System.out.println(n);//4
        }
        // if n=1  part 1   part 2    part 4  print 1   part 3
        //                  part 2    part 4  print 2   part 3
        //                 part 2     part 4  print 3  part 3
        //                 part 2  ---> false

        int number = 10;
        number++;// 11
        System.out.println("number = " + number);//11
        number--;//10
        System.out.println("number = " + number);//10

        number = number + 2;// 12
        number += 2;// number = number + 2     number =     12 + 2
        System.out.println("number = " + number);// 14

        for (int n = 0; n < 10; n += 2) {// n=0+2--> n is 2   n = 2+2  n is 4 n= 4 + 2 n is  6    n = 6+ 2 n is 8  n = 8+2 n is 10
            System.out.println("n = " + n);
        }
        //   0
        //   2
        //   4
        //   6
        //   8

        // print even numbers between 20-41
        System.out.println("=================");
        for (int i = 20; i < 41; i += 2) {// 20 22 24 26........38,40
            System.out.println("i = " + i);
        }

        for (int i = 20; i < 41; i++) {
            if (i % 2 == 0) {
                System.out.println(i+" is even number");
            }else {
                System.out.println(i+" is odd number");
            }
        }


    }

}
