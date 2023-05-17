package days.day39;

public class Account {

    private String accountHolderName;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void putMoneyIntoAccount(double amount) {
        balance = balance + amount;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    Account(String name, double amount) {
        this.accountHolderName = name;
        balance = amount;
        System.out.println("you created an object from Account class.");
    }


    public void accountInfo() {
        System.out.println(accountHolderName + " has " + balance + " in the account.");
    }


}
