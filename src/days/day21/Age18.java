package days.day21;

public class Age18 {

    //if age is over 18 return true else return false
    public static void main(String[] args) {
        System.out.println(age18(25));
        System.out.println(age18(15));
        System.out.println(age18(18));
    }

    public static boolean _age18(int age) {
        boolean result = false;
        if (age > 18) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static boolean age18(int age) {
        if (age > 18) {
            return true;
        } else if (age == 18) {
            return true;
        } else {
//            return false;
        }
        return false;
    }
}
