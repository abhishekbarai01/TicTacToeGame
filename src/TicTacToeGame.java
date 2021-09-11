import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Board(); // call Board method
        chooseLetter(); // call chooseLetter method

    }

    static void Board() {  // create board method
        System.out.println("Welcome to TicTacToe Game");
        String[] board = new String[10]; // Array length 10
        for (int i = 0; i < board.length; i++) {
            board[i] = " ";
        }
    }

    static void chooseLetter() {   // create chooseletter method
        System.out.println("Enter a character :");
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
    }
}




