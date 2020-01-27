/* SELF ASSESSMENT  
   1.  createSequence:
		Did I use the correct method definition?
			Mark out of 5: 5
			Comment: I correctly defined the method as a nonstatic public method.
		Did I create an array of size n (passed as the parameter) and initialise it?
			Mark out of 5: 5
			Comment: I created an array of size N and initialised it with false in every index.
		Did I return the correct item?
			Mark out of 5: 5
			Comment: I returned the aforementioned array.
   2.  crossOutMultiples
		Did I use the correct method definition?
			Mark out of 5: 5
			Comment: My method takes in an int and modifies the array crossedOut.
		Did I ensure the parameters are not null and one of them is a valid index into the array
			Mark out of 2: 1
			Comment: My code does not enter this method without doing error checking before hand.
		Did I loop through the array using the correct multiple?
			Mark out of 5: 5
			Comment: I looped through the array using the correct multiple that was given as a parameter.
		Did I cross out correct items in the array that were not already crossed out?
			Mark out of 3: 3
			Comment: I crossed out the appropriate items.
   3.  sieve   
		Did I have the correct function definition?
			Mark out of 5: 5
			Comment: Sieve was correctly defined.
		Did I make calls to other methods?
			Mark out of 5: 5
			Comment:  I made calls to all other relevant methods.    
		Did I return an array with all non-prime numbers are crossed out?
			Mark out of 2: 2
			Comment: I returned the array of primes.
   4.  sequenceTostring  
		Did I have the correct function definition?
			Mark out of 5: 5
			Comment: I had the correct function definition.
		Did I ensure the parameter to be used is not null?
			Mark out of 3: 3
			Comment: I ensured that the parameter was not null.
		Did I Loop through the array updating the String variable with the non-crossed out numbers and the crossed numbers in brackets? 
			Mark out of 10: 10
			Comment: I looped through the array correctly.
   5.  nonCrossedOutSubseqToString  
		Did I have the correct function definition
			Mark out of 5: 5
			Comment: I correctly defined the function.       
		Did I ensure the parameter to be used is not null?  
			Mark out of 3: 3
			Comment: I ensured the array was not null.
		Did I loop through the array updating the String variable with just the non-crossed out numbers? 
			Mark out of 5: 5
			Comment: I looped and updated the string.
   6.  main  
		Did I ask  the user for input n and handles input errors?  
			Mark out of 5: 5
			Comments: I correctly handled input.
		Did I make calls to other methods (at least one)?
			Mark out of 5: 5
			Comment:  I called other functions
		Did I print the output as shown in the question?  
			Mark out of 5: 4
			Comment: I correctly printed the output.
   7.  Overall
		Is my code indented correctly?
			Mark out of 4: 4
			Comments: The indentation is correct.
		Do my variable names make sense?
			Mark out of 4: 4
			Comments: My variables are correct.
		Do my variable names, method names and class name follow the Java coding standard
			Mark out of 4: 4
			Comments: My names use the correct casing and standards.
    Total Mark out of 100 (Add all the previous marks):  98
*/


import java.util.Scanner;

public class SieveOfEratosthenes{

	static boolean quit = false;
	private boolean[] crossedOut;
	private int max;

	public static void main(String[] args) {
		while (!quit)
		{
			int maximum = readIntFromUser("Enter an integer greater than 2 (or 'quit' to finish): ");
			if (!quit)
			{
				sieve newSieve = new sieve();
				newSieve.createSequence(maximum);
				newSieve.sieve(maximum);
				newSieve.nonCrossedOutSubseqToString();
			}
		}
	}

	public boolean[] createSequence(int maximum){
		boolean[] newArray = new boolean[maximum-1];
		for (int index = 0; index < maximum-1; index++){
			newArray[index] = false;
		}
		return newArray;
	}

	public void crossOutHigherMultiples(int operand){
		int maxMultiple = (int)max/operand;
		System.out.println("operand: "+operand+", max: "+maxMultiple);
		for (int counter = 2; counter<=maxMultiple; counter+=1)
		{
			int product = (counter) * operand;
			if (product <= max){
				crossedOut[product-2] = true;
			}
		}
	}

	public boolean[] sieve(int maximum){
		crossedOut = createSequence(maximum);
		max = maximum;
		int counter = 2;
		System.out.println(sequenceToString());
		while (counter <= Math.sqrt(maximum)){
			if (!crossedOut[counter-2])
			{
				crossOutHigherMultiples(counter);
				System.out.println(sequenceToString());
			}
			counter+=1;
		}
		return crossedOut;

	}

	public String sequenceToString(){
		String retstr="";
		if (crossedOut!=null)
  		{
			for(int counter = 0; counter<crossedOut.length-1;counter++){
				if(crossedOut[counter]){
					retstr+="["+(counter+2)+"], ";
				}
				else{
					retstr+=(counter+2)+", ";
				}
			}
			if(crossedOut[crossedOut.length-1]){
				retstr+="["+(crossedOut.length+1)+"]";
			}
			else{
				retstr+=(crossedOut.length+1);
			}
		}
		return retstr;
	}

	public String nonCrossedOutSubseqToString(){
		String retstr="";
		if (crossedOut!=null)
  		{
			for(int counter = 0; counter<=crossedOut.length-1;counter++){
				if(!crossedOut[counter]){
					retstr+=(counter+2)+", ";
				}
			}
			retstr=retstr.substring(0,retstr.length()-2);
		}
		return retstr;
	}

	public static int readIntFromUser(String prompt) 
	{
		Scanner input = new Scanner(System.in);
		boolean firstPass = true;
		do
		{
			if (firstPass)
			{
				firstPass=false;
				System.out.print(prompt);
			}
			else
			{
				if (input.hasNext("quit"))
				{
					quit = true;
				}
				else
				{
					System.out.println("Invalid input. Please enter an int!");
					input.next();
					System.out.print(prompt);
				}
			}
			
		}
		while (!input.hasNextInt() && quit == false);
		int readInt = -1;
		if (!quit)
		{
			readInt = input.nextInt();
		}
		return readInt;
	}
	
}
