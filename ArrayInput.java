import java.util.Scanner;

class ArrayInput{
	static boolean quit = false;

	public static void main(String[] args) 
	{
		int[] intArray = {};
		while(!quit)
		{
			int newInt = readIntFromUser("Enter an integer to add to the array (or 'quit' to finish): ");
			if (!quit)
			{
				intArray = addElement(intArray, newInt);
				double mean = average(intArray);
				System.out.println("The average value is " + ((mean%1==0)?String.format("%.0f",mean):mean) +
					", and "+((increasing(intArray))?"":"not ")+"all values are increasing.");
			}
		}
	}

	public static double average(int[] array)
	{
		double runningTotal = 0.0;
		if (array != null)
		{
			for (int element = 0; element<array.length; element++)
				runningTotal += array[element];
			runningTotal /= array.length; 
		}
		return runningTotal;
	}

	public static boolean increasing(int[] array)
	{
		if (array != null && array.length>0)
		{
			int lastElement=array[0]-1;
			for (int element = 0; element<array.length; element++)
			{
				if (array[element] <= lastElement)
				{
					return false;
				}
				lastElement=array[element];
			}
			return true;
		}
		return false;
	}

	public static int[] addElement(int[] original, int newElement)
	{
		int[] newArray = {};
		if (original == null)
		{
			newArray = new int[1];
		}
		else
		{
			newArray = new int[original.length+1];
			for(int counter = 0; counter<original.length;counter++)
				newArray[counter]=original[counter];
		}
		newArray[newArray.length-1]=newElement;
		return newArray;
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