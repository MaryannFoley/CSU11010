//Maryann Foley 

/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 10  
       Comment: I used constants for the tax rate, and for the numbers that I used to convert between decimal and percent and the other way around.
        I also used them for constants relating to calculating the user's disposable compared to average.
        This allowed me to avoid having any unexplained numbers in my code.
   2. Did I format the variable and CONSTANT names properly (in lowerCamelCase and UPPERCASE_WITH_UNDERSCORES)? 
       Mark out of 10:  10
       Comment:  All of my constants were in uppercase with underscores between words and variables were in lower camel case.
   3. Did I indent the code appropriately?
       Mark out of 10:  10
       Comment: Code was indented to indicate the level of the line dependent on if statements.
   4. Did I read the input correctly from the user using appropriate questions?
       Mark out of 15:  15
       Comment: I asked the user accurate questions and read the input properly.
   5. Did I computer the disposable income and disposable income percentage correctly, and output it in the correct format? 
       Mark out of 15:  15
       Comment: I correctly computed the disposable income based on the equation provided, with post tax income calculated then fees being subtracted. I correctly calculated the disposable income percentage.
   6. Did I use an appropriate series of if statements to generate the income analysis to the user? 
       Mark out of 25: 25
       Comment: I used the correct if statements to generate analysis so that all of the possible analysies are applied correctly.
   10. Did I provide the correct output for each possibility in an easy to read format?
       Mark out of 10: 10
       Comment: I output the answer according to the easy-to-read format from the example, with the money having 2 decimal places and the percent to the nearest whole number.
   11. How well did I complete this self-assessment?
       Mark out of 5:  5
       Comment: I believe I accuraetly assessed my work in this self-assessment.
   Total Mark out of 100 (Add all the previous marks): 100
*/

import java.util.Scanner;


class disposableIncome {
	public static void main(String[] args) {
		final double TAX_RATE = 35;
		final double TOTAL_PERCENTAGE = 100;
		final double PERCENTAGE_TO_DECIMAL = 0.01;
		final double AVERAGE_DISPOSABLE_INCOME = 500;
		final double FRACTION_ABOVE_AVERAGE = 1.5;
		final double FRACTION_AVERAGE = 1;
		final double FRACTION_UNDER_AVERAGE = .5;
		final double FRACTION_NO_DISPOSABLE_INCOME = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("How much are you paid a month before tax? ");
		double salary = input.nextDouble();
		System.out.print("How much do you pay for your accomodations each month? ");
		double accomodation = input.nextDouble();
		System.out.print("How much do you pay for transportation each month? ");
		double transportation = input.nextDouble();
		System.out.print("How much do you pay for food each month? ");
		double food = input.nextDouble();
		input.close();
		
		double afterTaxIncome = salary * (( TOTAL_PERCENTAGE - TAX_RATE ) * PERCENTAGE_TO_DECIMAL);
		double disposableIncome = afterTaxIncome - accomodation - transportation - food;
		double percentOriginalIncome = disposableIncome / salary;
		
		String roundedDisposableIncome = String.format("%.2f", disposableIncome);
		int roundedPercentOriginalIncome = (int)(TOTAL_PERCENTAGE * percentOriginalIncome); 
		
		String averageStatus = "the average";
		
		double calculatedAverageComparison = disposableIncome/AVERAGE_DISPOSABLE_INCOME;
		if (calculatedAverageComparison > FRACTION_AVERAGE) {
			averageStatus = (calculatedAverageComparison > FRACTION_ABOVE_AVERAGE)?"much more than the average":"more than the average";
		}
		else if (calculatedAverageComparison < FRACTION_AVERAGE) {
			if (calculatedAverageComparison <= FRACTION_NO_DISPOSABLE_INCOME) {
				averageStatus = "no";
			}
			else {
				averageStatus = (calculatedAverageComparison < FRACTION_UNDER_AVERAGE)?"much less than the average":"less than the average";
			}
		}
		
		System.out.println(
		  "Your monthly disposable income is €" + roundedDisposableIncome + ", which is " + roundedPercentOriginalIncome + "% of your salary." );
 		System.out.println("You have "+averageStatus+" disposable income per month.");
	}
}
