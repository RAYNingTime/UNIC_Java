package NewspaperSubscription;

public class PhysicalNewspaperSubscription extends NewspaperSubscription{

	public void setAddress(String addressX)
	{
		this.address = addressX;
		validAddress(); 
	}
	
	void validAddress()
	{
		boolean valid = false;
		
		for (int i = 0; i < getAddress().length(); i++)
			if (getAddress().charAt(i) >= '0' && getAddress().charAt(i) <= '9') {
				super.setRate(15);	
				valid = true;
			}
	
		if (!valid)
			super.setRate(0);
	
	}
}
