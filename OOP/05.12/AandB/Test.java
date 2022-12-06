package AandB;

 // ERROR: Fields of interface always must be public
 // HOW TO FIX: Remove private and protected modifiers or change them to public 

public class Test {

	public static void main(String[] args) {
		Concrete obj = new Concrete();
		
		obj.abs1();
		obj.abs2();
	}

}
