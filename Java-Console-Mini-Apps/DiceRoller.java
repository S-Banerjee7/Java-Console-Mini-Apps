import java.util.*;

public class DiceRoller {
    public static void main(String[] args) {
        int value;
        int total = 0;
        System.out.print("How many Dice you want to roll?? ");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int nroll = sc.nextInt();
        
        if (nroll <= 0) {
            System.out.println("You can not roll negative number!!!");
        } else {
            System.out.println("You rolled the Dice");
            
            for (int i = 0; i < nroll; i++) {
                value = random.nextInt(1, 7);
                art(value);
                System.out.println("you rolled " + value);
                total += value;
            }
            
            System.out.println("total is " + total);
        }
        sc.close();
    }

    public static void art(int value) {
        String dice1 = """
                 -------
                |       |
                |   * |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                |     * |
                |       |
                | * |
                 -------
                """;

        String dice3 = """
                 -------
                |     * |
                |   * |
                | * |
                 -------
                """;

        String dice4 = """
                 -------
                | * * |
                |       |
                | * * |
                 -------
                """;

        String dice5 = """
                 -------
                | * * |
                |   * |
                | * * |
                 -------
                """;

        String dice6 = """
                 -------
                | * * |
                | * * |
                | * * |
                 -------
                """;
                
        System.out.println("\nRolling.....");
        
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
        }

        switch (value) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}