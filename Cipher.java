import java.util.Scanner;
import java.util.Random;

public class Cipher{
	final static char[] ALPHABET = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static void main(String[] args) {
		while (true) {
			char[] mapping = createCipher();
			String input = readStringFromUser("Enter the sentence to encrypt: ");
			String encrypted = encrypt(input,mapping);
			System.out.println("Encrypted string: "+encrypted);
			System.out.println("Decrypted string: "+decrypt(encrypted,mapping));
		}

	}

	public static char[] createCipher(){
		char[] cipher = ALPHABET.clone();
		Random randomizer = new Random();
		for (int firstElement=0; firstElement<cipher.length; firstElement++)
    	{
      		int swapElement = randomizer.nextInt(cipher.length);
      		char storeFirst = cipher[firstElement];
      		cipher[firstElement] = cipher[swapElement];
      		cipher[swapElement] = storeFirst;
    	}
    	return cipher;
	}

	public static String encrypt(String original, char[] mapping){
		String lowerOriginal = original.toLowerCase();
		char[] arrayLower = lowerOriginal.toCharArray();
		for (int element = 0; element < arrayLower.length; element++){
			int alphabetIndex = -1;
			for (int iterator = 0; iterator < ALPHABET.length && alphabetIndex == -1; iterator++){
				if(ALPHABET[iterator] == arrayLower[element]){
					alphabetIndex = iterator;
				}
			}
			if (alphabetIndex != -1){
				arrayLower[element] = mapping[alphabetIndex];
			}
		}
		return new String(arrayLower);
	}

	public static String decrypt(String original, char[] mapping){
		String lowerOriginal = original.toLowerCase();
		char[] arrayLower = lowerOriginal.toCharArray();
		for (int element = 0; element < arrayLower.length; element++){
			int cipherIndex = -1;
			for (int iterator = 0; iterator < ALPHABET.length && cipherIndex == -1; iterator++){
				if(mapping[iterator] == arrayLower[element]){
					cipherIndex = iterator;
				}
			}
			if (cipherIndex != -1){
				arrayLower[element] = ALPHABET[cipherIndex];
			}
		}
		return new String(arrayLower);
	}

	public static String readStringFromUser(String prompt) 
	{
		Scanner input = new Scanner(System.in);
		boolean firstPass = true;
		do{
			if (firstPass){
				firstPass=false;
			}
			else{
				System.out.println("Invalid input. Please enter an string!");
				input.next();
			}
			System.out.print(prompt);
			
		}
		while (!input.hasNext());
		String readStr = input.nextLine();
		return readStr;
	}


	public static void printArray(char[] toPrint){
		System.out.print("[");
		if (toPrint!=null)
  		{
			for(int counter = 0; counter<toPrint.length-1;counter++)
				System.out.print(toPrint[counter]+", ");
			System.out.print(toPrint[toPrint.length-1]);
		}
		System.out.println("]");
	}
}
