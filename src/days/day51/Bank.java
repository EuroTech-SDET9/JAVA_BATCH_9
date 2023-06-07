package days.day51;


import java.util.Scanner;

public abstract class Bank {

    ////////////// DATA FIELDS \\\\\\\\\\\\\\\

    private String bankName;

    private double currentBalance; // to keep current balance value for created account
    private double finalBalance;   // to keep final balance value after account is closed -> current balance * (1+ return rate)

    private String accountType;    // GOLD, SAVING, INTEREST

    private double depositBonus;
    private double withdrawExpense;
    private double returnRate;

    private double welcomeBonus;

    private boolean isAccountClosed = true;

    Scanner scanner = new Scanner(System.in);

    public Bank(String accountType, double currentBalance, String bankName, double welcomeBonus) {
        while (currentBalance < 0) {
            System.out.println("Negative Balance!!, please re-enter!!");
            currentBalance = scanner.nextDouble();
        }
        setAccountType(accountType.toUpperCase());
        setWelcomeBonus(welcomeBonus);
        setCurrentBalance(currentBalance + getWelcomeBonus());
        setAccountClosed(false);
        setBankName(bankName);

        System.out.println("\n ==================== WELCOME to " + getBankName() + "!!! ====================");
        System.out.println("Your " + getAccountType() + " account's current balance is " + getCurrentBalance());
    }


/////////////////// METHODS - Functions \\\\\\\\\\\\\\\\\\\\\\\


    public void deposit(double depositValue) {
        if (isAccountClosed) {
            System.out.println("Account is already closed!!!");
        } else {

            while (depositValue <= 0) {  // what if deposit value negative
                System.out.println("INVALID DEPOSIT VALUE!!! Re enter the value");
                depositValue = scanner.nextDouble(); // TODO HANDLE BONUS HERE !!! BUG SCENARIO!!!!!!  u can handle this scenarios in child class!!
            }

            setCurrentBalance(getCurrentBalance() + depositValue);

            System.out.println("You were deposit " + depositValue + " to your " + getAccountType() + " account!!");
            System.out.println("Your Current Balance is : " + getCurrentBalance());
        }
    }


    public void withdraw(double withdrawValue) {
        if (isAccountClosed) {
            System.out.println("Account is already closed!!!");
        } else { // means account is active!!

            while (withdrawValue <= 0 || withdrawValue > getCurrentBalance()) {  // what if withdrawValue negative
                System.out.println("INVALID Withdraw VALUE!!! Re enter the value");
                withdrawValue = scanner.nextDouble(); // TODO HANDLE EXPENSE HERE !!! BUG SCENARIO!!!!!!  u can handle this scenarios in child class!!
            }

            setCurrentBalance(getCurrentBalance() - withdrawValue);

            System.out.println("You were withdraw " + withdrawValue + " to your " + getAccountType() + " account!!");
            System.out.println("Your Current Balance is : " + getCurrentBalance());
        }
    }


    public void closeAccount() {
        if (getAccountClosed()) {
            System.out.println("!!!!!!! Account is already closed !!!!!!!!!");
        } else {
            // calculate return rate and give back total final balance to user!!
            System.out.println(" \t\t******** ACCOUNT CLOSE PROCESS START  **********");
            setFinalBalance(getCurrentBalance() * getReturnRate());
            System.out.println("\t\t!!!!!!!! YOUR FINAL BALANCE : " + getFinalBalance());
            setCurrentBalance(0);
            setAccountClosed(true);
            System.out.println("\t\t!!!!!!!!  YOUR ACCOUNT CLOSED    !!!!!!!!");
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
        return finalBalance;
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
}
