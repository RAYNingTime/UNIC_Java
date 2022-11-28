package Lamp;

public class LampClass {
	
	private boolean turnedOn;
	private int powerOfLight;
	
	public LampClass() {
		off();
	};
	
	
	public void off() {
		turnedOn = false;
		powerOfLight = 0;
	}
	
	public void on() {
		turnedOn = true;
		powerOfLight = 5;
	}
	
	public void brighten() {
		if (turnedOn)
			powerOfLight++;
		else 
			System.out.print("You should turn on the light, to change it's power!");
	}
	
	public void dim() {
		if (turnedOn)
			powerOfLight--;
		else 
			System.out.print("You should turn on the light, to change it's power!");
	}
	
	public void setBrightness(int brightness) {
		powerOfLight = brightness;
	}
	
	public boolean getStatus() {
		return turnedOn;
	}
	
	public int getBrightness() {
		return powerOfLight;
	}
	
	public void accessLamp () {
		System.out.print("The lamp is currently turned ");
		
		if (turnedOn)
			System.out.print("on and it's brightness is " + powerOfLight + ".\n");
		else System.out.print("off.\n");
	}
}
