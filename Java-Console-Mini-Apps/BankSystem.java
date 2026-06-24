import java.util.*;

public class BankSystem {

    static Scanner sc = new Scanner(System.in);

    public static double withdraw(double balance) {
        System.out.println("---------------------------------------");
        System.out.println("Enter how much money you want to withdraw:    ");
        System.out.println("---------------------------------------");
        double amount = sc.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Error: Please enter any positive amount");
        } else if (balance < amount) {
            System.out.println("Error: Amount can not be more that Balance");
        } else {
            balance -= amount;
            System.out.println("---------------------------------------");
            System.out.println("your new account balance is Rs. " + balance);
        }
        
        System.out.println("---------------------------------------");
        return balance;
    }

    public static double deposit(double balance) {
        System.out.println("---------------------------------------");
        System.out.println("Enter the money to Deposit  ");
        System.out.println("---------------------------------------");
        double amount = sc.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Error: Please enter any positive amount");
        } else {
            balance += amount;
            System.out.println("---------------------------------------");
            System.out.println("your new account balance is Rs. " + balance);
        }
        
        System.out.println("---------------------------------------");
        return balance;
    }

    public static void main(String[] args) {
        double balance = 0;
        int option;

        do {
            System.out.println("---------------------------------------");
            System.out.println("select what do you want to do:  ");
            System.out.println("---------------------------------------");
            System.out.println("1) Show balance");
            System.out.println("2) Deposit money");
            System.out.println("3) withdraw money");
            System.out.println("4) to EXIT");
            System.out.println("---------------------------------------");
            option = sc.nextInt();
            System.out.println("---------------------------------------");
            
            switch (option) {
                case 1 -> System.out.println("your new account balance is Rs. " + balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> System.out.println("You have left the banking System");
                default -> System.out.println("Select from the given menu");
            }
        } while (option != 4);
    }
}