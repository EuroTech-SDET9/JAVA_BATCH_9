package days.day6;

public class UnaryOpt {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("number = " + number); // 5

        number ++; // number = number + 1;
        System.out.println("number = " + number); // 6

        ////////////////////////

        number =10;

        number --;
        System.out.println("number = " + number); // 9

        //////////////////////// UNARY PLUS/MINUS OPT ////////////

        int value =  -4 + +4 ;  // - is  unaryminus opt!!



        /////////// ! Unary opt ////////////////

        boolean check = false;
        System.out.println("check = " + check);
        System.out.println("!check = " + !check); // !false -> true
        // if it is NOT  like that... . ....
        System.out.println("check = " + check);  // false
        check = !check;
        System.out.println("check = " + check); //true



        /////////////  POSTFIX //////////////////

        int num = 4;
        int test = num ++;// give num value then increment its value
        int test2 = num;
        System.out.println("test = " + test); // 4
        System.out.println("num = " + num);   // 5
        System.out.println("test2 = " + test2); // 5

        num = 15;
        test = num--;
        System.out.println("test = " + test); // 15
        System.out.println("num = " + num);   // 14

        ////////////  PREFIX //////////////////////
        num = 10;
        test = ++ num; // increment num first then give value

        System.out.println("test = " + test); // 11
        System.out.println("num = " + num);   // 11

        num = 15;
        test = --num; // decrement unary opt
        System.out.println("test = " + test); // 14
        System.out.println("num = " + num);   // 14

        /////////////////////////////////////////////

        int n = 7;

        int data= n++ + ++n - --n + n-- ;
              //= 7   +  9  -  8  + 8

        System.out.println("data = " + data);



        //// TASK-1 /////////////
// Please solve them step by step / operation by operation !!!
        n= 6;

        data = --n / n++ * ++n - --n + ++n;
        System.out.println("data = " + data); // ?????

        //// TASK-2 /////////////

        n= 7;

        data = ++n / 2 + (++n - --n) + ++n;
        System.out.println("data = " + data); // ?????
    }
}
