package days.day51;


public class Akbank extends Bank {



    ////////////// Const \\\\\\\\\\\\\\\

    public Akbank(String accountType, double currentBalance) {
         super(accountType,currentBalance,"Akbank", 120);

        switch (super.getAccountType()) {
            case "GOLD":
               setDepositBonus(80);
                setWithdrawExpense(70);
                setReturnRate(1.3);
                break;
            case "SAVING":
                setDepositBonus(90);
                setWithdrawExpense(60);
                setReturnRate(1.2);
                break;
            case "INTEREST":
                setDepositBonus(100);
                setWithdrawExpense(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("INVALID ACCOUNT TYPE!!");
                // TODO Group study task: try to handle this future more dynamic...
        }



    }

    /////////////////// METHODS - Functions \\\\\\\\\\\\\\\\\\\\\\\

    // deposit

    @Override
    public void deposit(double depositValue) {
        if(depositValue<2000) {
            super.deposit(depositValue);
        } else {
            super.deposit(depositValue + getDepositBonus());
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if(withdrawValue<1000){
            super.withdraw(withdrawValue);
        } else {
            super.withdraw(withdrawValue + getWithdrawExpense());
        }
    }






}
