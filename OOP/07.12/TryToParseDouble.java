package TryToParseDouble;
import java.util.Scanner; 

public class TryToParseDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print( "Enter a double number: ");
		String userString = sc.next();
		double doubleConverted;
		try {
			doubleConverted = Double.parseDouble(userString);
		} catch (NumberFormatException e) {
			System.out.println("You entered an invalid double number!");
			doubleConverted = 0;
		}
		
		System.out.print("Your double number is  " + doubleConverted);
		
		sc.close();
	}

}
