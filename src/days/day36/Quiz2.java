package days.day36;

public class Quiz2 {
    public static void main(String[] args) {
        int a = 14;
        int b = 4;
        boolean x = (a > b) ? true : false;
        System.out.println(x);
        for (int i = 0; i > -3; i--) {//  0   -1   -2

        }

        a = 0;
        b = 0;
        for (int i = 0; i <= 3; i++) {
            a++;//1 2 3 4
            if (i == 2) {
//                i = 4;
                continue;
            }
            b++;//1 2 3
        }
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 4; i++) {

            if (i == 2) {
//                return;
                break;
            }
            System.out.println(i);//0  1
        }


        System.out.println("hello");
        int number = 10;
        switch (number) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
        }


    }
}
