
public class Controller {
	
	private double temperature;
	
	public Controller() {
		double defaultTemperature = 100.0;
		setTemperature(defaultTemperature);
	};
	
	public Controller(double initialT) {
		setTemperature(initialT);
	}
	
	private void setTemperature(double T) {
		temperature = T;
	}
	
	private double getTemperature() {
		return temperature;
	}
	
	public void accessTemperature() {
		System.out.print(getTemperature());
	}
}
