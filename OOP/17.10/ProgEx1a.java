/*  Suppose that the tuition for a university is 16,000 Euros this year and
 * increases 5% every year. Write a program that uses an instant method of
 * the class Tuition which in within uses a loop to compute the tuition in
 * ten years.
 *  Write another class source-code program TuitionMain with main that
 * computes the total cost of four years' worth of tuition starting ten years
 * from now.
 * 
 * Made by Ivan Kosiakov on 17.10.2022
 */

public class ProgEx1a {
	    public static void main(String[] args) {

	    	final double INCREASE = 0.05;
	    	double totalCost = 0;		// Accumulate total cost of four years tution
			double tuition = 16000;
			double tuitionTenthYear = 0;

			for (int year = 1; year <= 14; year++) {
				// Increase tuition by 5% every year
				tuition += (tuition * INCREASE);  

				if (year > 10) // Test for after 10 years
					totalCost += tuition; // Accumulate tuition cost

				// Cost of tuition in ten years
				if (year == 10)
					tuitionTenthYear = tuition; 
			}

			// Display the cost of tuition in ten years
			System.out.println("Tuition in ten years: $" + tuitionTenthYear);

			// Display the cost of four years' worth of tuition after tenth year
			System.out.println("Total cost for four years' worth of tuition" +
				" after the tenth year: $" + totalCost);
	    }

}
