package Tank;

public class Tank {
	static int counter;
	int id = counter++;
	boolean full = false;
	
	public Tank() {
		System.out.println("Tank " + id + " created");
		full = true;
	}
	
	public void fill() {
		full = true;
	}
	
	public void empty() {
		full = false;
	}
	
	public void finalize() {
		if(full) {
			System.out.println("Error: tank " + id + 
								" must be empty at cleanup");
		}
		else {
			System.out.println("Tank " + id + 
					" cleaned up OK");
		}
	}

}
