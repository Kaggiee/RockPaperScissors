/*Import Statements */
import java.util.Scanner;

class RockPaperScissorsGame {
    public static void main(String[] args) {
        //Declare variables
        int player1; // Player 1 choice
        int player2; // Player 2 choice
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Display game text
        System.out.println("Welcome to Rock, Paper, Scissors!");

        // Prompt Player 1 decision
        System.out.println("Player 1 Choose: 1 - Rock, 2 - Paper, 3 - Scissors");
        player1 = keyboard.nextInt();

        // Prompt Player 2 decision
        System.out.println("Player 2 Choose: 1 - Rock, 2 - Paper, 3 - Scissors");
        player2 = keyboard.nextInt();
        
        // Determine the number entered.
        if (player1 == 1 && player2 == 3) {
          System.out.println("Player 1 wins!"); // Rock v Scissors
        }
        else if (player1 == 2 && player2 == 1) {
          System.out.println("Player 1 wins!"); // Paper v Rock
        }
        else if (player1 == 3 && player2 == 2) {
          System.out.println("Player 1 wins!"); // Scissors v Paper
        }
        else if (player1 == 3 && player2 == 1) {
          System.out.println("Player 2 wins!");
        }
        else if (player1 == 1 && player2 == 2) {
          System.out.println("Player 2 wins!");
        }
        else if (player1 == 2 && player2 == 3) {
          System.out.println("Player 2 wins!");
        }
        else {
          System.out.println("It's a tie!"); // If the two numbers are the same
        }
        keyboard.close(); // Closes out keyboard
    }
}