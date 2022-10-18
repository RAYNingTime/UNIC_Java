/*  (Converting an uppercase letter to lowercase)
 * Write a method that converts an uppercase letter to a lowercase letter.
 * Use the following method header:
 * public static char upperCaseToLowerCase(char ch)
 * For example, upperCaseToLowerCase('B') returns b.
 * 
 * Made by Ivan Kosiakov on 17.10.2022
 */


public class ProgEx1b {

	public static void main(String[] args) {
		final char UPPERCASE_LETTER = 'F';
		
		System.out.print("\nThe lower case of " + UPPERCASE_LETTER + " is " + 
		upperCaseToLowerCase(UPPERCASE_LETTER));
	}
	
	public static char upperCaseToLowerCase(char ch) {
		// Increase on 32 and that will change the ASCII code of the upper case letter
		return (char)(ch + 32);
	}
}
