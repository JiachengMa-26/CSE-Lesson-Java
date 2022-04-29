package stocks_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import stocks.Stock;

public class StockTest {
	
	@Test
	void testGetTotal() {
		Stock stock = new Stock("IBM", 1000, 25);
		assertEquals(25000.0, stock.getTotal(), 0.00001);
	}
}
