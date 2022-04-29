package stocks;

public class Stock {
	private String symbol;
	private double numberOfShares;
	private double stockPrice;

	public Stock(String symbol, double numberOfShares, double stockPrice) {
		this.symbol = symbol;
		this.numberOfShares = numberOfShares;
		this.stockPrice = stockPrice;
	}

	public double getTotal() {
		return numberOfShares * stockPrice;
	}
	

}
