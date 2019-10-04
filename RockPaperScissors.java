import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROCK_VALUE = 1;
		final int PAPER_VALUE = 2;
		final int SCISSORS_VALUE = 3;
		final int MAX_VALUE = 3;
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
			System.out.print("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors): ");
			playerMove = 0;
			playerMove = input.nextInt();
			computerMove = generator.nextInt(MAX_VALUE)+1;
			
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
				System.out.println("I won this round because I chose "+computerMoveString);
			}
			else if (roundWinner == PLAYER) {
				playerWins++;
				System.out.println("You won this round because I chose "+computerMoveString);
			}
			else {
				ties++;
				System.out.println("This round was a draw because I chose "+computerMoveString);
			}
		}
		
		
		input.close();
		System.out.print("The final score was computer: "+computerWins+" player: "+playerWins);
	}

}
