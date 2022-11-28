package Vehicle;

public class UseVehicle {

	public static void main(String[] args) {
		Car car = new Car(10);
		MotorCycle harley = new MotorCycle(15);
		
		System.out.println(car.toString());
		System.out.println();
		System.out.println(harley.toString());

	}

}
