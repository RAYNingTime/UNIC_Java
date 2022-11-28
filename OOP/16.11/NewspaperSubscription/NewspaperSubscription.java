package NewspaperSubscription;

public abstract class NewspaperSubscription {
	private String name; 
	private int rate;
	
	// CODE DOES NOT WORK IF ADRESS IS PRIVATE
	protected String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}

	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	} 
	
	public abstract void setAddress(String add); 

}
