package Library;

public class Fiction extends Book implements Library{
	public Fiction() {
		super("Fiction");
		setPrice();
	}
	
	public void setPrice() {
		setPrice(29.99);
	}
	
	public String getName() {
		return name;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public double getArea() {
		return capacity * 2;
	}
}
