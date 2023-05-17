package days.day39;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Ali", 2000);// first object
        //  account1.accountHolderName = "Veli";
        //  account1.balance = 12000;
        Account account2 = new Account("Mary", 3500);//second object
//        account2.accountHolderName = "Mary";
//        account2.balance = 1500;
//        account1.accountInfo();
        account2.accountInfo();
//        account1.accountHolderName = "Veli";
        account1.accountInfo();
        System.out.println(account1.getBalance());
        String name1 = account1.getAccountHolderName();
        System.out.println("name1 = " + name1);

        Account account3 = new Account("Cetin", 17000);
        System.out.println(account3.getBalance());
        System.out.println(account3.getAccountHolderName());
        account3.putMoneyIntoAccount(2000);
        System.out.println(account3.getBalance());


    }
}
