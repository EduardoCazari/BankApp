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

        // Checking Account
        Accounts checking = new Accounts();
        checking.setBalance(0.0);

        System.out.println("Type the ammount of your deposit to your checking account:");
        checking.setDeposit(sc.nextDouble());

        System.out.println("Your checking account balance is " + checking.moneyIn());
        //-------------------------------------------------------------------

        // Savings Account
        Accounts savings = new Accounts();
        savings.setBalance(0.0);
        savings.setInterestRate(12.0);
        
        System.out.println("Type the ammount of your deposit to your savings account:");
        savings.setDeposit(sc.nextDouble());

        System.out.println("Your savings account balance is " + checking.moneyIn() + " at an interest rate of " + savings.getInterestRate() + "%");

        sc.close();

    }
}
