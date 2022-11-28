package Wedding;

public class Couple {

	private Person FirstPartner;
	private Person SecondPartner;
	
	public Couple(Person firstPartner, Person secondPartner) {
		FirstPartner = firstPartner;
		SecondPartner = secondPartner;
	}
	
	public String getNamesOfCouple() {
		String names = FirstPartner.getFirstName() + " " + FirstPartner.getLastName() +
				" and " + SecondPartner.getFirstName() + " " + SecondPartner.getLastName();
		
		return names;
	}
	
}
