import java.util.*;

public class TriviaGame {
    public static void main(String[] args) {

        String[] ques = {
            "Who Has Won 'International Booker Prize 2024'?? ",
            "Who Is The Author Of A Book Titled 'Fire on the Ganges' ??",
            "AI Supercomputer 'AIRAWAT' Has Been Installed At Which City??",
            "India's First Rice ATM Has Been Setup In Which State?",
            "What Is the name of World's First Wooden Satellite?"
        };

        String[][] option = {
            {"A. Geetanjali Shree", "B. David Diop", "C.Georgi Gospodinov", "D. Jenny Erpenbeck"},
            {"A. Abhay K", "B. Shanti Singh", "C. Radhika Iyengar", "D. Ruskin Bond"},
            {"A. Delhi", "B. Guwahati", "C. Pune", "D.Kanpur"},
            {"A. Odisha", "B. Bihar", "C. Gujarat", "D. Haryana"},
            {"A. WooduSat", "B. AstraSat", "C. LignoSat", "D. ArihantSat"}
        };

        String[] answer = {"d", "c", "c", "a", "c"};

        System.out.println("Welcome to the quiz game!!!");

        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i]);
            System.out.println();

            for (int j = 0; j < 4; j++) {
                System.out.println(option[i][j]);
            }
            System.out.println();

            System.out.println("Enter your guess:  ");
            String guess = sc.nextLine().toLowerCase();
            
            if (!(guess.equals("a") || guess.equals("b") || guess.equals("c") || guess.equals("d"))) {
                System.out.println("Invalid Input!!!");
                i--;
            } else {
                System.out.println("Let me check........");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

                if (guess.equals(answer[i])) {
                    System.out.println("You are Correct");
                    count++;
                } else {
                    System.out.println("You are Wrong!");
                }
                System.out.println();
            }
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
        }
        
        System.out.println();
        System.out.println("Your Score is : " + count);
        System.out.println();

        if (count == 0) {
            System.out.println("I Did not Expect this from you!!");
        } else if (count == 1) {
            System.out.println("Really? is that all you can do?");
        } else if (count == 2) {
            System.out.println("Mehhhh......");
        } else if (count == 3) {
            System.out.println("Just Average..");
        } else if (count == 4) {
            System.out.println("Looks like we got a veteran here..");
        } else if (count == 5) {
            System.out.println("That's ma Boiii..");
        }
        
        sc.close();
    }
}