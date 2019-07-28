package testngframework;

import org.testng.annotations.Test;

public class TestNGFeatures {
	@Test
	public void loginTest() {
		System.out.println("login page test");
		//int i=11/0;
		
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void HomePageTest() {
		System.out.println("home paget est");
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void SearchpageTest() {
		System.out.println("search page test");
	}
	
	@Test(dependsOnMethods ="loginTest")
	public void registrationTest() {
		System.out.println("reg page test");
	}

}
