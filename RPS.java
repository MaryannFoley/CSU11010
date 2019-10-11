//Maryann Foley

/* SELF ASSESSMENT 
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code?  
       Mark out of 10: 10
       Comment: My variable and constant names were descriprive and easy to understand.
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)? 
       Mark out of 5: 5
       Comment: All of my variables are formatted correctly.
   3. Did I generate the computer's choice in each game correctly using a Random number generator? 
       Mark out of 10: 10
       Comment: I correctly generated the computer choice to be in the range of the desired values.
   4. Did I input the user's choice in each game correctly? 
       Mark out of 10: 10
       Comment: My program takes in input after providing a description of what is expected of the user.
   5. Did I correctly compare the choices and update the score appropriately? 
       Mark out of 20: 20
       Comment: I correctly decided the winner based on the user and computer moves and used this to update the score.
   6. Did I inform the user of who won each game (and why) correctly? 
       Mark out of 10: 10
       Comment: I informed the user of the winner of each round and the move chosen by the computer that led to this outcome.
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop. 
       Mark out of 20:  20
       Comment: I used a single for loop to play 5 games with the user
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10:  10
       Comment: I correctly output the final scores at the end of the 5 games by stating the number of games won by each the player and computer.
   9. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: I answered the questions about my work critically.
   Total Mark out of 100 (Add all the previous marks): 100
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		final int ROCK_VALUE = 1;
		final int PAPER_VALUE = 2;
		final int SCISSORS_VALUE = 3;
		final int MAX_VALUE = 3;
		final int MIN_VALUE = 1;
		final int NUMBER_GAMES = 5;
		final int COMPUTER = 1;
		final int PLAYER = 2;
		final int TIE = 0;
		
		int computerWins = 0;
		int playerWins = 0;
		int ties = 0;
		int roundWinner = 0;
		
		int computerMove = 0;
		int playerMove = 0;
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		for (int gameNumber = 1; gameNumber <= NUMBER_GAMES; gameNumber++) {

			System.out.print("Enter "+ ROCK_VALUE+" (for Rock), "+PAPER_VALUE+" (for Paper), or "+SCISSORS_VALUE+" (for Scissors): ");
			playerMove = -1;
			while (!input.hasNextInt()) {
				System.out.println("Please input a valid response.");
				input.next();
			}
			playerMove=input.nextInt();
			computerMove = generator.nextInt(MAX_VALUE)+MIN_VALUE;
			
			if (computerMove > playerMove) 
			{
				if (playerMove == ROCK_VALUE && computerMove == SCISSORS_VALUE) 
				{
					roundWinner = PLAYER;
				}
				else 
				{
					roundWinner = COMPUTER;
				}
			}
			
			else if (playerMove > computerMove)
			{
				if (computerMove == ROCK_VALUE && playerMove == SCISSORS_VALUE) 
				{
					roundWinner = COMPUTER;
				}
				else 
				{
					roundWinner = PLAYER;
				}
			}
			
			else 
			{
				roundWinner = TIE;
			}
			
		
			String computerMoveString = "";
			if (computerMove == ROCK_VALUE) {
				computerMoveString = "rock";
			}
			else if (computerMove == SCISSORS_VALUE) {
				computerMoveString = "scissors";
			}
			else if (computerMove == PAPER_VALUE) {
				computerMoveString = "paper";
			}
			
			if (roundWinner == COMPUTER) {
				computerWins++;
				System.out.println("I won this round because I chose "+computerMoveString+".");
			}
			else if (roundWinner == PLAYER) {
				playerWins++;
				System.out.println("You won this round because I chose "+computerMoveString+".");
			}
			else {
				ties++;
				System.out.println("This round was a draw because I chose "+computerMoveString+".");
			}
		}
		
		
		input.close();
		System.out.println("The final score was computer: "+computerWins+" player: "+playerWins+" draws: "+ties);
	}

}
