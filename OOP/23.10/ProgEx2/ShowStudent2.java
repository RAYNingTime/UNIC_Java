import java.util.Scanner;

public class ShowStudent2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student StudentClass = new Student(); 
		
		StudentClass.calculateAverage();
		
		System.out.println("FIRST STUDENT\nThe Student with ID: " + StudentClass.getId() + " has " + StudentClass.getPoints() +
				" points for " + StudentClass.getCreditHours() + " credit hours." + 
				"\nHis grade average is " + StudentClass.getGradeAverage());
	}
}
