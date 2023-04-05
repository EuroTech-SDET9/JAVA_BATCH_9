package days.day16;

public class WhileLoops {
    public static void main(String[] args) {
        int num = 0;
        while (num < 3) {// 0<3->true 1<3->true  2<3->true 3<3->false terminate iteration
            System.out.println(num);//0 1 2
            num++;// 1 2 3
        }
        System.out.println("out of the while loop");
        // 3 2 1 reversed --> decrease
        num = 3;      //3 2 1
        while (num > 0) {
            System.out.println(num);
            num--;
        }
        System.out.println("=============");
        num = 3;
        while (num > 0) {
            num--;// 2 1 0
            System.out.println(num);//2 1 0

        }
        System.out.println("============");
        num = 0;
        while (num > 0) {
            System.out.println("hellooo!");
        }
        System.out.println("-------------");
        System.out.println("do while loop--->>>>>");
        do {
            System.out.println("hellooo!   32");
        } while (num > 0);
        num = 10;   // 15 20 25 30 35 40     55 60
        while (num < 60) {
            System.out.println("num = " + num);
            // num = num + 5;
            num += 5;
        }




    }
}
