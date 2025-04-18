package Home.BTVN.Sudoku.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose difficulty (1-Easy, 2-Normal, 3-Hard, 4-Hell): ");
        int level = scanner.nextInt();

        Game game = new Game();
        game.GenerateFullBoard();
        game.RemoveNumbers(level);
        game.OutputLevel();

        while (true) {
            System.out.print("Choose action (move/undo/redo/hint/quit): ");
            String action = scanner.next();

            switch (action.toLowerCase()) {
                case "move" -> {
                    game.saveState();
                    playerInput(game.getBoard(), scanner);
                    game.OutputLevel();
                }
                case "undo" -> game.undo();
                case "redo" -> game.redo();
                case "hint" -> game.giveHint();
                case "quit" -> {
                    System.out.println("Game Over!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }

    private static void playerInput(int[][] board, Scanner scanner) {
        int row, col;
        while (true) {
            System.out.print("Input Row (0-8): ");
            row = scanner.nextInt();
            System.out.print("Input Column (0-8): ");
            col = scanner.nextInt();

            if (row < 0 || row > 8 || col < 0 || col > 8) {
                System.out.println("Invalid coordinates");
                continue;
            }
            if (board[row][col] != 0) {
                System.out.println("Cell already has a number!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Input value (1-9): ");
            int value = scanner.nextInt();

            if (value < 1 || value > 9) {
                System.out.println("Invalid value!");
                continue;
            }
            if (!Check.isValidMove(value, board, row, col)) {
                System.out.println("Wrong value!");
                continue;
            }
            board[row][col] = value;
            break;
        }
    }
}