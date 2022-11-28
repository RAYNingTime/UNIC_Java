package Candle;

public class ScentedCandle extends Candle{
	private String scent;
	
	public String getScent() {
		return scent;
	}
	
	public void setScent(String scent) {
		this.scent = scent;
	}
	
	public void setHeight(double height, int perInch) {
		super.setHeight(height, perInch);
	}

}
