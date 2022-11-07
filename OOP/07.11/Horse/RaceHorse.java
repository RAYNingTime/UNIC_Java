package Horse;

public class RaceHorse extends Horse{
	private int raceNum;
	
	public RaceHorse() {
		System.out.println("I am the default constructor of the class RaceHorse");
	}
	
	public void setRaceNumber(int num) {
		raceNum = num;
	}
	
	public int getRaceNumber() {
		return raceNum;
	}
	
	public void MethodHorse() {
		System.out.println("I am methodHorse in the RaceHorse class");
	}

}
