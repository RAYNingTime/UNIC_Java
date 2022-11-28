package Animal;

public class Animal {
	private int legsNum;
	private String type;
	private boolean domestic;
	
	public Animal() {
		System.out.println("I am Animal class constructor");
	}
	
	public void method_Animal(int legs){
		legsNum = legs;
	}
	
	public String method_Animal(String type){
		this.type = type;
		return "Animal type is " + this.type;
	}

	public boolean method_Animal(boolean domestic){
		this.domestic = domestic;
		return this.domestic;
	}
	
	public String toString() {
		return getClass().getSimpleName();
	}
	
	public void setLegs(int legs) {
		legsNum = legs;
	}

}
