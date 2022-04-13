import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Generate a random number for the player to guess
        int genNumber = (int)(Math.random() * 100 + 1);
        // System.out.println(genNumber);

        int guess = 0;
        while (guess != genNumber) {
            System.out.println("Guess a number between 1 and 100");

            guess = scan.nextInt();
            if (guess < genNumber)
                System.out.println(guess + " is too low.");
            else if (guess > genNumber)
                System.out.println(guess + " is too high.");
            else
                System.out.println(guess + " is correct! nice :^]");
        }
    }
}
