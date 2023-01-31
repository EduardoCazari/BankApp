import java.util.*;


class Main {

    public static void main(String[] args) {

        // Login session
        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your User Name: ");
        login.setUserName(sc.nextLine());

        System.out.println("Insert your Password: ");
        login.setPassword(sc.nextLine());

        login.confirmation();
        //-------------------------------------------------

        //Accounts Selection
        System.out.println("Welcome to your Bank App! Press 1 for Checking Account and 2 for Savings Account");
        int accountSelection = sc.nextInt();
        
        switch (accountSelection) {
            case 1: System.out.println(login.getUserName() + " that's your Checking Account!");
           
        //Checking Operation Selection
        System.out.println("Press 1 for deposits or 2 for withdraws");
        int CheckingOpSelection = sc.nextInt();

        switch (CheckingOpSelection) {
            case 1:  // Checking Account Deposit
            Checking checkingDeposit = new Checking(0.0, 0.0, 0.0);
            checkingDeposit.setBalance(0.0);
    
            System.out.println("Type the ammount of your deposit to your checking account:");
            checkingDeposit.setDeposit(sc.nextDouble());
    
            System.out.println("Your checking account balance is " + checkingDeposit.moneyIn());
            break;

            case 2: // Checking Account Withdraw
            Checking checkingWithdraw = new Checking(0.0, 0.0, 0.0);
            checkingWithdraw.setBalance(0.0);
    
            System.out.println("Type the ammount of your withdraw to your checking account:");
            checkingWithdraw.setDeposit(sc.nextDouble());
    
            System.out.println("Your checking account balance is " + checkingWithdraw.moneyOut());
            break;

            default: System.out.println("Please, try again.");
            System.exit(0);
            break;
        }
            case 2: System.out.println(login.getUserName() + " that's your Savings Account!");

        // Savings Operation Selection
        System.out.println("Press 1 for deposits or 2 for withdraws");
        int SavingsOpSelection = sc.nextInt();

        switch (SavingsOpSelection) {
            case 1: //Savings Account Deposit
            Savings savingsDeposit = new Savings(0.0, 0.0, 0.0, 0.0);
            savingsDeposit.setBalance(0.0);
            savingsDeposit.setInterestRate(12.0);
            
            System.out.println("Type the ammount of your deposit to your savings account:");
            savingsDeposit.setDeposit(sc.nextDouble());
    
            System.out.println("Your savings account balance is " + savingsDeposit.moneyIn() + " at an interest rate of " + savingsDeposit.getInterestRate() + "%");
            break;

            case 2:  //Savings Account Withdraw
            Savings savingsWithdraw = new Savings(0.0, 0.0, 0.0, 0.0);
            savingsWithdraw.setBalance(0.0);
            savingsWithdraw.setInterestRate(12.0);
            
            System.out.println("Type the ammount of your withdraw to your savings account:");
            savingsWithdraw.setDeposit(sc.nextDouble());
    
            System.out.println("Your savings account balance is " + savingsWithdraw.moneyOut() + " at an interest rate of " + savingsWithdraw.getInterestRate() + "%");
            break;

            default: System.out.println("Please, try again.");
            System.exit(0);
            break;
        }
            default: System.out.println("Please, try again.");
            System.exit(0);
            break;
        }

            sc.close(); 

       
    }
}
    
           
