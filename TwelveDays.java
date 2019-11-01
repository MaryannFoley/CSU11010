
public class TwelveDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int dayCount = 1;dayCount <= 12;dayCount++) {
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
