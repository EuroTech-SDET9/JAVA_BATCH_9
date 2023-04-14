package days.day20;

public class Methods_5 {
    public static void main(String[] args) {


        over18(20);
        // elligible for voting
        int age = 20;// age is over then 18 elligible

//        if (over18(age)) {//true
//            System.out.println("you are elligible for voting");
//        } else {
//            System.out.println("You are not elligible for voting");
//        }
        int age2 = 30;
//        if (over18(age2)) {//true
//            System.out.println("you are elligible for voting");
//        } else {
//            System.out.println("You are not elligible for voting");
//        }
        int age3 = 50;
//        if (over18(age3)) {//true
//            System.out.println("you are elligible for voting");
//        } else {
//            System.out.println("You are not elligible for voting");
//        }
        int age5 = 50;
        elligibleForVoting(age5);
        elligibleForVoting(10);

        openBankAccount(25);
    }

    public static void elligibleForVoting(int age) {
        boolean ageIsOver18 = over18(age);
        if (ageIsOver18) {
            System.out.println("You are elligible for voting");
        } else {
            System.out.println("You are not elligible for voting.");
        }
    }

    // open bank account
    // if age is over then 18
    // print you can open an account
    // you cant open an account
    //  openBankAccount(age)
    public static void openBankAccount(int age) {
//        if (age > 18) {
        if (over18(age)) {
            System.out.println("you can open a bank account");
        } else {
            System.out.println("you can not open a bank account");
        }
    }

    public static boolean over18(int number) {
        boolean result = true;
        if (number > 18) {
          //  System.out.println("number is over 18");
            result = true;
        } else {
          //  System.out.println("number is under 18");
            result = false;
        }
        return result;
    }
}
