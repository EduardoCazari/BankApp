public class Checking extends Accounts {

    public Checking(double deposit, double withdraw, double balance) {
        super(deposit, withdraw, balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }


    public double moneyIn() {
        return balance + deposit;
    }

    public double moneuOut() {
        return balance - withdraw;
    }
}

