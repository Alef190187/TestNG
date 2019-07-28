package testngframework;

import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions =NumberFormatException.class)
	public void exceptionsTest() {
		String x = "1000A";
		Integer.parseInt(x);
	}

}
