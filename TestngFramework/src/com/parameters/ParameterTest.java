package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class ParameterTest {
	WebDriver driver;
	@Test
	@Parameters({"browser", "url", "email", "password"})
	public void loginTest(String browser, String url, String email, String password) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\alef1\\Desktop\\A L I F\\Selenium Files\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver,gecko,driver", "C:\\Users\\alef1\\Desktop\\A L I F\\Selenium Files\\WebDriver\\chromedriver_win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			}
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='pass']")).clear();
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		boolean b=driver.findElement(By.xpath("//*[@id='u_0_2']")).isDisplayed();
		System.out.println(b);
		Assert.assertEquals(b, true, "it is false");
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		driver.navigate().back();
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}
	
	

}
