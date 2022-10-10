import java.util.Scanner;

public class progExNum6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int amountOfTerms;
		
		System.out.print("Enter amount of terms: ");
		amountOfTerms = sc.nextInt();
		
		// Counting PI
		double sum = 0;
		for (int i = 1; i < amountOfTerms; i++) {
			sum += Math.pow(-1,i+1) / (2*i - 1);
		} 
		sum = 4 * sum;
		
		System.out.println("\nPI is " + sum);
		
		// Counting Euler's Number (e)
		double eulerNumber = 1, temp = 1;
		for ( int i=1; i <= amountOfTerms; i++) {
            temp = temp * (1.0 / i);
            if ( temp == 0 ) break;
            eulerNumber +=  temp;
        }
		
		System.out.println("e is " + eulerNumber);
		
		sc.close();
	}

}
