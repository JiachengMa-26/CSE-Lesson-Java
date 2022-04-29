package stocks_tests;

import org.junit.jupiter.api.Test;

public class StockBagTest {
	@Test
	
	void testGetGrandTotal() {
		StockBag theBag = new StockBag(100);
		theBag.insert("IBM", 100, 25.0);
		theBag.insert("GE", 400, 100);
		assertEquals(40250.00, theBag.getGrandTotal(), 0.00000001);
	}
}
