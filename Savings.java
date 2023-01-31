public class Savings extends Accounts {

    double interestRate;

    public Savings(double deposit, double withdraw, double balance, double ineterstRate) {
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

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }


    public double moneyIn() {
        return balance + deposit;
    }

    public double moneyOut() {
        return balance - withdraw;
    }
   


