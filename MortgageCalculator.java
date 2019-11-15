
public class MortgageCalculator {

	final static double DEFAULT_YEARS = 20.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the mortgage calculator.\nPlease enter the mortgage amount: ");
		double principal = readDoubleFromUser();
		System.out.println("Please enter the annual interest rate (APR):  ");
		double annualPercentageRate = readDoubleFromUser();
		double monthlyRepayment = calculateMonthlyRepayment(principal, DEFAULT_YEARS, annualPercentageRate);
		System.out.println("Assuming a 20 year term, the monthly repayment would be "+ monthlyRepayment);
		System.out.println("How much can you afford to pay per month? ");
		System.out.println();
	}
	
	public static double readDoubleFromUser() {
		
	}
	
	public static double calculateMonthlyRepayment (double principal, double mortgageLength, double apr) {
		
	}
	
	public static double calculateMonthstoRepayMortgage (double mortgage, double monthlyRepayment, double annualInterest) {
		
	}
}
