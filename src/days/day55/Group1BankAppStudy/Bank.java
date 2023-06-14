package days.day55.Group1BankApp;


//import java.util.Scanner;

public abstract class Bank {

    ////////////// DATA FIELDS \\\\\\\\\\\\\\\
    private String accountHolder;
    private String bankName;

    private double currentBalance; // to keep current balance value for created account
    private double finalBalance;   // to keep final balance value after account is closed -> current balance * (1+ return rate)

    private String accountType;    // GOLD, SAVING, INTEREST

    private double depositBonus;
    private double withdrawExpense;
    private double returnRate;

    private double welcomeBonus;

    private boolean isAccountClosed = true;

    private double totalExpenses;


//    Scanner scanner = new Scanner(System.in);

    public Bank(String accountHolder ,String accountType, double currentBalance, String bankName, double welcomeBonus) {
//        while (currentBalance < 0) {
//            System.out.println("Negative Balance!!, please re-enter!!");
//            currentBalance = scanner.nextDouble();
//        }

        setAccountHolder(accountHolder);
        setAccountType(accountType.toUpperCase());
        setWelcomeBonus(welcomeBonus);
        setCurrentBalance(currentBalance + getWelcomeBonus());
        setAccountClosed(false);
        setBankName(bankName);
        


        System.out.println("\n ==================== WELCOME to " + getBankName() + "!!! ====================");
        System.out.println("£" + welcomeBonus + " Welcome Bonus added to your account!" );
        System.out.println("Your " + getAccountType() + " account's current balance is £" + getCurrentBalance());
        



    }




/////////////////// METHODS - Functions \\\\\\\\\\\\\\\\\\\\\\\

    // these abstract method will provide common behaviours which child class will follow
    // implement them in child class
    // this one will allow the subclass to implement the method according to their rules(behaviour)
    // make sure this method exist so we can call through parent class
    // code REUSABILITY!!!!

    public abstract void deposit(double depositAmount); // implement in child class
    public abstract void withdraw(double withdrawAmount); // implement in child class
    public abstract void updateBalance(); // implemented in child class
    public abstract void accountType(); // implemented in child class
    public abstract void totalExpenses(); // implemented in child class




    // ABLE TO GET ACCOUNT INFORMATION
    // declared AN ACCOUNTHOLDER VARIABLE

    public void printAccountInfo() {
        System.out.println("********   ACCOUNT INFORMATION   ********");
        System.out.println("       Account Holder:       " + getAccountHolder());
        System.out.println("       Bank Name:            " + getBankName());
        System.out.println("       Account Type:         " + getAccountType());
        System.out.println("       Current Balance:      £" + getCurrentBalance());
        System.out.println("       Deposit Bonus:        £" + depositBonus);
        System.out.println("       Withdraw Expense:     £" + withdrawExpense);
        System.out.println("       Your Total Expenses:  £" + totalExpenses);
        System.out.println("       Return Rate:          " + getReturnRate() +"%");


    }

//    public void deposit(double depositValue) {
//        if (isAccountClosed) {
//            System.out.println("Account is already closed!!!");
//        } else {
//
//            while (depositValue <= 0) {  // what if deposit value negative
//                System.out.println("INVALID DEPOSIT VALUE!!! Re enter the value");
//                depositValue = scanner.nextDouble(); // TODO HANDLE BONUS HERE !!! BUG SCENARIO!!!!!!  u can handle this scenarios in child class!!
//            }
//
//            setCurrentBalance(getCurrentBalance() + depositValue);
//
//            System.out.println("You were deposit " + depositValue + " to your " + getAccountType() + " account!!");
//            System.out.println("Your Current Balance is : " + getCurrentBalance());
//        }
//    }


//    public void withdraw(double withdrawValue) {
//        if (isAccountClosed) {
//            System.out.println("Account is already closed!!!");
//        } else { // means account is active!!
//
//            while (withdrawValue <= 0 || withdrawValue > getCurrentBalance()) {  // what if withdrawValue negative
//                System.out.println("INVALID Withdraw VALUE!!! Re enter the value");
//                withdrawValue = scanner.nextDouble(); // TODO HANDLE EXPENSE HERE !!! BUG SCENARIO!!!!!!  u can handle this scenarios in child class!!
//            }
//
//            setCurrentBalance(getCurrentBalance() - withdrawValue);
//
//            System.out.println("You were withdraw " + withdrawValue + " to your " + getAccountType() + " account!!");
//            System.out.println("Your Current Balance is : " + getCurrentBalance());
//        }
//    }


    public void closeAccount() {
        if (getAccountClosed()) {
            System.out.println("!!!!!!! Account is already closed !!!!!!!!!");
        } else {
            // calculate return rate and give back total final balance to user!!
            System.out.println(" \t\t********  ACCOUNT CLOSE PROCESS START  ********");
            setFinalBalance(getCurrentBalance() * getReturnRate());
            printAccountInfo();
            System.out.println("\t\t********  YOUR FINAL BALANCE : " + (getFinalBalance()*getReturnRate()) + "   ********");
            setCurrentBalance(0);
            setAccountClosed(true);
            System.out.println("\t\t********     YOUR ACCOUNT IS CLOSED     ********");
        }
    }


    ////////////// Getter - Setter \\\\\\\\\\\\\\\


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance; //before it was currentBalance
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public double getWithdrawExpense() {
        return withdrawExpense;
    }

    public void setWithdrawExpense(double withdrawExpense) {
        this.withdrawExpense = withdrawExpense;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    public double getWelcomeBonus() {
        return welcomeBonus;
    }

    public void setWelcomeBonus(double welcomeBonus) {
        this.welcomeBonus = welcomeBonus;
    }

    public boolean getAccountClosed() {
        return isAccountClosed;
    }

    public void setAccountClosed(boolean accountClosed) {
        isAccountClosed = accountClosed;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }
}
