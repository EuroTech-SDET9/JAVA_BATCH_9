package days.day19;

public class Prime {
    public static void main(String[] args) {
        outer:
//        for (int n = 0; n < 3; n++) { //0 1 2
//            inner:
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);//0 1 2 3
//                if (i == 3) {
//                    break ;
//                }
//                //    System.out.println(i);//0 1 2
//            }
//        }
        for (int i = 0; i < 10; i++) {
//            System.out.println(i);//
            if (i == 3) {
                continue;
            }
            System.out.println(i);//
        }
        int number = 9;// prime or not
        //  1   11
        // 2 3 4 5  6 7 8  9%2 9%3 9%4
//        if (number % 2 == 0 && number % 3 == && number%4==0&& number%5)
        boolean isPrime = true;
        for (int n = 2; n < number; n++) {
            System.out.println("n = " + n);
            if (number % n == 0) {// 11%2  11%3 11%4 11%5 11%6 11%7 11%8 11%9 11%10
                //   15   % 3==0
                // 15% 4
                // 15% 5 ==0
//                System.out.println("number is not prime");
                isPrime = false;
                break;
            }
//            } else if (number%n!=0) {
//                System.out.println("number is prime");
//            }
//            else {
//                System.out.println("number is prime");
//            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // do-while &&  while
        //
//        *
//        ***
//        *****
//        ******

        //            *
//                  ***
//                *****
//              *******






    }
}
