import java.util.Scanner;

/* (Converting milliseconds to hours, minutes, and seconds)
 * 
 * Write a method that converts milliseconds to hours, minutes, and
 * seconds using the following header:
 *
 * public String convertMillis(long millis)
 * 
 * The method should return a string as hours:minutes:seconds.
 * 
 * For example, convertMillis(5500) returns a string 0:0:5,
 * convertMillis(100000) returns a string 0:1:40, and
 * convertMillis(555550000) returns a string 154:19:10.
 * 
 * Made by Ivan Kosiakov on 17.10.2022
 */

public class ProgEx2c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long millis;

		
		System.out.print("Enter milliseconds:  ");
		millis = sc.nextLong();
		
		System.out.println("HH:MM:SS - " + convertMillis(millis));
		
		sc.close();
	}
		
		public static String convertMillis(long millis) {
			String currentMinuteAndSecond = "";
			
			// To second
			millis /= 1000;

			for (int i = 0; i < 2; i++) {
				currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
				millis /= 60;
			}
			return millis + currentMinuteAndSecond;
		}

}
