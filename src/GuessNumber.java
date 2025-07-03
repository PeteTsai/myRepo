import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        int guess = 0;
        System.out.println("Guess a number between 1 and 100.");
        while (true) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;
            if (guess < 1 || guess > 100) {
                System.out.println("Please guess a number between 1 and 100.");
                continue;
            }
            if (guess < answer) {
                System.out.println("Too low!");
            } else if (guess > answer) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! The number was " + answer + ".");
                break;
            }
        }
        System.out.println("You guessed it in " + attempts + " attempts.");
        scanner.close();
    }
}
