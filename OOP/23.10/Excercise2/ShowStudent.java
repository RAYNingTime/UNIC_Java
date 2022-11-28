package Excercise2;
import java.util.Scanner;

public class ShowStudent {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student StudentClass = new Student(); 
		
		int id = enterID();
		int hours = enterHours();
		int points = enterPoints();
		
		// Initialization check
		StudentClass.setHours(hours);
		StudentClass.setId(id);
		StudentClass.setStudentPoints(points);
		
		StudentClass.calculateAverage();
		
		// Showing check
		StudentClass.showId();
		StudentClass.showPoints();
		StudentClass.showCreditHours();
		StudentClass.showGradeAverage();
	}
	
	static int enterID() {
		int id;
		
		do {
		System.out.print("Enter ID of the Student: ");
		id = sc.nextInt();
		
		if(id < 0)
			System.out.println("You've entered a negative value! Try again!");
		} while (id < 0);
		
		return id;
	}
	
	static int enterHours() {
		int hours;
		
		do {
		System.out.print("Enter Credit Hours of Student: ");
		hours = sc.nextInt();
		
		if(hours < 0)
			System.out.println("You've entered a negative value! Try again!");
		} while (hours < 0);

		return hours;
	}
	
	static int enterPoints() {
		int points;
		
		do {
		System.out.print("Enter Points of Student: ");
		points = sc.nextInt();
		
		if(points < 0)
			System.out.println("You've entered a negative value! Try again!");
		} while (points < 0);

		return points;
	}

}
