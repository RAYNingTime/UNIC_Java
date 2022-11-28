package Excersice3;

public class UseChildren {

	public static void main(String[] args) {
		Male maleTest = new Male("Dmitry", 3);
		Female femaleTest = new Female("Eliza", 5);
		
		maleTest.display();
		System.out.println();
		System.out.println();
		femaleTest.display();

	}

}
