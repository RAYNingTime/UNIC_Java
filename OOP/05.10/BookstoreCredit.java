import java.util.Scanner;
public class BookstoreCredit {	
	public static void main(String[] args) {
		final double MAX_GPA = 4.0, MIN_GPA = 0;
		double userGPA;
		String userName;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Dear student, welcome to the grade to credit converter!" +
						"\n\nPlease enter your name: ");
		userName = sc.next();
		
		do {
		System.out.print("Enter your GPA to get a bookstore credit: ");
		userGPA = sc.nextDouble();
		
		if(userGPA > MAX_GPA || userGPA < MIN_GPA)
			System.out.println("Your GPA is out of range! Try again!");
		} while (userGPA > MAX_GPA || userGPA < MIN_GPA);
		
		computeDiscount(userName, userGPA);
		sc.close();
	}

	public static void computeDiscount(String name, double gpa) {
		int creditMultiplier = 10,discount = (int)(gpa * creditMultiplier) ;  
		System.out.print("\n\nDear," + name + "\n\tBecause you GPA is " + gpa + " you've got a " 
				+ discount + "$ credit for a bookstore! Congrats!" + "\nKind regards,\nUniversity Team");
	}
}
