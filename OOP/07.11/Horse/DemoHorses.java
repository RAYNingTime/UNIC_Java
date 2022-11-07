package Horse;

public class DemoHorses {

	public static void main(String[] args) {
		Horse pima = new Horse();
		RaceHorse pilot = new RaceHorse();
		System.out.println();
		
		pima.setName("Larry");
		pima.setColor("Brown");
		pima.setBirthYear(2003);
		pima.MethodHorse();
		
		System.out.println("Name: " + pima.getName());
		System.out.println("Color: " + pima.getColor());
		System.out.println("Birth year: " + pima.getBirthYear());
		System.out.println();
		
		pilot.setName("Pilot");
		pilot.setColor("White");
		pilot.setBirthYear(1990);
		pilot.setRaceNumber(16);
		pilot.MethodHorse();
		
		System.out.println("Name: " + pilot.getName());
		System.out.println("Color: " + pilot.getColor());
		System.out.println("Birth year: " + pilot.getBirthYear());
		System.out.println("Race Number: " + pilot.getRaceNumber());
		

	}

}
