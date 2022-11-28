package Candle;

public class DemoCandles {

	public static void main(String[] args) {
		Candle candle = new Candle();
		ScentedCandle pineCandle = new ScentedCandle();
		
		candle.setColor("white");
		candle.setHeight(10, 2);
		
		pineCandle.setColor("green");
		pineCandle.setHeight(10, 3);
		pineCandle.setScent("pine");
		
		System.out.println("Candle #1"+ "\nColor: " + candle.getColor()
					+ "\nHeight: " + candle.getHeight()
					+ "\nPrice: " + candle.getPrice());
		
		System.out.println("\nCandle #2"
					+ "\nColor: " + pineCandle.getColor()
					+ "\nHeight: " + pineCandle.getHeight()
					+ "\nScent: " + pineCandle.getScent()
					+ "\nPrice: " + pineCandle.getPrice());

	}

}
