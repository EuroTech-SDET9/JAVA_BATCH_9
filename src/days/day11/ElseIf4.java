package days.day11;

public class ElseIf4 {
    public static void main(String[] args) {
        int number = 40;
        if (number > 10) {
            System.out.println("number greater then 10 ");
        }
        if (number > 20) {
            System.out.println("number is greater then 20");
        }
        if (number > 30) {
            System.out.println("number is greater then 30");
        }
        if (number > 50) {
            System.out.println("number is greater then 50");
        }
//   7   10  13 16
        number = 50;
        if (number > 10) {
            System.out.println("number is greater then 10");
        } else if (number > 20) {
            System.out.println("number is greater then 20");
        } else if (number > 30) {
            System.out.println("number is greater then 30");
        } else if (number > 40) {
            System.out.println("number is greater then 50");
        } else if (number > 50) {
            System.out.println("number is greater then 50");
        } else {
            System.out.println("number is greater then 60");
        }
// 21 23 25 27 29 31
    }
}
