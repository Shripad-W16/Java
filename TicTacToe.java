import java.util.Scanner;

class Game {
    char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    char currentPlayer = 'X';

    void printBoard() {
        for (char[] row : board) {
            System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
            System.out.println("---------");
        }
    }

    boolean makeMove(int row, int col) {
        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            return true;
        }
        return false;
    }
}

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe Game = new TicTacToe();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            Game.printBoard();
            System.out.println("Enter row and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!Game.makeMove(row, col)) {
                System.out.println("Invalid move, try again");
                i--;
            }
        }
        Game.printBoard();
        System.out.println("Game Over");
    }
}