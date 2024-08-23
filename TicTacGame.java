
package tictacgame;

       
        import java.util.Scanner;

public class TicTacGame {

    public static void main(String[] args) {
        char[][] gameblocks = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char[][] numberTemplate = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };

        char FirstPlayer = 'X';
        boolean TheGameIsRunning = true;
        Scanner GAME = new Scanner(System.in);

        while (TheGameIsRunning) {
            System.out.println("Current Board:         Position Template:");
            System.out.println(" " + gameblocks[0][0] + " | " + gameblocks[0][1] + " | " + gameblocks[0][2] + "        " +
                               " " + numberTemplate[0][0] + " | " + numberTemplate[0][1] + " | " + numberTemplate[0][2]);
            System.out.println("---+---+---        ---+---+---");
            System.out.println(" " + gameblocks[1][0] + " | " + gameblocks[1][1] + " | " + gameblocks[1][2] + "        " +
                               " " + numberTemplate[1][0] + " | " + numberTemplate[1][1] + " | " + numberTemplate[1][2]);
            System.out.println("---+---+---        ---+---+---");
            System.out.println(" " + gameblocks[2][0] + " | " + gameblocks[2][1] + " | " + gameblocks[2][2] + "        " +
                               " " + numberTemplate[2][0] + " | " + numberTemplate[2][1] + " | " + numberTemplate[2][2]);

            int move;
            while (true) {
                System.out.println("Player " + FirstPlayer + ", its your time to play (choose a number from 1 to 9): ");
                move = GAME.nextInt();

                if (move < 1 || move > 9) {
                    System.out.println("move not recognised. Please enter a number from 1 to 9.");
                    continue;
                }

                int row = (move - 1) / 3;
                int col = (move - 1) % 3;

                if (gameblocks[row][col] == ' ') {
                    gameblocks[row][col] = FirstPlayer;
                    break;
                } else {
                    System.out.println("move not recognised. The position is already taken. Try again.");
                }
            }

            boolean hasWon = false;
            for (int i = 0; i < 3; i++) {
                if ((gameblocks[i][0] == FirstPlayer && gameblocks[i][1] == FirstPlayer && gameblocks[i][2] == FirstPlayer) ||
                    (gameblocks[0][i] == FirstPlayer && gameblocks[1][i] == FirstPlayer && gameblocks[2][i] == FirstPlayer)) {
                    hasWon = true;
                    break;
                }
            }

            if ((gameblocks[0][0] == FirstPlayer && gameblocks[1][1] == FirstPlayer && gameblocks[2][2] == FirstPlayer) ||
                (gameblocks[0][2] == FirstPlayer && gameblocks[1][1] == FirstPlayer && gameblocks[2][0] == FirstPlayer)) {
                hasWon = true;
            }

            if (hasWon) {
                System.out.println("Player " + FirstPlayer + " wins!");
                TheGameIsRunning = false;
            } else {
                boolean isDraw = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (gameblocks[i][j] == ' ') {
                            isDraw = false;
                        }
                    }
                }
                if (isDraw) {
                    System.out.println("It's a draw!");
                   TheGameIsRunning = false;
                }
            }

            FirstPlayer = (FirstPlayer == 'X') ? 'O' : 'X';
        }

        System.out.println("Final Board:");
        System.out.println(" " + gameblocks[0][0] + " | " + gameblocks[0][1] + " | " + gameblocks[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameblocks[1][0] + " | " + gameblocks[1][1] + " | " + gameblocks[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + gameblocks[2][0] + " | " + gameblocks[2][1] + " | " + gameblocks[2][2]);
    }
}
    
    

