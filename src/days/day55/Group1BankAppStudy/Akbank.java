package days.day55.Group1BankAppStudy;


public class Akbank extends Bank {

    //private boolean accountIsClosed;--> connected to accountIsClosed??


    public Akbank(String accountHolder, String accountType, double currentBalance) {
        super(accountHolder, accountType, currentBalance, "Akbank", 120);
        setDepositBonus();
        setWithdrawExpense();
    }


//        switch (super.getAccountType().toUpperCase()) {
//            case "GOLD":
//                setDepositBonus(80);
//                setWithdrawExpense(70);
//                setReturnRate(1.3);
//                break;
//            case "SAVING":
//                setDepositBonus(90);
//                setWithdrawExpense(60);
//                setReturnRate(1.2);
//                break;
//            case "INTEREST":
//                setDepositBonus(100);
//                setWithdrawExpense(50);
//                setReturnRate(1.1);
//                break;
//            default:
//                System.out.println("INVALID ACCOUNT TYPE!!");
//                // TODO Group study task: try to handle this future more dynamic...
//        }


    /////////////////// METHODS - Functions \\\\\\\\\\\\\\\\\\\\\\\

    // deposit

    //    @Override
//    public void deposit(double depositValue) {
//        if (depositValue < 2000) {
//            super.deposit(depositValue);
//        } else {
//            super.deposit(depositValue + getDepositBonus());
//        }
//    }
//    @Override
//    public void withdraw(double withdrawValue) {
//        if (withdrawValue < 1000) {
//            super.withdraw(withdrawValue);
//        } else {
//            super.withdraw(withdrawValue + getWithdrawExpense());
//        }
//    }

    // THIS ONE NEED TO CHANGE
    public boolean isAccountClosed() {
        if (getAccountClosed()) {
            return true; // if balance is 0 account already closed-->change that one
        } else {
            return false;
        }
    }

    @Override
    public void deposit(double depositAmount) {
        if (isAccountClosed()) {
            System.out.println("Account already closed!! Please open an account.");
        } else {
            double totalDeposit = depositAmount;

            if (depositAmount >= 3000) {
                if (getAccountType().equalsIgnoreCase("Gold")) {
                    totalDeposit += getDepositBonus();
                    System.out.println("£" + getDepositBonus() + " deposit bonus added to your account!");
                } else if (getAccountType().equalsIgnoreCase("Saving")) {
                    totalDeposit += getDepositBonus();
                    System.out.println("£" + getDepositBonus() + " deposit bonus added to your account!");
                } else if (getAccountType().equalsIgnoreCase("Interest")) {
                    totalDeposit += getDepositBonus();
                    System.out.println("£" + getDepositBonus() + " deposit bonus added to your account!");
                }
            }

            setCurrentBalance(getCurrentBalance() + totalDeposit);

            System.out.println("You deposited: £" + depositAmount);
            //System.out.println("£" + getDepositBonus() + " deposit bonus added to your account!");
            System.out.println("Your current balance: £" + getCurrentBalance());
        }
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if (isAccountClosed()) {
            System.out.println("Account already closed!!");
        } else {
            double withdraw = withdrawAmount;
            if (withdrawAmount >= 1000) {
                if (getAccountType().equalsIgnoreCase("Gold")) {
                    withdraw += getWithdrawExpense();
                    System.out.println("£" + getWithdrawExpense() + " withdraw fee was taking from your account!");
                } else if (getAccountType().equalsIgnoreCase("Saving")) {
                    withdraw += getWithdrawExpense();
                    System.out.println("£" + getWithdrawExpense() + " withdraw fee was taking from your account!");
                } else if (getAccountType().equalsIgnoreCase("Interest")) {
                    withdraw += getWithdrawExpense();
                    System.out.println("£" + getWithdrawExpense() + " withdraw fee was taking from your account!");
                }
            }

            setCurrentBalance(getCurrentBalance() - withdraw);
            System.out.println("You withdrew: £" + withdrawAmount);
            System.out.println("Your current balance: £" + getCurrentBalance());

        }
    }


    @Override
    public void updateBalance() {
        System.out.println("BALANCE IS UPDATING... ");
        System.out.println("Your balance is: £" + getCurrentBalance());

    }


    private void setDepositBonus() {
        String accountType = getAccountType().toUpperCase();
        switch (accountType) {
            case "GOLD":
                setDepositBonus(80);
                break;
            case "SAVING":
                setDepositBonus(90);
                break;
            case "INTEREST":
                setDepositBonus(100);
                break;
            default:
                System.out.println("Invalid account!");
                break;
        }
    }

    private void setWithdrawExpense() {
        String accountType = getAccountType().toUpperCase();
        switch (accountType) {
            case "GOLD":
                setWithdrawExpense(70);
                break;
            case "SAVING":
                setWithdrawExpense(60);
                break;
            case "INTEREST":
                setWithdrawExpense(50);
                break;
            default:
                System.out.println("Invalid account!");
                break;

        }

    }

    @Override
    public void accountType() {
        if (getAccountType().equalsIgnoreCase("Gold")) {
            System.out.println("You are with " + getBankName());
            System.out.println("Your Account Type is: " + getAccountType() + " account.");
        } else if (getAccountType().equalsIgnoreCase("SAVING")) {
            System.out.println("You are with " + getBankName());
            System.out.println("Your Account Type is: " + getAccountType() + " account");
        } else if (getAccountType().equalsIgnoreCase("INTEREST")) {
            System.out.println("You are with " + getBankName());
            System.out.println("Your Account Type is: " + getAccountType() + " account");
        } else {
            System.out.println("Invalid account type!");
        }

    }


    public void returnRate() {
        System.out.println("Return rate for " + getBankName() + " " + getAccountType() + " account is: " + getReturnRate()  + "%");
    }

    @Override
    public void totalExpenses() {
        double totalExpenses = getDepositBonus() + getWithdrawExpense();
        setTotalExpenses(totalExpenses);
        System.out.println("********  Your total expenses: £" + (getDepositBonus() + getWithdrawExpense())+"  ********");
        System.out.println("            Deposit Bonus: £" + getDepositBonus());
        System.out.println("            Withdraw fee : £" + getWithdrawExpense());
    }


}






