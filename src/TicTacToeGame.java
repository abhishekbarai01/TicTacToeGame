import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Board(); // call Board method

    }

    static void Board() {  // create board method
        System.out.println("Welcome to TicTacToe Game");
        String[] Board = new String[10]; // Array length 10
        for (int i = 0; i <= Board.length; i++) {
            Board[i] = " ";

        }
    }
        }




