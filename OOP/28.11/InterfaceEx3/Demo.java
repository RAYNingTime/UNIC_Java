package InterfaceEx3;

/**
	Java interfaces cannot be instantiated on their own, hence interface variables must be static.
The variable must have its value assigned in a static context with no instances.
The final modifier guarantees that the value assigned to the interface variable is an actual constant that cannot be changed. 
*/

interface testInterface{
	int NUM = 10;
}

public class Demo {

	public static void main(String[] args) {
		System.out.println(testInterface.NUM);
		//testInterface.NUM = 25; //If uncomment will give an error

	}

}
