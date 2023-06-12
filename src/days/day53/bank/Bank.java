package days.day53.bank;

import days.day47.second.B;

public class Bank {
    //parent class
    //print interest rate  printInterestRate() interest rate is 3
    //LondonBank   ok
    //NationBank   it is 4
    //EuropeBank  it is 5

    public void printInterestRate() {
        System.out.println("Interest rate is 3% for Bank.");
    }

}

class EuropeBank {
    public void printInterestRate() {
        System.out.println("Interest rate is 4% for Europe Bank.");
    }
}


class NationBank extends Bank {
    public void printInterestRate() {
        System.out.println("Interest rate is 5% for for Nation Bank.");
    }
}

class LondonBank extends Bank {

}

class BankTest {
    public static void main(String[] args) {
        LondonBank londonBank = new LondonBank();
        londonBank.printInterestRate();
        new NationBank().printInterestRate();
        new EuropeBank().printInterestRate();
        boolean london = londonBank instanceof Bank;
        System.out.println("london = " + london);
        Bank bank = new LondonBank();
//      Reference Type     Object Type
//      Parent Class         Chil Class
        bank.printInterestRate();

        NationBank nationBank = new NationBank();
        nationBank.printInterestRate();
        boolean nation = nationBank instanceof Bank;
        System.out.println("nation = " + nation);
        Bank bank1 = new NationBank();
        bank1.printInterestRate();


    }
    //Shape class
    //Rectangle Triangle Circle

}

