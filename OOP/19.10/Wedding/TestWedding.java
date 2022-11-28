package Wedding;
import java.time.*;

public class TestWedding {

	public static void main(String[] args) {
		LocalDate firstPersonDateOfBirth = LocalDate.of(1998,4,16);
		Person FirstPerson = new Person ("John", "Doe", firstPersonDateOfBirth);
		
		LocalDate secondPersonDateOfBirth = LocalDate.of(2000,2,21);
		Person SecondPerson = new Person ("Michaella", "Addison", secondPersonDateOfBirth);
		
		Couple NewCouple = new Couple(FirstPerson,SecondPerson);
		
		LocalDate weddingDate = LocalDate.of(2022, 10, 28);
		Wedding NewWedding = new Wedding(NewCouple, "Block", weddingDate);
		
		// First person data show
		System.out.println("First Person Info" + 
							"\nFirst Name: " + FirstPerson.getFirstName() +
							"\nLast Name: " + FirstPerson.getLastName() + 
							"\nDate of Birth: " + FirstPerson.getBirthDate() + "\n");
		
		// Second person data show
		System.out.println("Second Person Info" + 
							"\nFirst Name: " + SecondPerson.getFirstName() +
							"\nLast Name: " + SecondPerson.getLastName() + 
							"\nDate of Birth: " + SecondPerson.getBirthDate() + "\n");
		
		// Couples names show
		System.out.println("Couple names: " + NewCouple.getNamesOfCouple() + "\n");
		
		// Wedding data show
		NewWedding.showWeddingInformation();
	}

}
