package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\alef1\\Desktop\\A L I F\\Selenium Files\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google23" , "title is not matched");
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertEquals(b, true);
	}
   
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
