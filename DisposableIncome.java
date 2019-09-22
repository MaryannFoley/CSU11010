//Maryann Foley 

/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 10  
       Comment: I used constants for the tax rate, and for the numbers that I used to convert between decimal and percent and the other way around.
        This allowed me to avoid having any unexplained numbers in my code.
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:  4
       Comment: My constant names described properly and understandably the values they were represnting.
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:  5
       Comment: All of my constants were in uppercase with underscores between words.
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:  9
       Comment: My variable names were descriptive and easy-to-understand.
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:  10
       Comment: My variables followed this format.
   6. Did I indent the code appropriately?
       Mark out of 10:  10
       Comment: Code was indented to indicate the level of the line.
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10:  10
       Comment: I asked the user accurate questions and read the input properly.
   8. Did I compute the disposable income correctly?
       Mark out of 10:  10
       Comment: I correctly computed the disposable income based on the equation provided, with post tax income calculated then fees being suggested.
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10:  10
       Comment: I correctly calculated the disposable income percentage.
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:  10
       Comment: I output the answer according to the format in the example, with the money having 2 decimal places and the percent to the nearest whole number.
   11. How well did I complete this self-assessment?
       Mark out of 10:  9
       Comment: I believe I accuraetly assessed my work in this self-assessment.
   Total Mark out of 100 (Add all the previous marks): 97
*/

import java.util.Scanner;


class DisposableIncome {
	public static void main(String[] args) {
		final double TAX_RATE = 35;
		final double TOTAL_PERCENTAGE = 100;
		final double PERCENTAGE_TO_DECIMAL = 0.01;
		final double CENT_VALUE_IN_EUROS = .1;
		
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
		
		System.out.println(
		  "Your monthly disposable income is €" + roundedDisposableIncome + ", which is " + roundedPercentOriginalIncome + "% of your salary." );
 		
	}
}
