
//Implement the famous Tic-Tac-Toe game using 3x3 grid
//The game is played by two players, X and O
import java.util.Scanner;

class Assignment1 {
    public static boolean checkWinner(char[][] board) {
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ') {
            System.out.print("Player " + board[0][0] + " wins");
            System.out.print("Game Over");
            return true;
        } else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' ') {
            System.out.print("Player " + board[1][0] + " wins");
            System.out.print("Game Over");
            return true;
        } else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' ') {
            System.out.print("Player " + board[2][0] + " wins");
            System.out.println();
            System.out.print("Game Over");
            return true;
        } else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ') {
            System.out.print("Player " + board[0][0] + " wins");
            System.out.println();
            System.out.print("Game Over");
            return true;
        
        } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') {
            System.out.print("Player " + board[0][1] + " wins");
            System.out.println();
            System.out.print("Game Over");
            return true;
            
        } else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' ') {
            System.out.println("Player " + board[0][2] + " wins");
            System.out.println();
            System.out.println("Game Over");
            return true;
        
        } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            System.out.print("Player " + board[0][0] + " wins");
            System.out.println();
            System.out.print("Game Over");
            return true;
    
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            System.out.print("Player " + board[0][2] + " wins");
            System.out.println();
            System.out.print("Game Over");
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        char[][] board = new char[3][3];
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Tic-Tac-Toe");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");
        System.out.println("Enter the position to place the symbol");
        while (true) {
            System.out.print("Enter the row number : ");// input the row number is 0 or 1 or 2
            int row = sc.nextInt();
            System.out.print("Enter the column number : ");// input the column number is 0 or 1 or 2
            int col = sc.nextInt();
            if (board[row][col] == ' ') {
                System.out.print("Enter the symbol to be placed : ");
                char symbol = sc.next().charAt(0);
                board[row][col] = symbol;
            } else {
                System.out.println("Position already occupied");
            }
            System.out.println("The current board is : ");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print("_"+board[i][j] + "| ");
                }
                System.out.println();
            }
            if(checkWinner(board))
            break;
    }
}
}
