class Accounts {

    private double deposit;
    private double balance;

    public void setBalance(double balance) {
     this.balance = balance;
    }

    public void setDeposit(double deposit) {
     this.deposit = deposit;
    }

    public double moneyIn() {
     return balance + deposit;
    }

    
}