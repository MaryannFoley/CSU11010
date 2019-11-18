import java.util.Scanner;

public class MortgageCalculator {

	final static double DEFAULT_YEARS = 20.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean calculatingMortgage = true;
		while (calculatingMortgage){
			System.out.println("Welcome to the mortgage calculator.\nPlease enter the mortgage amount: ");
			double principal = readDoubleFromUser();
			System.out.println("Please enter the annual interest rate (APR):  ");
			double annualPercentageRate = readDoubleFromUser();
			double monthlyRepayment = calculateMonthlyRepayment(principal, DEFAULT_YEARS, annualPercentageRate);
			System.out.println("Assuming a 20 year term, the monthly repayment would be "+ monthlyRepayment+".");
			System.out.println("How much can you afford to pay per month? ");
			double affordablePayment = readDoubleFromUser();
			int monthsToRepay = (int) calculateMonthstoRepayMortgage(principal, affordablePayment, annualPercentageRate);
			int months = monthsToRepay % 12;
			int years = monthsToRepay / 12;
			System.out.println("If you pay " + affordablePayment + " per month your mortgage would be paid off in "
				+ years + " years and " + months + " months.");
			System.out.println("Would you like to use the mortgage calculator again (yes/no)? ");
			calculatingMortgage = readBooleanFromUser();
		}
	}
	
	public static double readDoubleFromUser() {
		Scanner input = new Scanner(System.in);
		while (! input.hasNextDouble()){
			System.out.println("Please input a valid double.");
			input.next();
		}
		return input.nextDouble();
	}
	
	public static double calculateMonthlyRepayment (double principal, double mortgageLength, double apr) {
		return Math.pow((principal * (apr/12/100) / (1 - (1+apr/12/100)), (-1 * mortgageLength * 12)));
	}
	
	public static double calculateMonthstoRepayMortgage (double principal, double monthlyRepayment, double apr) {
		return ((monthlyRepayment / principal));
	}

	public static boolean readBooleanFromUser() {
		Scanner input = new Scanner(System.in);
		while (! input.hasNext() && input.next() != "yes" && input.next() != "no"){
			System.out.println("Please input yes or no.");
			input.next();
		}
		return (input.next()=="yes")?true:false;
	}
}
