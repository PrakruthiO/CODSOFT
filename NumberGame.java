import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        boolean playAgain = true;

        while (playAgain) {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean guessed = false;

            System.out.println("Guess the number between 1 to 100");

            while (attempts > 0) {
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct!");
                    totalScore++;  
                    System.out.println("You won this round!");
                    guessed = true;
                    break;
                } 
                else if (guess > number) {
                    System.out.println("Too high");
                } 
                else {
                    System.out.println("Too low");
                }

                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("Number was: " + number);
            }

            System.out.println("Total Wins (Score): " + totalScore);

            System.out.println("Play again? (yes/no)");
            sc.nextLine();
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Final Score (Total Wins): " + totalScore);
    }
}
