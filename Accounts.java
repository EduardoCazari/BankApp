class Accounts {

    private double deposit;
    private double balance;
    private double interestRate;

    public void setBalance(double balance) {
     this.balance = balance;
    }

    public void setDeposit(double deposit) {
     this.deposit = deposit;
    }

    public double moneyIn() {
     return balance + deposit;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    
}