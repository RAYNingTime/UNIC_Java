package Excercise1b;


public class Human {
	private String firstName, lastName, middleName;
	
	public Human() {
		this("", "", "");
	}
	
	public Human(String first, String middle, String last) {
		setFullName(first, middle, last);
		if(isFirstName("") && isMiddleName("") && isLastName("")) {
			System.out.println("New human created");
		}
		else {
			System.out.println("Full name of new human is " + getFullName());
		}
	}
	
	public Human(Human otherHuman) {
		this(otherHuman.firstName, otherHuman.middleName, otherHuman.lastName);
	}
	
	private String getFullName() {
		return getFirstName() + " " + getMiddleName() + " " + getLastName();
	}
	
	private void setFullName(String first, String middle, String last) {
		firstName = first;
		lastName = last;
		middleName = middle;
	}
	
	private String getFirstName() {
		return firstName;
	}
	
	private String getMiddleName() {
		return middleName;
	}
	
	private String getLastName() {
		return lastName;
	}
	
	private boolean isLastName(String last) {
		return lastName == last;
	}
	
	private boolean isFirstName(String first) {
		return firstName == first;
	}
	
	private boolean isMiddleName(String middle) {
		return middleName == middle;
	}
	
	

}
