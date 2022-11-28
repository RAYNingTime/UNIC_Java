package Wedding;
import java.time.*;

public class Wedding {

	private LocalDate weddingDate; 
	private String partnersNames;
	private String location;
	
	public Wedding(Couple marriageCouple, String locationOfWedding, LocalDate dateOfWedding) {
		partnersNames = marriageCouple.getNamesOfCouple();
		weddingDate = dateOfWedding;
		location = locationOfWedding;
	}
	
	public void showWeddingInformation() {
		System.out.println("The wedding of " + partnersNames + 
				" is going to take a place in " + location + " at " + weddingDate);
	}
	
}
