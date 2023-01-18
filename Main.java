import java.util.*;

class Main {

    public static void main(String[] args) {

        LogIn login = new LogIn();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your User Name: ");

        login.setUserName(sc.nextLine());

        System.out.println("Insert your Password: ");

        login.setPassword(sc.nextLine());

        login.confirmation();


    }
}