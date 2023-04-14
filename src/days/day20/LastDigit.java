package days.day20;

public class LastDigit {
    public static void main(String[] args) {
        int number = 22291;
        System.out.println(number % 10);
        System.out.println(lastDigit(11, 35));
        System.out.println( lastDigit(112, 32));
    }

    // 2 numbers check the last digits are same or not
    // lastDigit()
    // if the last digits are same return true else false
    public static boolean lastDigit(int num, int num2) {
        boolean result = true;
        if (num % 10 == num2 % 10) {
            System.out.println("last digits are same");
            result = true;
        } else {
            System.out.println("last digits are different");
            result = false;
        }
        return result;
    }


}
