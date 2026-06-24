import java.util.Scanner;

public class ShoppingCart {
    public static void main(String args[]) {
        String product;
        int quantity = 0;
        double price = 0.0;
        double amount = 0.0;

        System.out.println("Here's the list of available items:  ");
        System.out.println("1) Carrots 2) Apples 3) Oranges 4) Bananas 5) Eggs ");
        System.out.println("What do you want??????");

        Scanner scanner = new Scanner(System.in);
        product = scanner.nextLine();

        if (product.equals("Carrots") || product.equals("carrots") || product.equals("1")) {
            price = 20;
            System.out.println("Price is " + price + "$ per kg");
            System.out.println("How many Kgs carrots do you want???");
            quantity = scanner.nextInt();
            amount = quantity * price;
            System.out.println("Your Total amount will be:  " + amount);
        } else if (product.equals("Apples") || product.equals("apples") || product.equals("2")) {
            price = 6.09;
            System.out.println("Price is " + price + "$ per kg");
            System.out.println("How many Kgs Apples do you want???");
            quantity = scanner.nextInt();
            amount = quantity * price;
            System.out.println("Your Total amount will be:  " + amount);
        } else if (product.equals("Oranges") || product.equals("oranges") || product.equals("3")) {
            price = 7.77;
            System.out.println("Price is " + price + "$ per kg");
            System.out.println("How many Kgs Oranges do you want???");
            quantity = scanner.nextInt();
            amount = quantity * price;
            System.out.println("Your Total amount will be:  " + amount);
        } else if (product.equals("Bananas") || product.equals("bananas") || product.equals("4")) {
            price = 5.02;
            System.out.println("Price is " + price + "$ per kg");
            System.out.println("How many Kgs Bananas do you want???");
            quantity = scanner.nextInt();
            amount = quantity * price;
            System.out.println("Your Total amount will be:  " + amount);
        } else if (product.equals("Eggs") || product.equals("eggs") || product.equals("5")) {
            price = 2.12;
            System.out.println("Price is " + price + "$ per piece");
            System.out.println("How many Eggs do you want???");
            quantity = scanner.nextInt();
            amount = quantity * price;
            System.out.println("Your Total amount will be:  " + amount);
        } else if (product.isEmpty()) {
            System.out.println("Hey you did not enter anything!!!");
        } else {
            System.out.println("We do not have what you selected!!");
        }

        scanner.close();
    }
}