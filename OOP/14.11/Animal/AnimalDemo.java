package Animal;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal wolf = new Animal();
		
		System.out.println(wolf.toString());
		wolf.method_Animal(4);
		
		System.out.println(wolf.method_Animal("wolf"));
		
		if(wolf.method_Animal(false)) {
			System.out.println("This animal is domestic");
		}
		else {
			System.out.println("This animal is NOT domestic");
		}
		
		System.out.println();
		Dog retriever = new Dog();
		
		System.out.println(retriever.toString());
		retriever.method_Animal(4);
		System.out.println(retriever.method_Animal("Golden Retrievers"));
		
		retriever.bark();
		retriever.bark(true);
		retriever.bark("bark");
		
	}

}
