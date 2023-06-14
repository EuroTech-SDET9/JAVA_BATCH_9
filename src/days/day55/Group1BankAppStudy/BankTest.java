package days.day55.Group1BankApp;

public class BankTest {


    public static void main(String[] args) {

        Karabank girlsInterest = new Karabank("Monika", "Saving", 2000);

        girlsInterest.printAccountInfo();
        /* CREATED A METHOD NAME printAccountInfo
           --> it shows user account information (couldn't finish interest rate that's why shows 0 for now) */

        girlsInterest.deposit(3000);
        /* WE DEPOSITED 3000 OR MORE AUTOMATICALLY ADD A 100 DEPOSIT BONUS
            --> prints out the message deposit bonus added with the current balance */

        girlsInterest.withdraw(2000);
        /* IF 2000 OR MORE ... WITHDRAW FEE DEDUCTED FROM THE ACCOUNT
          --> prints message that the fee taken from the account and prints current balance */

        girlsInterest.updateBalance();
        /* AFTER MANY WITHDRAW OR DEPOSIT
          --> update your balance (current balance) */

        girlsInterest.accountType();
        /* PRINTS WHICH BANK YOU USE AND YOUR ACCOUNT TYPE*/

       





    }
}
