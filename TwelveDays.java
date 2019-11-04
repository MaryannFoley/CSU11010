/* SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5: 5
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
       Mark out of 5: 5
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
       Mark out of 10: 9
   4. Did I indent the code appropriately?
       Mark out of 10: 10 
   5. Did I use an appropriate loop (or loops) to produce the different verses?
       Mark out of 20: 20
   6. Did I use a switch to build up the verses?
       Mark out of 25: 25
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))?
       Mark out of 10: 10
   8. Does the program produce the correct output?
       Mark out of 10: 10
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
   Total Mark out of 100 (Add all the previous marks): 99
*/ 

public class TwelveDays {
	final static int DAYS_OF_CHRISTMAS = 1;
	public static void main(String[] args) {
		
		for (int dayCount = 1;dayCount <= DAYS_OF_CHRISTMAS;dayCount++) {
			String dayString = "";
			switch (dayCount) {
			case 1:
				dayString = "first";
				break;
			case 2:
				dayString = "second";
				break;
			case 3:
				dayString = "third";
				break;
			case 4:
				dayString = "fourth";
				break;
			case 5:
				dayString = "fifth";
				break;
			case 6:
				dayString = "sixth";
				break;
			case 7:
				dayString = "seventh";
				break;
			case 8:
				dayString = "eighth";
				break;
			case 9:
				dayString = "ninth";
				break;
			case 10:
				dayString = "tenth";
				break;
			case 11:
				dayString = "eleventh";
				break;
			default:
				dayString = "twelfth";
				break;
			}
			System.out.println("On the " + dayString + " of Christmas\nMy true love gave to me:");
			
			for (int giftCount = dayCount; giftCount > 0; giftCount --) {
				switch (giftCount) {
				case 1:
					switch (dayCount) {
					case 1:
						System.out.println("A partridge in a pear tree.\n");
						break;
					default:
						System.out.println("And a partridge in a pear tree.\n");
						break;
					}
					break;
				case 2:
					System.out.println("2 turtle doves,");
					break;
				case 3:
					System.out.println("3 French hens,");
					break;
				case 4:
					System.out.println("4 calling birds,");
					break;
				case 5:
					System.out.println("5 gold rings,");
					break;
				case 6:
					System.out.println("6 geese a-laying,");
					break;
				case 7:
					System.out.println("7 swans a-swimming,");
					break;
				case 8:
					System.out.println("8 maids a-milking,");
					break;
				case 9:
					System.out.println("9 ladies dancing,");
					break;
				case 10:
					System.out.println("10 lords a-leaping,");
					break;
				case 11:
					System.out.println("11 pipers piping,");
					break;
				default:
					System.out.println("12 drummers drumming,");
					break;
				}
			}
			
		}
		

	}

}
