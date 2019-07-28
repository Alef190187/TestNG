package testngframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\alef1\\Desktop\\A L I F\\Selenium Files\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
			
	}
	
	@Test(priority=2,groups="urtTest")
	public void urlTest() {
		String st=driver.getCurrentUrl();
		System.out.println("The current url is:: "+st);
		
	}
	@Test(priority=4, groups="accountTest")
	public void creataccountextTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"content\"]//div[@class='_ihd _3ma mbs _6n _6s _6v']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=1, groups="loginTest")
	public void loginTest() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Alef12321@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Au128991");
		driver.findElement(By.id("u_0_2")).click();;
		
	}
	
	
	@Test(priority=3, groups ="signupTest")
	public void signupdisplayedTest() {
		boolean b = driver.findElement(By.xpath("//button[@id='u_0_y']")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(groups="test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups="test")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups="test")
	public void test3() {
		System.out.println("test3");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
