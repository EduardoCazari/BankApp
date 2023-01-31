public class Accounts {

    double deposit;
    double withdraw;
    double balance;
    
    public Accounts(double deposit, double withdraw, double balance) {
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.balance = balance;
    }

    public double moneyIn() {
        return balance + deposit;
    }

    public double moneyOut() {
        return balance - withdraw;
    }
}