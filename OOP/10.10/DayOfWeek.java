import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		final int MAX_MONTH = 12, MIN_MONTH = 1, MIN_DAY = 1,MAX_YEAR = 2399, MIN_YEAR = 1700;
		boolean leap;
		int userYear,userMonth,userDay,dayOfTheWeek;
		int[] yearMonthes = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		Scanner sc= new Scanner(System.in);
		
		// Checking if year is in range 
		// NOTE: I created this range to make calculation of the date more correct
		do {
		System.out.print("Enter year: "+ MIN_YEAR +"-"+ MAX_YEAR +": ");
		userYear = sc.nextInt();
		
		if (MIN_YEAR > userYear || userYear > MAX_YEAR)
			System.out.print("\nYou've entered a year out of range!");
		} while (MIN_YEAR > userYear || userYear > MAX_YEAR);
			
		// Checking if year is the leap year
		if (((userYear % 4 == 0) && (userYear % 100!= 0)) || (userYear % 400 == 0)) {
			leap = true;
			System.out.print("\nThis is the leap year!");
			yearMonthes[1]++;
		}
		else {
			leap = false;
			System.out.print("\nThis is the not leap year!");
		}
		
		// Checking if month is valid
		do {
		System.out.print("\nEnter month: 1-12: ");
		userMonth = sc.nextInt();
		
		if (userMonth < MIN_MONTH || userMonth > MAX_MONTH)
			System.out.print("\nYou've entered a month out of range!");
		} while (userMonth < MIN_MONTH || userMonth > MAX_MONTH);
		
		// Checking if day of the month is valid
		do {
			System.out.print("\nEnter the day of the month: 1-" + yearMonthes[userMonth] + ": ");
			userDay = sc.nextInt();
			
			if (userDay < MIN_DAY || userDay > yearMonthes[userMonth])
				System.out.print("\nYou've entered a day out of range!");
		} while (userDay < MIN_DAY || userDay > yearMonthes[userMonth]);
		
		dayOfTheWeek = dayOfWeek(userDay,userMonth,userYear,leap);
		
		switch(dayOfTheWeek) {
		case 0:
		case 6:
			System.out.print("\nIt's a weekend take a rest!");
			break;
		
		case 1: 
			System.out.print("\nIt's a Monday!");
			break;
			
		case 2: 
			System.out.print("\nIt's a Tuesday!");
			break;
			
		case 3: 
			System.out.print("\nIt's a Wednesday!");
			break;
			
		case 4: 
			System.out.print("\nIt's a Thursday!");
			break;
		
		case 5: 
			System.out.print("\nIt's a Friday!");
			break;
		}
		
		sc.close();
	}
	
	// This function checks the day of the week for the corresponding date
	public static int dayOfWeek(int day, int month, int year,boolean leap) {
		int yearCode,monthCode,centuryCode,leapYearCode = 0;
		
		// Calculating Year Code
		int lastDigits = year % 100;
		yearCode = (lastDigits + (lastDigits / 4)) % 7;
		
		// Calculating Month Code
		final int[] allMonthesCodes = {0,3,3,6,1,4,6,2,5,0,3,5};
		monthCode = allMonthesCodes[month-1];
		
		// Calculating Century Code
		int firstDigits = year / 100;
		
		switch(firstDigits){
		case 17:
			centuryCode = 4;
			break;
			
		case 18:
			centuryCode = 2;
			break;
			
		case 19:
			centuryCode = 0;
			break;
		
		case 20:
			centuryCode = 6;
			break;
		
		case 21:
			centuryCode = 4;
			break;
		
		case 22:
			centuryCode = 2;
			break;
		
		case 23:
			centuryCode = 0;
			break;
		
		// This is impossible call default,
		// because in the beginning we are checking a year to be in range >= 1700 && <= 2399
		default: centuryCode = 0; 
		}
		
		// Calculating Leap Year Code
		if(leap)
			leapYearCode = 1;
		
		// Calculating the Day
		return (yearCode + monthCode + centuryCode + day - leapYearCode)%7;
	}

}
