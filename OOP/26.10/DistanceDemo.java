
import java.util.Scanner;

public class DistanceDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double speed = enterSpeed();
		int hours = enterHours();
		
		Distance DistanceClass = new Distance(speed, hours);
		
		System.out.println("The vechicle have traveled " + DistanceClass.getDistance() + " km for " + 
				DistanceClass.getHours() + " hours with speed " + DistanceClass.getSpeed() + " km/h.");
		
	}
	
	static int enterHours() {
		int hours;
		
		do {
		System.out.print("Enter the number of hours it has traveled: ");
		hours = sc.nextInt();
		
		if(hours < 0)
			System.out.println("You've entered a negative value! Try again!");
		} while (hours < 0);
		
		return hours;
	}
	
	static double enterSpeed() {
		double speed;
		
		do {
		System.out.print("Enter the vechicle's speed: ");
		speed = sc.nextDouble();
		
		if(speed < 0)
			System.out.println("You've entered a negative value! Try again!");
		} while (speed < 0);

		return speed;
	}

}
