package Lamp;

public class LampTest {

	public static void main(String[] args) {
		LampClass NewLamp = new LampClass();
		
		NewLamp.off();
		NewLamp.accessLamp();
		
		NewLamp.on();
		NewLamp.accessLamp();
		
		NewLamp.brighten();
		NewLamp.brighten();
		System.out.println("Current brightness is " + NewLamp.getBrightness());

		NewLamp.dim();
		System.out.println("Current brightness is " + NewLamp.getBrightness());
		
	}

}
