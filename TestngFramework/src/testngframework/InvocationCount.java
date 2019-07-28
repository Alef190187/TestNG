package testngframework;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10)
	public void swapingTest() {
		int x=10;
		int y=15;
		
		x =x+y;//25
		y=x-y;//10
		x=x-y;//15
		System.out.println("The x is ::" + x);
		System.out.println("The y is ::" + y);
		
	}
	
	@Test(invocationCount = 10)
	public void swapingTest1() {
		int x=10;
		int y=5;
		
		x = x*y;//50
		y = x/y;//10
		x = x/y;//5
		
		System.out.println("The x is ::" + x);
		System.out.println("The y is ::" + y);
		
	}

}
