package days.day51;

public class BankTest {

    public static void main(String[] args) {

        Akbank yavuzGold = new Akbank("gold", 1000);

        yavuzGold.deposit(1000);
        yavuzGold.deposit(2000);

        yavuzGold.withdraw(500);
        yavuzGold.withdraw(1000);

        yavuzGold.closeAccount();

        System.out.println("yavuzGold.getFinalBalance() = " + yavuzGold.getFinalBalance());

        Karabank meralSaving =  new Karabank("saving", 2000);
    }
}
