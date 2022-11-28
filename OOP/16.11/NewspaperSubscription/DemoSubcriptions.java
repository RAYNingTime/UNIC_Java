package NewspaperSubscription;

public class DemoSubcriptions {

	public static void main(String[] args) {
		// PHYSICAL SUBSCRIPTION
		
		// Not valid physical subscription
		PhysicalNewspaperSubscription firstPhysical = new PhysicalNewspaperSubscription(); 
		firstPhysical.setAddress("NotValidAdress");
		firstPhysical.setName("firstPhysical");
		System.out.println("First Physical Subscription: \nName: " + firstPhysical.getName() 
							+ "\nAddress: " + firstPhysical.getAddress() 
							+ "\nRate: " + firstPhysical.getRate());
		
		System.out.println();
		System.out.println();
		
		// Valid physical subscription
		PhysicalNewspaperSubscription secondPhysical = new PhysicalNewspaperSubscription(); 
		secondPhysical.setAddress("1ValidAdress");
		secondPhysical.setName("secondPhysical");
		System.out.println("Second Physical Subscription: \nName: " + secondPhysical.getName()
							+ "\nAddress: " + secondPhysical.getAddress()
							+ "\nRate: " + secondPhysical.getRate()); 
		
		System.out.println();
		System.out.println();
		
		// ONLINE SUBSCRIPTIONS
		
		// Not valid online subscription
		OnlineNewspaperSubscription firstOnline = new OnlineNewspaperSubscription();
		firstOnline.setAddress("NotValidAdress");
		firstOnline.setName("firstOnline"); 
		System.out.println("First Online Subscription: \nName: " + firstOnline.getName() 
							+ "\nAddress: " + firstOnline.getAddress() 
							+ "\nRate: " + firstOnline.getRate());
		
		System.out.println();
		System.out.println();
		
		// Valid online subscription
		OnlineNewspaperSubscription secondOnline = new OnlineNewspaperSubscription();
		secondOnline.setAddress("@ValidAdress");
		secondOnline.setName("secondOnline");
		System.out.println("Second Online Subscription: \nName: " + secondOnline.getName()
							+ "\nAddress: " + secondOnline.getAddress()
							+ "\nRate: " + secondOnline.getRate()); 
	}

}
