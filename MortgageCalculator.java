/* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment: I used easy to understand and useful variables
 2. Did I indent the code appropriately?
        Mark out of 5: 5
        Comment: I did indent appropriately.  
 3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
       Mark out of 10: 10
        Comment: Main has a loop until the user says no. 
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10: 10
        Comment: I obtained the relevant doubles and yes/no with prompts. 
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment: I correctly and legibly implemented readDoubleFromUser. 
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment: I correctly and legibly implemented calculateMonthlyRepayment. 
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easilyunderstood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  I correctly and legibly implemented calculateMonthsToRepayMortgage.
 8. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I accuratly completed this self-assessment.
 Total Mark out of 100 (Add all the previous marks): 100
*/ 

import java.util.Scanner;

public class MortgageCalculator 
{

	final static double DEFAULT_YEARS = 20.0;
	final static int MONTHS_PER_YEAR = 12;

	public static void main(String[] args) 
	{
		boolean calculatingMortgage = true;
		while (calculatingMortgage)
		{
			System.out.print("Welcome to the mortgage calculator.\nPlease enter the mortgage amount: ");
			double principal = readDoubleFromUser();
			System.out.print("Please enter the annual interest rate (APR): ");
			double annualPercentageRate = readDoubleFromUser();
			double monthlyRepayment = calculateMonthlyRepayment(principal, DEFAULT_YEARS, annualPercentageRate);
			System.out.println("Assuming a 20 year term, the monthly repayment would be "+ String.format("%.2f",monthlyRepayment)+".");
			System.out.print("How much can you afford to pay per month? ");
			double affordablePayment = readDoubleFromUser();
			int monthsToRepay = (int) (calculateMonthstoRepayMortgage(principal, affordablePayment, annualPercentageRate) + .5);
			int months = monthsToRepay % MONTHS_PER_YEAR;
			int years = monthsToRepay / MONTHS_PER_YEAR;
			System.out.println("If you pay " + affordablePayment + " per month your mortgage would be paid off in "
				+ years + " years and " + months + " months.");
			System.out.print("Would you like to use the mortgage calculator again (yes/no)? ");
			calculatingMortgage = readBooleanFromUser();
		}
	}
	
	public static double readDoubleFromUser() 
	{
		Scanner input = new Scanner(System.in);
		while (! input.hasNextDouble())
		{
			System.out.println("Please input a valid double.");
			input.next();
		}
		double readDouble = input.nextDouble();
		return readDouble;
	}
	
	public static double calculateMonthlyRepayment (double principal, double mortgageLength, double apr) 
	{
		double monthlyPercent = apr/MONTHS_PER_YEAR/100;
		return (principal * (monthlyPercent) / (1 - Math.pow((1+monthlyPercent), (-1 * mortgageLength * MONTHS_PER_YEAR))));
	}
	
	public static double calculateMonthstoRepayMortgage (double principal, double monthlyRepayment, double apr) 
	{
		double monthlyPercent = apr/MONTHS_PER_YEAR/100;
		double months = -1 * (Math.log((-1*principal*monthlyPercent/monthlyRepayment)+1)/Math.log(monthlyPercent+1));
		return (months);
	}

	public static boolean readBooleanFromUser() 
	{
		Scanner input = new Scanner(System.in);
		while (!input.hasNext("yes") && !input.hasNext("no"))
		{
			System.out.println("Please input yes or no.");
			input.next();
		}
		boolean readBool = (input.next().equals("yes"))?true:false;
		return readBool;
	}
}
