import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 100!");

        while (true) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed it!");
                break;
            }
        }
        scanner.close();
    }
}