package BadSubscript;
import java.util.Scanner; 

public class BadSabscriptCought {

	public static void main(String[] args) {
		String[] namesArray = {"Ivan", "John", "Jannis", 
								"Vanya", "Alexandr", "Alex",
								"Igor", "Sergei"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "Enter position at the array (1-8)");
		int userNumber = sc.nextInt();
		
		try {
			System.out.print("Name at the position " + userNumber + " is " + namesArray[userNumber - 1]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("You entered a position that is out of range!");
		};
		
		sc.close();

	}

}
