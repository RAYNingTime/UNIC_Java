package Excersice2;

public class StaticString {
	
	private static String firstStatic = "String initialized at definition time";
	private static String secondStatic;
	
	static {
		secondStatic = "String initialized in static block";
	}
	
	public static void print() {
		System.out.println(firstStatic);
		System.out.println(secondStatic);
	}
}
