package days.day55.Group1BankAppStudy;

public class Karabank extends Bank {

    protected double totalExpenses;

    public Karabank(String accountHolder, String accountType, double currentBalance) {
        super(accountHolder, accountType, currentBalance, "Karabank", 100);
        setDepositBonus();
        setWithdrawExpense();





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

//        switch (super.getAccountType().toUpperCase()) {
//            case "GOLD":
//                setDepositBonus(80);
//                setWithdrawExpense(90);
//                setReturnRate(1.4);
//                break;
//            case "SAVING":
//                setDepositBonus(100);
//                setWithdrawExpense(70);
//                setReturnRate(1.1);
//                break;
//            case "INTEREST":
//                setDepositBonus(90);
//                setWithdrawExpense(80);
//                setReturnRate(1.2);
//                break;
//            default:
//                System.out.println("INVALID ACCOUNT TYPE!!");
//                // TODO Group study task: try to handle this future more dynamic...
//        }
//    }


    //    @Override
//    public void deposit(double depositValue) {
//        if(depositValue<3000) {
//            super.deposit(depositValue);
//        } else {
//            super.deposit(depositValue + getDepositBonus());
//        }
//    }
//
//    @Override
//    public void withdraw(double withdrawValue) {
//        if(withdrawValue<2000){
//            super.withdraw(withdrawValue);
//        } else {
//            super.withdraw(withdrawValue + getWithdrawExpense());
//        }
//    }
    //NEED TO WORK ON THIS ONE
    public boolean isAccountClosed() {
        if (getAccountClosed()) {
            return true; // if balance is 0 account already closed
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
            if (withdrawAmount >= 2000) {
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
                double goldDepositBonus = 80;
                totalExpenses += goldDepositBonus;
                setDepositBonus(goldDepositBonus);
                break;
            case "SAVING":
                double savingDepositBonus = 100;
                totalExpenses+= savingDepositBonus;
                setDepositBonus(savingDepositBonus);
                break;
            case "INTEREST":
                double interestDepositBonus = 90;
                totalExpenses+=interestDepositBonus;
                setDepositBonus(interestDepositBonus);
                break;
            default:
                System.out.println("Invalid account type! Deposit bonus not set.");
                break;
        }
    }

    private void setWithdrawExpense() {
        String accountType = getAccountType().toUpperCase();
        switch (accountType) {
            case "GOLD":
                double goldWithdrawExpense = 90;
                totalExpenses+=goldWithdrawExpense;
                setWithdrawExpense(goldWithdrawExpense);
                break;
            case "SAVING":
                double savingWithdrawExpense = 70;
                totalExpenses+=savingWithdrawExpense;
                setWithdrawExpense(savingWithdrawExpense);
                break;
            case "INTEREST":
                double interestWithdrawExpense = 80;
                totalExpenses+=interestWithdrawExpense;
                setWithdrawExpense(interestWithdrawExpense);
                break;
            default:
                System.out.println("Invalid account!");
                break;

        }

    }


    @Override
    public void totalExpenses() {
        totalExpenses += getWithdrawExpense()+getDepositBonus();

        System.out.println("********  Your total expenses: £" + getTotalExpenses() + "  ********");
        System.out.println("            Deposit Bonus: £" + getDepositBonus());
        System.out.println("            Withdraw fee : £" + getWithdrawExpense());

    }


    public void returnRate(double ratesRate) {

        System.out.println("Return rate for " + getBankName() + " " + getAccountType() + " account is: " + getReturnRate()  + "%");
    }



    @Override
    public void setReturnRate(double returnRate) {
        String accountType = getAccountType().toUpperCase();
        switch (accountType) {
            case "GOLD":
                setReturnRate(1.4);
                break;
            case "SAVING":
                setReturnRate(1.1);
                break;
            case "INTEREST":
                setReturnRate(1.2);
                break;
            default:
                System.out.println("INVALID ACCOUNT TYPE!!");

        }

    }


}





