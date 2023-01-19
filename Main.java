import java.util.*;

class Main {

    public static void main(String[] args) {

        Login login = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your User Name: ");
        login.setUserName(sc.nextLine());

        System.out.println("Insert your Password: ");
        login.setPassword(sc.nextLine());

        login.confirmation();

        Accounts checking = new Accounts();
        checking.setBalance(0.0);

        System.out.println("Type the ammount of your first deposit:");
        checking.setDeposit(sc.nextDouble());


        System.out.println("Your balance is " + checking.moneyIn());


    }
}