package TwoMethods;

public class TwoMethods {
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		System.out.println("This is m2 method");
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}

}

