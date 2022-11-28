package Animal;


public class Dog extends Animal{
	private boolean isHungry;
	
	public Dog() {
		System.out.println("I am Dog class constructor");
	}
	
	// Overload bark
	
	public void bark() {
		System.out.println("Dog is silent");
	}
	
	public void bark(boolean hungry) {
		isHungry = hungry;
		System.out.println("Dog is barking");
	}

	public void bark(String sing) {
		System.out.println("Dog is howling");
	}
	
	// Override method_Animal
	
	public void method_Animal(int legs){
		setLegs(legs);
		System.out.println("Dog have " + legs + " legs");
	}
	
	public String method_Animal(String breed){
		return "Breed of dog is " + breed;
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}

}
