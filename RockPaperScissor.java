import java.util.Random;
import java.util.Scanner;

class Player {
    private String choice;

    public void makeChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rock, paper, or scissors: ");
        choice = scanner.next().toLowerCase();
    }

    public String getChoice() {
        return choice;
    }
}

class Computer {
    private String choice;
    private static final String[] options = {"rock", "paper", "scissors"};

    public void makeChoice() {
        Random random = new Random();
        choice = options[random.nextInt(options.length)];
    }

    public String getChoice() {
        return choice;
    }
}

class Game {
    public void play() {
        Player player = new Player();
        Computer computer = new Computer();

        player.makeChoice();
        computer.makeChoice();

        System.out.println("Computer chose: " + computer.getChoice());

        String result = determineWinner(player.getChoice(), computer.getChoice());
        System.out.println(result);
    }

    private String determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "It's a tie!";
        } else if ((player.equals("rock") && computer.equals("scissors")) ||
                   (player.equals("paper") && computer.equals("rock")) ||
                   (player.equals("scissors") && computer.equals("paper"))) {
            return "You win";
        } else {
            return "Computer wins";
        }
    }
}

public class RockPaperScissor {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
