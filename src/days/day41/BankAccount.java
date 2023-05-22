package days.day41;

public class BankAccount {
    private String accountHolderName;
    private int birthyear;
    private double balance;

    public double getBalance() {
        System.out.println(balance + " £ is in your account.");
        System.out.printf(" %s £ is in your account.", balance);
        System.out.println();
        return balance;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    BankAccount(String name, int year, double balance) {
        this.balance = balance;
        this.birthyear = year;
        accountHolderName = name;
    }


    public void putMoneyIntoAccount(double amount) {
//        balance = balance + amount;
        balance += amount;
    }

    public void withdraw(double i) {
        balance -= i;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", birthyear=" + birthyear +
                ", balance=" + balance +
                '}';
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Ali", 1980, 1000);
//        System.out.println("account1.balance = " + account1.balance);
//        System.out.println("account1.birthyear = " + account1.birthyear);
//        System.out.println("account1.accountHolderName = " + account1.accountHolderName);
//        account1.accountHolderName = "Veli";
        String account1Name = account1.getAccountHolderName();
        System.out.println("account1Name = " + account1Name);
        System.out.println("account1.getBirthyear() = " + account1.getBirthyear());
        account1.setBirthyear(2000);
        System.out.println("account1.getBirthyear() = " + account1.getBirthyear());
        account1.getBalance();
        BankAccount account2 = new BankAccount("Yavuz", 1988, 150000);
        account2.putMoneyIntoAccount(30000);
        account2.getBalance();
        account2.withdraw(10000);
        account2.getBalance();
        String account1Info = account1.toString();
        String account2Info = account2.toString();
        System.out.println("account1Info = " + account1Info);
        System.out.println("account2Info = " + account2Info);
        account1.setBirthyear(1995);
        System.out.println(account1.toString());

    }
}
