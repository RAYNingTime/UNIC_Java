import java.util.Scanner;

public class progExNum1 {

	public static void main(String[] args) {
		int integer;
		long longInteger;
		float realNumber;
		double doubleReal;
		String string1;
		String string2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter an integer, a long integer, a floating-point\n"
				+ "number, another floating-point number, and a string.");
		integer = sc.nextInt();
		longInteger = sc.nextInt();
		realNumber = sc.nextFloat();
		doubleReal = sc.nextDouble();
		string1 = sc.next();
		
		System.out.println("Now enter another value.");
		string2 = sc.next();
		
		System.out.println("Here is what you entered:\n"
				+ integer + " " + longInteger + " " + realNumber + " "
				+ doubleReal + " " + string1 + " and " + string2);
		
		sc.close();
	}

}
