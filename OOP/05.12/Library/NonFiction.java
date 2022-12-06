package Library;

public final class NonFiction extends Book implements Library{
	protected NonFiction(){
		super("Non Fiction");
		setPrice();
	}

	public void setPrice() {
		setPrice(31.99);
	}
	
	public final String getName() {
		return name;
	}
	
	public final double getCapacity() {
		return capacity;
	}
	
	public final double getArea() {
		return capacity * 2;
	}

}
