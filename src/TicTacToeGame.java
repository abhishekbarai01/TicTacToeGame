import java.util.Scanner;

public class TicTacToeGame {
    static char[] board = new char[10]; // Array length 10
    public static void main(String[] args) {
        Board(); // call Board method
        chooseLetter(); // call chooseLetter method
        showBoard();

    }

    public static  void Board() {  // create board method
        System.out.println("Welcome to TicTacToe Game");
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void chooseLetter() {   // create chooseletter method
        System.out.println("Enter a character X 0r O :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'O') {                    // If - else
            String computer = "X";
            String Player = "O";
            System.out.println("Player choose " + Player);
            System.out.println("Computer choose " + computer);
        } else if (ch == 'X') {
            String computer = "O";
            String Player = "X";
            System.out.println("Player choose " + Player);
            System.out.println("Computer choose " + computer);
        }
        else{
            System.out.println("Invalid Input");
        }
        // close the scanner
        System.out.println("Closing Scanner");
        sc.close();
        System.out.println("Scanner Closed");
    }
    public static void showBoard() {

        System.out.println("  " + board[0] + " | " + board[1] + " | " + board[2] + "  ");
        System.out.println("  " + board[1] + " | " + board[2] + " | " + board[3] + "  ");
        System.out.println(" ----------- ");
        System.out.println("  " + board[3] + " | " + board[4] + " | " + board[5] + "  ");
        System.out.println("  " + board[4] + " | " + board[5] + " | " + board[6] + "  ");
        System.out.println(" ----------- ");
        System.out.println("  " + board[6] + " | " + board[7] + " | " + board[8] + "  ");
        System.out.println("  " + board[7] + " | " + board[8] + " | " + board[9] + "  ");

    }
}




