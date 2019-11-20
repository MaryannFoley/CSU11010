import java.util.Scanner;

public class vector{
	public static void main(String[] args) {
		double[] vector = {12, 5};
		System.out.println("magnitude: "+magnitude(vector));
		double[] normalVector = vector.clone();
		normalise(normalVector);
		System.out.println(stringify(vector)+" normalised: "+stringify(normalVector));
		double[] vector2 = {3,4};
		System.out.println("Dot product of "+stringify(vector)+" and "+stringify(vector2)+": "+dotProduct(vector,vector2));
		System.out.println(stringify(vector)+" plus "+stringify(vector2)+": "+stringify(vectorAddition(vector,vector2)));

	}

	public static double magnitude(double[] vector){
		double sum = 0;
		for (int index = 0; index<vector.length; index++){
			sum += vector[index] * vector[index];
		}
		return Math.sqrt(sum);
	}

	public static void normalise(double[] vector){
		double mag = magnitude(vector);
		for (int index = 0; index<vector.length; index++){
			vector[index] = vector[index]/mag;
		}
	}

	public static double dotProduct(double[] firstVector, double[] secondVector){
		if (firstVector.length == secondVector.length){
			double sum = 0;
			for (int index = 0; index<firstVector.length; index++){
				sum += firstVector[index]*secondVector[index];
			}
			return sum;
		}
		return -1;
	}

	public static double[] vectorAddition(double[] firstVector, double[] secondVector){
		if (firstVector.length == secondVector.length){
			double[] newArray = new double[firstVector.length];
			for (int index = 0; index<firstVector.length; index++){
				newArray[index] += firstVector[index]+secondVector[index];
			}
			return newArray;
		}
		return null;
	}

	public static String stringify(double[] vector){
		String str = "[";
		for (int index = 0; index<vector.length-1; index++){
			str += vector[index]+", ";
		}
		str+= vector[vector.length -1]+"]";
		return str;
	}
}