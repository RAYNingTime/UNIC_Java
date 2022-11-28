package Excersice4;


public abstract class GeometricFigure {
	private double height;
	private double width;
	private String type;
	private double area;
	
	
	public abstract void clacArea();


	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}


	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}


	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

}
