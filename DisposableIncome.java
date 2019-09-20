//Maryann Foley 

/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 10  
       Comment: Used a constant for the tax rate
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5:  5
       Comment:
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:  5
       Comment:
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:  9
       Comment:
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:  10
       Comment:
   6. Did I indent the code appropriately?
       Mark out of 10:  10
       Comment:
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10:  10
       Comment:
   8. Did I compute the disposable income correctly?
       Mark out of 10:  10
       Comment:
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10:  9
       Comment:
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:  10
       Comment:
   11. How well did I complete this self-assessment?
       Mark out of 10:  10
       Comment:
   Total Mark out of 100 (Add all the previous marks):  
*/

import java.util.Scanner;

public class DisposableIncome {
	
	public static void main(String[] args) {
		final double TAX_RATE = 35;
		final double TOTAL_PERCENTAGE = 100;
		final double PERCENTAGE_TO_DECIMAL = 0.01;
		final double CENT_VALUE_IN_EUROS = .1; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("How much are you paid each month?");
		double salary = input.nextDouble();
		System.out.println("How much do you pay for your accomodations each month?");
		double accomodation = input.nextDouble();
		System.out.println("How much do you pay for transportation each month?");
		double transportation = input.nextDouble();
		System.out.println("How much do you pay for food each month?");
		double food = input.nextDouble();
		input.close();
		
		double afterTaxIncome = salary * (( TOTAL_PERCENTAGE - TAX_RATE ) * PERCENTAGE_TO_DECIMAL);
		double disposableIncome = afterTaxIncome - accomodation - transportation - food;
		double percentOriginalIncome = disposableIncome / salary;
		
		double roundedDisposableIncome = disposableIncome - ( disposableIncome % CENT_VALUE_IN_EUROS );
		double roundedPercentOriginalIncome = (int)(TOTAL_PERCENTAGE * percentOriginalIncome); 
		
		System.out.println(
				"Your monthly disposable income is €" + roundedDisposableIncome + ", which is " + roundedPercentOriginalIncome + "% of your salary." );
 		
	}

}
