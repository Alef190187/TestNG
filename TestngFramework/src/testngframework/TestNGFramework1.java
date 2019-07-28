package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFramework1 {

	
	WebDriver driver;
	
	

	@BeforeMethod
	public void Setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\alef1\\Desktop\\A L I F\\Selenium Files\\WebDriver\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void gmaillogoTest() {
	boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(b);
	}
	
	@Test(priority=2)
	public void clickongmailTest() {
	
	driver.findElement(By.linkText("Gmail")).click();
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
