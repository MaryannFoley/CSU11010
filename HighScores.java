import java.util.Scanner;

public class HighScores{
	public static void main(String[] args) {
		int[] scores = new int[3];
		initialiseHighScores(scores);
		printHighScores(scores);
		while (true){
			System.out.print("Add a new score: ");
			Scanner input = new Scanner( System.in );
			while (! input.hasNextInt()){
				System.out.println("Please input a valid int. ");
				input.next();
			}
			int score = input.nextInt();
			insertScore(scores,score);
			printHighScores(scores);
		}
	}

	public static void initialiseHighScores(int[] scores){
		scores[0]=0;
		scores[1]=0;
		scores[2]=0;
	}

	public static void printHighScores(int[] scores){
		System.out.println("The high scores are "+scores[0]+", "+scores[1]+", and "+scores[2]+".");
	}

	public static boolean higherThan(int[] scores, int newScore){
		return (newScore > scores[0] || newScore > scores[1] || newScore > scores[2]);
	}

	public static void insertScore(int[] scores, int newScore){
		//Will always replace the miniumum
		if (higherThan(scores,newScore)){
			if(scores[0]<scores[1]){
				if (scores[0]<scores[2]){
					scores[0] = newScore;
				}
				else{
					scores[2] = newScore;
				}
			}
			else{
				if (scores[1]<scores[2]){
					scores[1] = newScore;
				}
				else{
					scores[2] = newScore;
				}
			}
		}
	}
}