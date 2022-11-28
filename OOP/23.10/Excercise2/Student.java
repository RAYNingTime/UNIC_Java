package Excercise2;

public class Student {
	private int studentId;
	private int creditHours;
	private int studentPoints;
	private double gradeAverage;
	
	public Student() {
		studentId = 9999;
		creditHours = 3;
		studentPoints = 12;
		gradeAverage = 0;
	}
	
	// This method calculates the average of the grades
	public void calculateAverage() {
		gradeAverage = (double)(studentPoints / creditHours);
	}
	
	
	// ==== Setting the properties of the class ====
	public void setId(int id) {
		studentId = id;
	}
	
	public void setHours(int hours) {
		creditHours = hours;
	}
	
	public void setStudentPoints(int points) {
		studentPoints = points;
	}
	
	
	// ==== Showing the properties of the class ====
	public void showId() {
		System.out.print("Student ID is:" + studentId);
	}
	
	public void showCreditHours() {
		System.out.print("Credit Hours are:" + creditHours);
	}
	
	public void showPoints() {
		System.out.print("Student points are:" + studentPoints);
	}
	
	public void showGradeAverage() {
		System.out.print("Grade average is:" + gradeAverage);
	}
	
	
	// ==== Getting the properties of the class ====
	public int getId() {
		return studentId;
	}
	
	public int getCreditHours() {
		return creditHours;
	}
	
	public int getPoints() {
		return studentPoints;
	}
	
	public double getGradeAverage() {
		return gradeAverage;
	}
	
}
