import java.util.Scanner;


class PrintMultiples {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Number to get multiples of: ");
		int first = input.nextInt();

		System.out.print("Limit: ");
		int second = input.nextInt();
		input.close();
		
		System.out.print("The multiples of "+first+ " (up to "+second+ ") are ");
		int counter = 0;
		while(counter < second){
			if (counter%first  == 0)
			{
				System.out.print(counter);
				if ((second - counter) < first){
					System.out.println(".");
				}
				else{
					System.out.print(", ");
				}
			}
			counter++;
		}
	}
}