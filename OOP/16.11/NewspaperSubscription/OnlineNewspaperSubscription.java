package NewspaperSubscription;

public class OnlineNewspaperSubscription extends NewspaperSubscription{

	
	public void setAddress(String addressX)
	{
		this.address = addressX;
		validAddress(); 
	}
	
	void validAddress()
	{
		boolean valid = false;
		
		for (int i = 0; i < getAddress().length(); i++)
			if (getAddress().charAt(i) == '@') {
				super.setRate(9);	
				valid = true;
			}
	
		if (!valid)
			super.setRate(0);
	
	}
}
