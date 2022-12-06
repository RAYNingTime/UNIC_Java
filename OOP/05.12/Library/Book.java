package Library;

public abstract class Book implements Library {
	private String title;
	private double price;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPages() {
		// Some random amount of pages
		return 500;
	}
	
	public double getPrice() {
		return price;
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
	
	protected void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void setPrice();
}
