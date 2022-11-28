package Wedding;
import java.time.*;

public class Person {

	private String firstName;
	private String lastName;
	private LocalDate birthDate; 
	
	public Person(String userFirstName, String userLastName, LocalDate userBirthDate) {
		firstName = userFirstName;
		lastName = userLastName;
		birthDate = userBirthDate;
	}	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
}
