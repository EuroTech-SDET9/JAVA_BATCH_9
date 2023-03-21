package days.day5;

public class Variables2 {
    public static void main(String[] args) {
        int num = 100;
        num = 500;
        System.out.println("num = " + num);//500
        int number;
        number = num;//500
        System.out.println("number = " + number);// 500
        num = 400;
        System.out.println("num = " + num);// 400
        System.out.println("number = " + number);//500
        int number5 = num;//400
        System.out.println("number5 = " + number5);//400
        num = 200;
        System.out.println("num = " + num);// 200
        System.out.println("number = " + number);// 500
        System.out.println("number5 = " + number5);//  400

        // num    number    number5

    }
}
